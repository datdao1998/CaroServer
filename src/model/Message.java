package model;

import java.io.Serializable;

public class Message implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private int code;
    
    private Integer userId;

    
    private Object content;

    public Message() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }
    
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    
}
