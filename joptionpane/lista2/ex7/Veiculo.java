package joptionpane.lista2.ex7;

public abstract class Veiculo {

    private String modelo;
    private String marca;
    private Double preco;

    public Veiculo(String modelo, String marca, Double preco){
        this.modelo = modelo;
        this.marca = marca;
        this.preco = preco;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public Double getPreco() {
        return preco;
    }
    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public abstract void vender();

    public abstract String exibirDetalhes();

}