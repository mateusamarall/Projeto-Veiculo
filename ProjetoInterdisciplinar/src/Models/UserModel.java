package Models;

public final class UserModel {
    private String login;
    private String nome;
    private int senha;
    
    public UserModel(){}

    public UserModel(String login, String nome, int senha) {
        this.login = login;
        this.nome = nome;
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "UserModel{" + "login=" + login + ", nome=" + nome + ", senha=" + senha + '}';
    }
}
