package Models;

public final class EstadosModel {
    private String sigla;
    private String nome;
    
    public EstadosModel(){}
    
    public EstadosModel(String sigla, String nome){
        this.sigla = sigla;
        this.nome = nome;
    }
    
    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Estados{" + "sigla=" + sigla + ", nome=" + nome + '}';
    }
}
