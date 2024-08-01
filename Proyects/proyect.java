/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyects;

import java.util.HashSet;

/**
 *
 * @author Usuario
 */
public class proyect {
    
    private int id;
    private String name;
    private HashSet<Task> task;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public HashSet<Task> getTask() {
        return task;
    }

    public proyect(int id, String name) {
        this.id = id;
        this.name = name;
        this.task = new HashSet();
    }

    public proyect() {
        this(0,"");
    }
    
    public void task(Task tasks){
        task.add(tasks);
    }
    
    
}
