package joptionpane.lista2.ex3;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Ex3{

    public static void main(String[] args) {
        execute();
    }

    public static void execute() {
        String menuMsg = """
            Escolha uma opção:
            1. Cadastrar um funcionário
            2. Listar todos os funcionários
            3. Buscar funcionário por nome
            4. Sair
            """; // Mensagem padrão do menu
        
        List<Funcionario> funcionarios = new ArrayList<>();

        // Funcionarios exemplo, descomente para testar!
        // Funcionario f1 = new Funcionario("1", "1", "1", 1.0);
        // Funcionario f2 = new Funcionario("2", "2", "2", 2.0);
        // Funcionario f3 = new Funcionario("3", "3", "3", 3.0);
        // Funcionario f4 = new Funcionario("4", "4", "4", 4.0);
        // Funcionario f5 = new Funcionario("5", "5", "5", 5.0);
        // funcionarios.add(f1);
        // funcionarios.add(f2);
        // funcionarios.add(f3);
        // funcionarios.add(f4);
        // funcionarios.add(f5);
        
        while (true) {
            Integer opcao = getIntegerMsg(menuMsg);
            if(opcao == 1){
                Funcionario func = cadastrarFuncionario();
                funcionarios.add(func);
            } else if(opcao == 2){
                listarFuncionarios(funcionarios);
            } else if(opcao == 3){
                String nome = getStringMsg("Digite o nome do funcionario");
                Funcionario func = buscarFuncionarioPorNome(funcionarios, nome);
                if(func == null){
                    showMsg("Funcionário não encontrado!");
                } else {
                    showMsg(getInfoFuncionario(func));
                }
            } else if(opcao == 4){
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

    public static Funcionario cadastrarFuncionario(){
        String nome = getStringMsg("Digite o nome do funcionario");
        String cpf = getStringMsg("Digite o cpf do funcionario");
        String titulo = getStringMsg("Digite o titulo do cargo do funcionario");
        Double salario = getDoubleMsg("Digite o valor do salario do cargo do funcionario");
        return new Funcionario(nome, cpf, titulo, salario);
    }

    public static void listarFuncionarios(List<Funcionario> funcionarios){
        if(funcionarios.isEmpty()){
            showMsg("Não há funcionarios cadastrados!");
            return;
        }
        int i = 0;
        int pag = 0;
        String texto = "";
        while (i < funcionarios.size()) {
            texto += getInfoFuncionario(funcionarios.get(i));
            i++;
            pag++;
            if(pag == 3){ // Paginação de 3 funcionarios por tela
                showMsg(texto);
                pag = 0;
                texto = "";
            }
        }
        if(!texto.isEmpty()){
            showMsg(texto);
            return;
        }
    }

    public static String getInfoFuncionario(Funcionario func){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Funcionario: " + func.getNome() + "\n");
        stringBuilder.append("  - CPF: " + func.getCpf() + "\n");
        stringBuilder.append("  - Cargo: " + func.getFuncao().getTitulo() + "\n");
        stringBuilder.append("  - Salário: " + func.getFuncao().getSalario() + "\n");
        return stringBuilder.toString();
    }

    public static Funcionario buscarFuncionarioPorNome(List<Funcionario> funcionarios, String nome){
        return funcionarios.stream().filter(f -> f.getNome().equals(nome)).findAny().orElse(null);
    }
}
