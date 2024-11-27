package joptionpane.lista2.ex7;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Ex7 {
    public static void main(String[] args) {
        execute();
    }

    public static void execute() {
        String menuMsg = """
            Escolha uma opção:
            1. Cadastrar um veículo
            2. Listar todas os veículos
            3. Buscar veículo por modelo
            4. Exibir condições de financiamento de um veículo
            5. Sair
            """; // Mensagem padrão do menu
        
        List<Veiculo> veiculos = new ArrayList<>();

        // Veiculos exemplo, descomente para testar!
        Carro c1 = new Carro("Sandero RS", "renault", 68000.0);
        Carro c2 = new Carro("UP TSI", "volkswagen", 57000.0);
        Moto m1 = new Moto("Street Triple", "triumph", 38000.0);
        Moto m2 = new Moto("MT-07", "yamaha", 42000.0);
        Caminhao cm1 = new Caminhao("F16", "volvo", 700000.0);
        Caminhao cm2 = new Caminhao("113", "scania", 400000.0);
        veiculos.add(c1);
        veiculos.add(c2);
        veiculos.add(m1);
        veiculos.add(m2);
        veiculos.add(cm1);
        veiculos.add(cm2);

        while (true) {
            Integer opcao = getIntegerMsg(menuMsg);
            if(opcao == 1){
                Veiculo vel = cadastrarVeiculo();
                veiculos.add(vel);
            } else if(opcao == 2){
                listarVeiculos(veiculos);
            } else if(opcao == 3){
                opcaoBuscarVeiculoPorModelo(veiculos);
            } else if(opcao == 4){
                opcaoExibirCondicoesFinanciamento(veiculos);
            } else if(opcao == 5){
                break;
            } else {
                showMsg("Opçao inválida");
            }
        }        
    }

    public static void showMsg(String msg){
        JOptionPane.showMessageDialog(null, msg); // Metodo JOptionPane para só mostrar a mensagem
    }
    
    public static Integer getIntegerMsg(String msg){
        return Integer.parseInt(JOptionPane.showInputDialog(msg)); // Metodo JOptionPane para mostrar a mensagem e pegar o valor digitado, tipo Integer
    }

    public static Double getDoubleMsg(String msg){
        return Double.parseDouble(JOptionPane.showInputDialog(msg)); // Metodo JOptionPane para mostrar a mensagem e pegar o valor digitado, tipo Double
    }

    public static String getStringMsg(String msg){
        return JOptionPane.showInputDialog(msg); // Metodo JOptionPane para mostrar a mensagem e pegar o valor digitado, tipo String
    }

    public static Veiculo cadastrarVeiculo(){
        Object[] options = {"Carro", "Moto", "Caminhao"};
        Object selectionObject = JOptionPane.showInputDialog(null, "Escolha um tipo de veículo", "", JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
        String selectionString = selectionObject.toString();

        String modelo = getStringMsg("Digite o modelo do veiculo");
        Double preco = getDoubleMsg("Digite o preco do veiculo");
        String marca = getStringMsg("Digite a marca do veiculo");

        if(selectionString.equals("Carro")){
            return new Carro(modelo, marca, preco);
        } else if(selectionString.equals("Moto")){
            return new Moto(modelo, marca, preco);
        } else if(selectionString.equals("Caminhao")){
            return new Caminhao(modelo, marca, preco);
        } else {
            showMsg("Deu erro!");
            return null;
        }
    }

    public static void listarVeiculos(List<Veiculo> veiculos){
        if(veiculos.isEmpty()){
            showMsg("Não há midias");
        }
        int i = 0;
        int pag = 0;
        String texto = "";
        while (i < veiculos.size()) {
            texto += veiculos.get(i).exibirDetalhes();
            i++;
            pag++;
            if(pag == 3){ // Paginação de 3 midias por tela
                showMsg(texto);
                pag = 0;
                texto = "";
            }
        }
        if(!texto.isEmpty()){
            showMsg(texto);
        }
    }

    public static Veiculo buscarVeiculoPorModelo(List<Veiculo> veiculos, String modelo){
        return veiculos.stream().filter(v -> v.getModelo().equals(modelo)).findAny().orElse(null);
    }

    public static Veiculo opcaoBuscarVeiculoPorModelo(List<Veiculo> veiculos){
        String modelo = getStringMsg("Digite o modelo do veiculo");
        Veiculo vel = buscarVeiculoPorModelo(veiculos, modelo);
        if(vel == null){
            showMsg("Veiculo não encontrada!");
        } else {
            showMsg(vel.exibirDetalhes());
        }
        return vel;
    }

    public static void opcaoExibirCondicoesFinanciamento(List<Veiculo> veiculos){
        String modelo = getStringMsg("Digite o modelo do veiculo");
        Veiculo vel = buscarVeiculoPorModelo(veiculos, modelo);
        Financiavel velFin = (Financiavel) vel;
        Integer parcelas = getIntegerMsg("Digite o numero de parcelas do financiamento");
        Double precoParcela = velFin.calcularParcela(parcelas);
        showMsg(vel.exibirDetalhes() + "Preço da parcela: " + precoParcela + "\nPreco do financiamento: " + precoParcela*parcelas +"\nQuantidade de meses: " + parcelas + "\n- " + velFin.exibirCondicoesFinanciamento());
    }
}
