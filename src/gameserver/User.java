/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameserver;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;

/**
 *
 * @author Bonacine
 */
@Entity
public class User {
    private String primeiroNome;
    private String sobrenome;
    private String nick;
    private String senha;       
    private int id;
    private List<User> amigos;
    private int pontuacao;
    private int posicao;
    private boolean conectado;

    public User(String primeiroNome, String sobrenome, String nick, String senha) {
        this.primeiroNome = primeiroNome;
        this.sobrenome = sobrenome;
        this.nick = nick;
        this.senha = senha;
        
        this.conectado = false;
        this.amigos = new ArrayList<>();
        this.pontuacao = 0;
        //criar funcao para gerar o ID.
        //logo apos criar, chamar funcao para calcular posicao
    }

    
    
    public boolean conecta(){
        //chama funcao que conecta/loga usuario        
        //podemos buscar no banco quando  o nick for digitado. Se a senha bater, essa função é chamada.
        //a funcao que ira logar deve modificar a variavel conectado
        return conectado;
    }
    
    public boolean desconecta(){
        //gravar dados no banco, limpar memoria e mudar variavel conectado.
        return conectado;
    }
    
    public int posicaoRanking(){
        //calcula posicao somente do usuario na lista do banco. Atualiza variavel posição e retorna a variavel.
        return posicao;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    public boolean isConectado() {
        return conectado;
    }

    public void setConectado(boolean conectado) {
        this.conectado = conectado;
    }
    
    
    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }
   
    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    @OneToMany
    public List<User> getAmigos() {
        return amigos;
    }

    public void setAmigos(List<User> amigos) {
        this.amigos = amigos;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public boolean isConectato() {
        return conectado;
    }

    public void setConectato(boolean conectato) {
        this.conectado = conectato;
    }
    
    
    
}
