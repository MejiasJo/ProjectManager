/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manage;

import Proyects.proyect;
import java.util.HashSet;
import users.User;

/**
 *
 * @author Johel M
 */
public class Manage {
    private HashSet<proyect> listaProyectos;
    private HashSet<User> listaUsuarios;

    public HashSet<proyect> getListaProyectos() {
        return listaProyectos;
    }

    public HashSet<User> getListaUsuarios() {
        return listaUsuarios;
    }

    public Manage() {
        this.listaProyectos = new HashSet();
        this.listaUsuarios = new HashSet();
    }
    
    public void addProyect(proyect proyect){
        listaProyectos.add(proyect);
    }
    
    public void deleteProyect(proyect proyect){
        listaProyectos.remove(proyect);
    }
    
    public proyect searchProyect(proyect proyect){
        for(proyect pro:this.listaProyectos){
            if(pro.getId()==proyect.getId()){
                return pro;
            }
        }
        return new proyect();
    }
    
    public void addUser(User user){
        listaUsuarios.add(user);
    }
    
    public void deleteUser(User user){
        listaUsuarios.remove(user);
    }
    
    public User searchUser(User user){
        for(User use:this.listaUsuarios){
            if(use.getId().equals(user.getId())){
                return use;
            }
        }
        return new User();
    }
    
}
