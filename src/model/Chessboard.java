package model;

import java.io.Serializable;

public class Chessboard implements Serializable{

    private static final long serialVersionUID = 3L;
    
    private int chessboardId;
    private int chessBox[][];
    private int status;
    private Integer winnerId;
    private Integer loserId;
    private Integer idPlayer1;
    private Integer idPlayer2;

    public Chessboard() {
        this.chessBox = new int[20][20];
        for(int i = 0; i < 20; i ++)
            for(int j = 0; j < 20; j ++)
                this.chessBox[i][j] = 0;
    }

    public int getLoserId() {
        return loserId;
    }

    public void setLoserId(int loserId) {
        this.loserId = loserId;
    }

    public int getChessboardId() {
        return chessboardId;
    }

    public void setChessboardId(int chessboardId) {
        this.chessboardId = chessboardId;
    }

    public int[][] getChessBox() {
        return chessBox;
    }

    public void setChessBox(int[][] chessBox) {
        this.chessBox = chessBox;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getWinnerId() {
        return winnerId;
    }

    public void setWinnerId(int winnerId) {
        this.winnerId = winnerId;
    }

    public int getIdPlayer1() {
        return idPlayer1;
    }

    public void setIdPlayer1(Integer idPlayer1) {
        this.idPlayer1 = idPlayer1;
    }

    public int getIdPlayer2() {
        return idPlayer2;
    }

    public void setIdPlayer2(Integer idPlayer2) {
        this.idPlayer2 = idPlayer2;
    }
    
    
}
