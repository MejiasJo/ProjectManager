/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tasks;

import Comments.Comment;
import java.util.ArrayList;
import users.User;

/**
 *
 * @author Johel M
 */
public class Task {
    private int id;
    private String description;
    private boolean complet;
    private User user;
    private ArrayList<Comment> comments;

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public boolean isComplet() {
        return complet;
    }

    public User getUser() {
        return user;
    }

    public ArrayList<Comment> getComments() {
        return comments;
    }

    public void setComplet(boolean complet) {
        this.complet = complet;
    }
    
    public void addComment(Comment comment){
        comments.add(comment);
    }

    public Task(int id, String description, User user) {
        this.id = id;
        this.description = description;
        this.complet = false;
        this.user = user;
        this.comments = new ArrayList();
    }

    public Task() {
        this(0,"",new User());
    }
    
    
}
