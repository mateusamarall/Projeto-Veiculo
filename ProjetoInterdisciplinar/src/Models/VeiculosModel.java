package Models;

public final class VeiculosModel {
    private String placa;
    private float preco;
    private int ano;
    private String marca_nome;
    private LojasModel loja_id;
    private EstadosModel estado;
    private MarcaModeloModel modelo_nome;
    
    
    public VeiculosModel(){}

    public VeiculosModel(String placa, float preco, int ano, String marca_nome, LojasModel loja_id, EstadosModel estado, MarcaModeloModel modelo_nome) {
        this.placa = placa;
        this.preco = preco;
        this.ano = ano;
        this.marca_nome = marca_nome;
        this.loja_id = loja_id;
        this.estado = estado;
        this.modelo_nome = modelo_nome;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getMarca_nome() {
        return marca_nome;
    }

    public void setMarca_nome(String marca_nome) {
        this.marca_nome = marca_nome;
    }

    public LojasModel getLoja_id() {
        return loja_id;
    }

    public void setLoja_id(LojasModel loja_id) {
        this.loja_id = loja_id;
    }

    public EstadosModel getEstado() {
        return estado;
    }

    public void setEstado(EstadosModel estado) {
        this.estado = estado;
    }

    public MarcaModeloModel getModelo_nome() {
        return modelo_nome;
    }

    public void setModelo_nome(MarcaModeloModel modelo_nome) {
        this.modelo_nome = modelo_nome;
    }

    @Override
    public String toString() {
        return "VeiculosModel{" + "placa=" + placa + ", preco=" + preco + ", ano=" + ano + ", marca_nome=" + marca_nome + ", loja_id=" + loja_id + ", estado=" + estado + ", modelo_nome=" + modelo_nome + '}';
    }
    
   
}
