/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameserver;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bonacine
 */
public class GameServer {

    private List<User> usuariosOnline;
    private List<User> usuarios;
    private List<String> ranking;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public GameServer() {
        //pegar o ranking
        usuarios = new ArrayList<>();
        usuariosOnline = new ArrayList<>();
    }               
    
    public List<User> getUsuariosOnline() {
        return usuariosOnline;
    }

    public void setUsuariosOnline(List<User> usuariosOnline) {
        this.usuariosOnline = usuariosOnline;
    }

    public List<User> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<User> usuarios) {
        this.usuarios = usuarios;
    }

    public List<String> getRanking() {
        return ranking;
    }

    public void setRanking(List<String> ranking) {
        this.ranking = ranking;
    }
    
    
    
}
