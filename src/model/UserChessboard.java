package model;

import java.io.Serializable;

/**
 *
 * @author ABC
 */
public class UserChessboard implements Serializable {
    
    private static final long serialVersionUID = 4L;
    
    private User user;
    private Chessboard[] chessboard;

    public UserChessboard() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Chessboard[] getChessboard() {
        return chessboard;
    }

    public void setChessboard(Chessboard[] chessboard) {
        this.chessboard = chessboard;
    }

    
    
}
