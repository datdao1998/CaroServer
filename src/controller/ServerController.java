package controller;

import constant.Constant;
import controller.dao.UserDAO;
import java.awt.List;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import model.Chessboard;
import model.Message;
import model.User;
import model.UserChessboard;

/**
 *
 * @author ABC
 */
public class ServerController {
    
    private static Map<Integer, ObjectInputStream> inputs = new HashMap<Integer, ObjectInputStream>();
    private static Map<Integer, ObjectOutputStream> outputs = new HashMap<Integer, ObjectOutputStream>();
    private static Chessboard[] listBoard = new Chessboard[10];

    public ServerController() {
        
    }
    
    public static void main(String[] args) throws Exception {
        System.out.println("The server is running.");
        for(int i = 0; i < 10; i++) {
            listBoard[i] = new Chessboard();
            listBoard[i].setChessboardId(i);
            listBoard[i].setStatus(Constant.BOARD_STATUS_EMPTY);
        }
        ServerSocket listener = new ServerSocket(8888);
        try {
            while (true) {
                new Handler(listener.accept()).start();
            }
        } finally {
            listener.close();
        }
    }
    
    private static class Handler extends Thread {
        private Integer userId;
        private Socket socket;
        private ObjectInputStream in;
        private ObjectOutputStream out;

        public Handler(Socket socket) {
            this.socket = socket;
        }

        public void run() {
            try {
                UserDAO userDAO = new UserDAO();
                in = new ObjectInputStream(this.socket.getInputStream());
                out = new ObjectOutputStream(this.socket.getOutputStream());

                while (true) {
                    Message message = (Message) in.readObject();
                    if (message == null) {
                        return;
                    }
                    if(message.getCode() == Constant.CLIENT_CODE_LOGIN) {
                        String content = (String) message.getContent();
                        String[] str = content.split(" ");
                        String userName = str[0];
                        String password = str[1];
                        User user = userDAO.getByUserName(userName);
                        if(user.getId() == null || !(user.getPassword().equals(password))) {
                            Message message1 = new Message();
                            message1.setCode(Constant.SERVER_CODE_LOGIN);
                            message1.setContent(null);
                            message1.setUserId(null);
                            out.writeObject(message1);
                        }
                        else {
                            this.userId = user.getId();
                            Message message1 = new Message();
                            message1.setCode(Constant.SERVER_CODE_LOGIN);
                            UserChessboard content1 = new UserChessboard();
                            content1.setUser(user);
                            content1.setChessboard(listBoard);
                            message1.setContent(content1);
                            message1.setUserId(user.getId());
                            out.writeObject(message1);
                            outputs.put(this.userId, out);
                            break;
                        }
                    }
                    if (message.getCode() == Constant.CLIENT_CODE_SIGNUP) {
                        User content = (User) message.getContent();
                        if (userDAO.getByUserName(content.getUserName()).getId() != null) {
                            Message message1 = new Message();
                            message1.setCode(Constant.SERVER_CODE_SIGNUP);
                            message1.setContent(Constant.USER_NAME_EXISTED_CODE);
                            message1.setUserId(null);
                            out.writeObject(message1);
                        }
                        else {
                            boolean isCreated = userDAO.create(content);
                            if (isCreated) {
                                Message message1 = new Message();
                                message1.setCode(Constant.SERVER_CODE_SIGNUP);
                                message1.setContent(Constant.SIGN_UP_SUCCESS_CODE);
                                message1.setUserId(null);
                                out.writeObject(message1);
                            }
                            else {
                                Message message1 = new Message();
                                message1.setCode(Constant.SERVER_CODE_SIGNUP);
                                message1.setContent(Constant.SIGN_UP_FAIL_CODE);
                                message1.setUserId(null);
                                out.writeObject(message1);
                            }
                        }
                    }
                }

                while (true) {
                    Message message = (Message) in.readObject();
                    if(message != null) {
                        if(message.getCode() == Constant.CLIENT_CODE_JOIN_ROOM) {
                            Integer userId = message.getUserId();
                            Integer room = (Integer) message.getContent();
                            Integer roomStatus = listBoard[room].getStatus();

                            if(roomStatus == Constant.BOARD_STATUS_HAS_2_PLAYER) {
                                Message message1 = new Message();
                                message1.setCode(Constant.SERVER_CODE_JOIN_ROOM);
                                message1.setContent(roomStatus);
                                out.writeObject(message1);
                            }
                            if(roomStatus == Constant.BOARD_STATUS_PLAYING) {
                                Message message1 = new Message();
                                message1.setCode(Constant.SERVER_CODE_JOIN_ROOM);
                                message1.setContent(roomStatus);
                                out.writeObject(message1);
                            }
                            if(roomStatus == Constant.BOARD_STATUS_EMPTY) {
                                listBoard[room].setIdPlayer1(userId);
                                Message message1 = new Message();
                                message1.setCode(Constant.SERVER_CODE_JOIN_ROOM);
                                message1.setContent(roomStatus);
                                out.writeObject(message1);
                                
                                listBoard[room].setStatus(Constant.BOARD_STATUS_HAS_1_PLAYER);
                            }
                            if(roomStatus == Constant.BOARD_STATUS_HAS_1_PLAYER) {
                                listBoard[room].setIdPlayer2(userId);
                                Message message1 = new Message();
                                message1.setCode(Constant.SERVER_CODE_JOIN_ROOM);
                                message1.setContent(roomStatus);
                                out.writeObject(message1);
                                
                                Integer idPlayer1 = listBoard[room].getIdPlayer1();
                                User player1 = userDAO.getById(idPlayer1);
                                Message message2 = new Message();
                                message2.setCode(Constant.SERVER_CODE_PLAYER_INFO);
                                message2.setContent(player1);
                                out.writeObject(message2);
                                
                                User player2 = userDAO.getById(userId);
                                Message message3 = new Message();
                                message3.setCode(Constant.SERVER_CODE_PLAYER_INFO);
                                message3.setContent(player2);
                                outputs.get(listBoard[room].getIdPlayer1()).writeObject(message3);
                                
                                listBoard[room].setStatus(Constant.BOARD_STATUS_HAS_2_PLAYER);
                            }
                        }
                    }          
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                if (out != null) {
                    for(int i = 0; i < 10; i++) {
                        if(listBoard[i].getIdPlayer1() == userId) {
                            Integer status = listBoard[i].getStatus();
                            listBoard[i].setStatus(status - 1);
                            listBoard[i].setIdPlayer1(listBoard[i].getIdPlayer2());
                            listBoard[i].setIdPlayer2(null);
                        }
                        if(listBoard[i].getIdPlayer2() == userId) {
                            Integer status = listBoard[i].getStatus();
                            listBoard[i].setStatus(status - 1);
                            listBoard[i].setIdPlayer2(null);
                        }
                    }
                    outputs.remove(userId);
                }
                try {
                    socket.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
    
}
