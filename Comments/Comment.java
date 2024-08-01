/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comments;

import users.User;

/**
 *
 * @author Usuario
 */
public class Comment {
    
    private int id;
    private User user;
    private Comment comment;

    public int getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public Comment(int id, User user, Comment comment) {
        this.id = id;
        this.user = user;
        this.comment = comment;
    }

    public Comment() {
        this(0,new User(),null);
    }
    
    
    
    
    
    
    
}
