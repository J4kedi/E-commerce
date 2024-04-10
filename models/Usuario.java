package models;

public class Usuario {
    private String nome;
    private String email;
    private String userName;
    private String senha;
    private boolean isLogado = false; 

    public Usuario(String nome, String email, String userName, String senha) {
        this.nome = nome;
        this.email = email;
        this.userName = userName;
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSenha() {
        return senha;
    }

    public boolean getIsLogado() {
        return isLogado;
    }

    public void setIsLogado(boolean isLogado) {
        this.isLogado = isLogado;
    }
}