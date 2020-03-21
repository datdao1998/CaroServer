/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.dao;

import controller.utils.MySQLConnUtils;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;
import model.User;

/**
 *
 * @author ABC
 */
public class UserDAO {
    
    private Connection connection;

    public UserDAO() throws SQLException, ClassNotFoundException {
        this.connection = MySQLConnUtils.getMySQLConnection();
    }
    
    public User getByUserName(String userName) {
        User user = new User();
        
        String query = "SELECT * FROM user WHERE user_name=?";
        try {
            PreparedStatement statement = this.connection.prepareStatement(query);
            statement.setString(1, userName);
            ResultSet resultSet = statement.executeQuery();
            while ( resultSet.next()) {
                user.setId(resultSet.getInt("id"));
                user.setUserName(resultSet.getString("user_name"));
                user.setPassword(resultSet.getString("password"));
                user.setScore(resultSet.getInt("score"));
                user.setName(resultSet.getString("name"));
                user.setBirth_year(resultSet.getInt("birth_year"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }
    
    public boolean create(User user) {
        String query="INSERT INTO user(user_name, password, score, name, birth_year) VALUE(?,?,?,?,?)";
        try {
            PreparedStatement statement = this.connection.prepareStatement(query);
            statement.setString(1, user.getUserName());
            statement.setString(2, user.getPassword());
            statement.setInt(3, user.getScore());
            statement.setString(4, user.getName());
            statement.setInt(5, user.getBirth_year());
            statement.executeUpdate();     
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
    
    public User getById(Integer id) {
        User user = new User();
        
        String query = "SELECT * FROM user WHERE id=?";
        try {
            PreparedStatement statement = this.connection.prepareStatement(query);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            while ( resultSet.next()) {
                user.setId(resultSet.getInt("id"));
                user.setUserName(resultSet.getString("user_name"));
                user.setPassword(resultSet.getString("password"));
                user.setScore(resultSet.getInt("score"));
                user.setName(resultSet.getString("name"));
                user.setBirth_year(resultSet.getInt("birth_year"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }
    
    public User changePassword(User user) {
        
        return user;
    }
}
