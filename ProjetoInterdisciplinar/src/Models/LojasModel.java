package Models;

public final class LojasModel {
    private String loja_nome;
    private String loja_id;
    
    public LojasModel(){};

    public LojasModel(String loja_nome, String loja_id) {
        this.loja_nome = loja_nome;
        this.loja_id = loja_id;
    }

    public String getLoja_nome() {
        return loja_nome;
    }

    public void setLoja_nome(String loja_nome) {
        this.loja_nome = loja_nome;
    }

    public String getLoja_id() {
        return loja_id;
    }

    public void setLoja_id(String loja_id) {
        this.loja_id = loja_id;
    }

    @Override
    public String toString() {
        return "LojasModel{" + "loja_nome=" + loja_nome + ", loja_id=" + loja_id + '}';
    }
    
    
}
