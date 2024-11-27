package joptionpane.lista2.ex7;

public class Moto extends Veiculo implements Financiavel{

    public Moto(String modelo, String marca, Double preco){
        super(modelo, marca, preco);
    }

    public String exibirDetalhes() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Moto: " + getModelo() + "\n");
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
        return "Taxa de juros de 5% sobre o preço total no financiamento";
    }
    
}
