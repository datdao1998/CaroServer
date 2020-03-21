/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import constant.Constant;
import controller.*;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import model.Chessboard;
import model.User;
import model.UserChessboard;

/**
 *
 * @author ABC
 */
public class ClientView extends javax.swing.JFrame implements MouseListener {
    
    private ClientController controller;
    private User user;
    private User competitor;
    private JLabel box[][];

    public ClientView() {
        user = new User();
        competitor = new User();
        controller = new ClientController();
        initComponents();
        getContentPane().setLayout(null);
        this.matchView.setLayout(null);
        this.jPanel1.setBounds(0, 0, 600, 600);
        box=new JLabel[20][20];
        jPanel1.setLayout(new GridLayout(20,20));
        //banco.setSize(10000, 10000);
        for(int i=0;i<20;i++)
            for(int j=0;j<20;j++){
                box[i][j]=new javax.swing.JLabel();
                box[i][j].setFont(new java.awt.Font("Viner Hand ITC", 0, 32));
                box[i][j].setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                box[i][j].setBorder(javax.swing.BorderFactory.createEtchedBorder());
                box[i][j].addMouseListener(this);
                this.jPanel1.add(box[i][j]);
            }
        this.setVisible(true);
        this.loginView.setVisible(true);
        this.roomView.setVisible(false);
        this.matchView.setVisible(false);
        this.signUpView.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginView = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        inputLogintUserName = new javax.swing.JTextField();
        inputLoginPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        btnSignUp = new javax.swing.JButton();
        textAuthentication = new javax.swing.JLabel();
        roomView = new javax.swing.JPanel();
        btnJoinRoom = new javax.swing.JButton();
        btnHistories = new javax.swing.JButton();
        btnRank = new javax.swing.JButton();
        btnChangeInfo = new javax.swing.JButton();
        btnChangePass = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        labelName = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        labelBirth = new javax.swing.JLabel();
        labelScore = new javax.swing.JLabel();
        listRoom = new java.awt.List();
        matchView = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        signUpView = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnLogin1 = new javax.swing.JButton();
        btnSignUp1 = new javax.swing.JButton();
        inputSignUpUserName = new javax.swing.JTextField();
        inputSignUpPassword = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        inputSignUpBirth = new javax.swing.JTextField();
        inputSignUpName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 60)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jLabel1.setText("Cờ Caro");

        jLabel2.setText("Tên đăng nhập:");

        jLabel3.setText(" Mật khẩu        :");

        inputLogintUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputLogintUserNameActionPerformed(evt);
            }
        });

        btnLogin.setText("Đăng nhập");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnSignUp.setText("Đăng ký");
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });

        textAuthentication.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout loginViewLayout = new javax.swing.GroupLayout(loginView);
        loginView.setLayout(loginViewLayout);
        loginViewLayout.setHorizontalGroup(
            loginViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginViewLayout.createSequentialGroup()
                .addGap(235, 235, 235)
                .addComponent(textAuthentication, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 426, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginViewLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(loginViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(loginViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(loginViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(loginViewLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(inputLoginPassword))
                            .addGroup(loginViewLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(inputLogintUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginViewLayout.createSequentialGroup()
                            .addGap(108, 108, 108)
                            .addGroup(loginViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(69, 69, 69))))
                .addGap(309, 309, 309))
        );
        loginViewLayout.setVerticalGroup(
            loginViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginViewLayout.createSequentialGroup()
                .addContainerGap(184, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(loginViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(inputLogintUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(loginViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(inputLoginPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnLogin)
                .addGap(18, 18, 18)
                .addComponent(btnSignUp)
                .addGap(61, 61, 61)
                .addComponent(textAuthentication, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );

        btnJoinRoom.setText("VÀO PHÒNG");
        btnJoinRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJoinRoomActionPerformed(evt);
            }
        });

        btnHistories.setText("Xem lịch sử đấu");
        btnHistories.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistoriesActionPerformed(evt);
            }
        });

        btnRank.setText("Xem bảng xếp hạng");

        btnChangeInfo.setText("Sửa thông tin cá nhân");
        btnChangeInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeInfoActionPerformed(evt);
            }
        });

        btnChangePass.setText("Đổi mật khẩu");
        btnChangePass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePassActionPerformed(evt);
            }
        });

        jLabel7.setText("Thông tin cá nhân");

        jLabel8.setText("Tên:");

        jLabel10.setText("Năm sinh:");

        jLabel11.setText("Điểm số:");

        javax.swing.GroupLayout roomViewLayout = new javax.swing.GroupLayout(roomView);
        roomView.setLayout(roomViewLayout);
        roomViewLayout.setHorizontalGroup(
            roomViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roomViewLayout.createSequentialGroup()
                .addGroup(roomViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roomViewLayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(btnJoinRoom))
                    .addGroup(roomViewLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(listRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 188, Short.MAX_VALUE)
                .addGroup(roomViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roomViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnChangeInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRank, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnHistories, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnChangePass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roomViewLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(30, 30, 30))
                    .addGroup(roomViewLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(roomViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(roomViewLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelScore, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                                .addGap(1, 1, 1))
                            .addGroup(roomViewLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(roomViewLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelBirth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(59, 59, 59))
        );
        roomViewLayout.setVerticalGroup(
            roomViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roomViewLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roomViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(roomViewLayout.createSequentialGroup()
                        .addGroup(roomViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(roomViewLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(9, 9, 9)
                                .addGroup(roomViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelName, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10))
                            .addComponent(labelBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(roomViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(labelScore, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addComponent(btnHistories)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRank)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnChangeInfo))
                    .addComponent(listRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roomViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnJoinRoom)
                    .addComponent(btnChangePass))
                .addGap(0, 349, Short.MAX_VALUE))
        );

        matchView.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                matchViewComponentShown(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 556, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 596, Short.MAX_VALUE)
        );

        jLabel13.setText("Bạn:");

        jLabel14.setText("jLabel14");

        jLabel15.setText("jLabel15");

        jLabel16.setText("Đối thủ:");

        jLabel17.setText("jLabel17");

        jLabel18.setText("jLabel18");

        javax.swing.GroupLayout matchViewLayout = new javax.swing.GroupLayout(matchView);
        matchView.setLayout(matchViewLayout);
        matchViewLayout.setHorizontalGroup(
            matchViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(matchViewLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(matchViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 113, Short.MAX_VALUE))
        );
        matchViewLayout.setVerticalGroup(
            matchViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(matchViewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 56)); // NOI18N
        jLabel4.setText("Đăng ký");

        jLabel5.setText("Tên đăng nhập:");

        jLabel6.setText("Mật khẩu         :");

        btnLogin1.setText("Đăng nhập");
        btnLogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogin1ActionPerformed(evt);
            }
        });

        btnSignUp1.setText("Đăng ký");
        btnSignUp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUp1ActionPerformed(evt);
            }
        });

        jLabel9.setText("Năm sinh         :");

        jLabel12.setText("Tên                  :");

        javax.swing.GroupLayout signUpViewLayout = new javax.swing.GroupLayout(signUpView);
        signUpView.setLayout(signUpViewLayout);
        signUpViewLayout.setHorizontalGroup(
            signUpViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signUpViewLayout.createSequentialGroup()
                .addGap(317, 317, 317)
                .addGroup(signUpViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addGroup(signUpViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(signUpViewLayout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(inputSignUpBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(signUpViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(signUpViewLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputSignUpPassword))
                            .addGroup(signUpViewLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputSignUpUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(signUpViewLayout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(inputSignUpName, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(326, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signUpViewLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(signUpViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSignUp1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogin1))
                .addGap(377, 377, 377))
        );
        signUpViewLayout.setVerticalGroup(
            signUpViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signUpViewLayout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jLabel4)
                .addGap(26, 26, 26)
                .addGroup(signUpViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(inputSignUpName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(signUpViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(inputSignUpBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(signUpViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(inputSignUpUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(signUpViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(inputSignUpPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(btnSignUp1)
                .addGap(18, 18, 18)
                .addComponent(btnLogin1)
                .addContainerGap(143, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(roomView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(matchView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(signUpView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(roomView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(matchView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(signUpView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputLogintUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputLogintUserNameActionPerformed

    }//GEN-LAST:event_inputLogintUserNameActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String userName = this.inputLogintUserName.getText();
        String password = this.inputLoginPassword.getText();
        try {
            this.controller.sendLoginMessage(userName, password);
            Object message = this.controller.receiveContentMessage();
            if(message != null) {
                UserChessboard uc = (UserChessboard) message;
                user = uc.getUser();
                Chessboard[] listBoard = uc.getChessboard();
                this.listRoom.removeAll();
                for (int i = 0; i < 10; i++) {
                    String temp = new String();
                    if(listBoard[i].getStatus() == Constant.BOARD_STATUS_EMPTY) temp = "2 chỗ trống.";
                    if(listBoard[i].getStatus() == Constant.BOARD_STATUS_HAS_1_PLAYER) temp = "1 chỗ trống.";
                    if(listBoard[i].getStatus() == Constant.BOARD_STATUS_HAS_2_PLAYER) temp = "Đã đầy.";
                    if(listBoard[i].getStatus() == Constant.BOARD_STATUS_PLAYING) temp = "Đang chơi.";
                    this.listRoom.add("Phòng " + (i+1) + ": " + temp);
                }
                this.listRoom.select(0);
                this.labelName.setText(user.getName());
                this.labelBirth.setText(String.valueOf(user.getBirth_year()));
                this.labelScore.setText(String.valueOf(user.getScore()));
                this.loginView.setVisible(false);
                this.roomView.setVisible(true);
            }
            else {
                JOptionPane.showMessageDialog(this, "Sai thông tin đăng nhập!");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        this.loginView.setVisible(false);
        this.signUpView.setVisible(true);
    }//GEN-LAST:event_btnSignUpActionPerformed

    private void btnLogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogin1ActionPerformed
        this.loginView.setVisible(true);
        this.signUpView.setVisible(false);
    }//GEN-LAST:event_btnLogin1ActionPerformed

    private void btnSignUp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUp1ActionPerformed
        String userName = this.inputSignUpUserName.getText();
        String password = this.inputSignUpPassword.getText();
        String name = this.inputSignUpName.getText();
        String birthYear = this.inputSignUpBirth.getText();
        try {
            this.controller.sendSignUpMessage(userName, password, name, birthYear);
            Integer message = (Integer) this.controller.receiveContentMessage();
            if (message.equals(Constant.USER_NAME_EXISTED_CODE)) {
                JOptionPane.showMessageDialog(this, "Tên đăng nhập đã tồn tại.");
            }
            if (message.equals(Constant.SIGN_UP_FAIL_CODE)) {
                JOptionPane.showMessageDialog(this, "Không thành công. Có lỗi gì đó.");
            }
            else {
                JOptionPane.showMessageDialog(this, "Đăng ký thành công.");
                this.loginView.setVisible(true);
                this.signUpView.setVisible(false);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnSignUp1ActionPerformed

    private void btnChangePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnChangePassActionPerformed

    private void btnChangeInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeInfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnChangeInfoActionPerformed

    private void btnHistoriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistoriesActionPerformed
        
        
    }//GEN-LAST:event_btnHistoriesActionPerformed

    private void btnJoinRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJoinRoomActionPerformed
        Integer room = this.listRoom.getSelectedIndex();
        try {
            this.controller.sendJoinRoomMessage(user.getId(), room);
            Integer content = (Integer) this.controller.receiveContentMessage();
            if( content == Constant.BOARD_STATUS_HAS_2_PLAYER) {
                JOptionPane.showMessageDialog(this, "Phòng đã đầy. Nhấn refresh để xem trạng thái mới nhất của các phòng.");
            }
            if( content == Constant.BOARD_STATUS_PLAYING) {
                JOptionPane.showMessageDialog(this, "Phòng đã đầy. Nhấn refresh để xem trạng thái mới nhất của các phòng.");
            }
            if( content == Constant.BOARD_STATUS_EMPTY) {
                this.jLabel14.setText(user.getName());
                this.jLabel15.setText("Điểm: " + user.getScore());
                this.roomView.setVisible(false);
                this.matchView.setVisible(true);
            }
            if( content == Constant.BOARD_STATUS_HAS_1_PLAYER) {
                this.jLabel14.setText(user.getName());
                this.jLabel15.setText("Điểm: " + user.getScore());
                competitor = (User) this.controller.receiveContentMessage();
                this.jLabel17.setText(competitor.getName());
                this.jLabel18.setText("Điểm: " + competitor.getScore());
                this.roomView.setVisible(false);
                this.matchView.setVisible(true);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnJoinRoomActionPerformed

    private void matchViewComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_matchViewComponentShown
        
        if(evt.getSource().equals(this.matchView)) {
            try {
                competitor = this.controller.waitCompetitor();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            this.jLabel17.setText(competitor.getName());
            this.jLabel18.setText("Điểm: " + competitor.getScore());
        };
    }//GEN-LAST:event_matchViewComponentShown

    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChangeInfo;
    private javax.swing.JButton btnChangePass;
    private javax.swing.JButton btnHistories;
    private javax.swing.JButton btnJoinRoom;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLogin1;
    private javax.swing.JButton btnRank;
    private javax.swing.JButton btnSignUp;
    private javax.swing.JButton btnSignUp1;
    private javax.swing.JPasswordField inputLoginPassword;
    private javax.swing.JTextField inputLogintUserName;
    private javax.swing.JTextField inputSignUpBirth;
    private javax.swing.JTextField inputSignUpName;
    private javax.swing.JPasswordField inputSignUpPassword;
    private javax.swing.JTextField inputSignUpUserName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelBirth;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelScore;
    private java.awt.List listRoom;
    private javax.swing.JPanel loginView;
    private javax.swing.JPanel matchView;
    private javax.swing.JPanel roomView;
    private javax.swing.JPanel signUpView;
    private javax.swing.JLabel textAuthentication;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mouseClicked(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
