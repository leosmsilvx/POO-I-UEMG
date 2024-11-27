package joptionpane.lista2.ex7;

public class Caminhao extends Veiculo implements Financiavel{

    public Caminhao(String modelo, String marca, Double preco){
        super(modelo, marca, preco);
    }

    public String exibirDetalhes() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Caminhao: " + getModelo() + "\n");
        stringBuilder.append("  - Marca: " + getMarca() + "\n");
        stringBuilder.append("  - Preço: " + getPreco() + "\n");
        return stringBuilder.toString();
    }
    
    public void vender() {
        //Metodo sem instrução de uso!
    }

    public Double calcularParcela(Integer numMeses) {
        return (getPreco() + (getPreco() * 10/100))/numMeses;
    }

    public String exibirCondicoesFinanciamento() {
        return "Taxa de juros de 15% sobre o preço total no financiamento";
    }
    
}
