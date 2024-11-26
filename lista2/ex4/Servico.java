package lista2.ex4;

public class Servico extends Produto {
    private Double valorHora;

    public Servico(Integer codigo, String nome, Double valorHora){
        super(codigo, nome);
        this.valorHora = valorHora;
    }

    public Double getValorHora() {
        return valorHora;
    }
    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }
}
