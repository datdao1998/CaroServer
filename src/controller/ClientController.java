package controller;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import model.Message;
import constant.*;
import java.io.IOException;
import model.User;

public class ClientController {
    
    private Socket socket;
    private ObjectInputStream in;
    private ObjectOutputStream out;

    public ClientController() {
        
        try {
            socket = new Socket("localhost", 8888);
            out = new ObjectOutputStream(socket.getOutputStream());
            in = new ObjectInputStream(socket.getInputStream());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    public void sendLoginMessage(String userName, String password) throws IOException {
        Message message = new Message();
        message.setCode(Constant.CLIENT_CODE_LOGIN);
        String content = userName + " " + password;
        message.setContent(content);
        out.writeObject(message);
    }
    
    public void sendSignUpMessage(String userName, String password, String name, String birthYear) throws IOException {
        Message message = new Message();
        message.setCode(Constant.CLIENT_CODE_SIGNUP);
        User user = new User();
        user.setUserName(userName);
        user.setPassword(password);
        user.setName(name);
        user.setBirth_year(Integer.parseInt(birthYear));
        user.setScore(0);
        message.setContent(user);
        out.writeObject(message);
    }
    
    public void sendJoinRoomMessage(Integer userId, Integer room) throws IOException {
        Message message = new Message();
        message.setCode(Constant.CLIENT_CODE_JOIN_ROOM);
        message.setUserId(userId);
        message.setContent(room);
        out.writeObject(message);
    }
    
    public Object receiveContentMessage() throws IOException, ClassNotFoundException {
        Message message = (Message) in.readObject();
        return message.getContent();
    }
    
    public User waitCompetitor() throws IOException, ClassNotFoundException {
        while(true) {
            Message message = (Message) in.readObject();
            if(message != null) {
                return (User) message.getContent();
            }
        }
    }
}
