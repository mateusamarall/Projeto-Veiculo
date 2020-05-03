package Models;

public final class MarcaModeloModel {
    private String marca_nome;
    private String modelo_nome;
    
    public MarcaModeloModel(){}
    
    public MarcaModeloModel(String marca_nome, String modelo_nome){
        this.marca_nome = marca_nome;
        this.modelo_nome = modelo_nome;
    }

    public String getMarca_nome() {
        return marca_nome;
    }

    public void setMarca_nome(String marca_nome) {
        this.marca_nome = marca_nome;
    }

    public String getModelo_nome() {
        return modelo_nome;
    }

    public void setModelo_nome(String modelo_nome) {
        this.modelo_nome = modelo_nome;
    }

    @Override
    public String toString() {
        return "MarcaModeloModel{" + "marca_nome=" + marca_nome + ", modelo_nome=" + modelo_nome + '}';
    }
    
    
}
