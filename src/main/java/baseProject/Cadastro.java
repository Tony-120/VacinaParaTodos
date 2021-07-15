/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseProject;

/**
 *
 * @author Cauet Damasceno
 */
public class Cadastro {

    private int iduser;
    private String nome;
    private String fone;
    private String login;
    private String senha;
    private String perfil;

    public Cadastro() {
    }

    /**
     *
     * @param nome
     * @param fone
     * @param login
     * @param senha
     * @param perfil
     */
    
    public Cadastro(String usuario, String fone, String login, String senha, String perfil) {
        this.nome = usuario;
        this.fone = fone;
        this.login = login;
        this.senha = senha;
        this.perfil = perfil;
    }

    /**
     *
     * @param iduser
     * @param nome
     * @param fone
     * @param login
     * @param senha
     * @param perfil
     */
    public Cadastro(int iduser, String nome, String fone, String login, String senha, String perfil) {
        this.iduser = iduser;
        this.nome = nome;
        this.fone = fone;
        this.login = login;
        this.senha = senha;
        this.perfil = perfil;
    }

    public Cadastro(int iduser) {
        this.iduser = iduser;
    }

    public int getIduser() {
        return iduser;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

}
