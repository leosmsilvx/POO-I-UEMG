package lista2.ex4;

public class Mercadoria extends Produto{
    private Double peso;

    public Mercadoria(Integer codigo, String nome, Double peso){
        super(codigo, nome);
        this.peso = peso;
    }

    public Double getPeso() {
        return peso;
    }
    public void setPeso(Double peso) {
        this.peso = peso;
    }



}
