package lista2.ex4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import objetos.Exercicio;

public class Ex4 implements Exercicio {

    public void execute(Scanner scanner) {
        List<Mercadoria> mercadorias = new ArrayList<>();
        List<Servico> servicos = new ArrayList<>();

        while (true) {
            mostrarMenu();
            String opcaoMenu = scanner.nextLine();
            if(opcaoMenu.equals("1")){
                Mercadoria merc = cadastrarMercadoria(scanner);
                mercadorias.add(merc);
            } else if(opcaoMenu.equals("2")){
                Servico serv = cadastrarServico(scanner);
                servicos.add(serv);
            } else if(opcaoMenu.equals("3")){
                Mercadoria merc = buscarMercadoria(scanner, mercadorias);
                if(merc != null){
                    mostrarDadosMercadoria(merc);
                }
            } else if(opcaoMenu.equals("4")){
                Servico serv = buscarServico(scanner, servicos);
                if(serv != null){
                    mostrarDadosServico(serv);
                }
            } else if(opcaoMenu.equals("5")){
                System.out.println("Saindo...");
                break;
            } else {
                System.out.println("Opcao invalida - Tente novamente");
            }
        }

    }   

    private void mostrarMenu(){
        System.out.println("Digite uma opcao:");
        System.out.println("1 - Cadastrar mercadoria");        
        System.out.println("2 - Cadastrar servico");
        System.out.println("3 - Buscar dados mercadoria");
        System.out.println("4 - Buscar dados servico");        
        System.out.println("5 - Sair");        
    }

    private Mercadoria cadastrarMercadoria(Scanner scanner){
        System.out.println("Escreva o codigo da mercadoria: ");
        String codigoStr = scanner.nextLine();
        Integer codigo = Integer.valueOf(codigoStr);
        
        System.out.println("Escreva o nome da mercadoria: ");
        String nome = scanner.nextLine();
        
        System.out.println("Digite o peso da mercadoria: ");
        String pesoStr = scanner.nextLine();
        Double peso = Double.valueOf(pesoStr);

        return new Mercadoria(codigo, nome, peso);
    }

    private Servico cadastrarServico(Scanner scanner){
        System.out.println("Escreva o codigo do servico: ");
        String codigoStr = scanner.nextLine();
        Integer codigo = Integer.valueOf(codigoStr);
        
        System.out.println("Escreva o nome do servico: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o valor da hora: ");
        String vlHoraStr = scanner.nextLine();
        Double vlHora = Double.valueOf(vlHoraStr);

        return new Servico(codigo, nome, vlHora);
    }

    private Mercadoria buscarMercadoria(Scanner scanner, List<Mercadoria> mercadorias){
        System.out.println("Digite o nome da mercadoria a ser buscada: ");
        String nome = scanner.nextLine();

        Mercadoria merc = mercadorias.stream().filter(m -> m.getNome().equals(nome)).findAny().orElse(null);
        if(merc == null){
            System.out.println("Mercadoria nao encontrada, faca a busca novamente!");
        }
        return merc;
    }

    private void mostrarDadosMercadoria(Mercadoria mercadoria){
        System.out.println("Mostrando dados da mercadoria: " + mercadoria.getNome());
        System.out.println("Codigo: " + mercadoria.getCodigo());
        System.out.println("Peso: " + mercadoria.getPeso());
    }

    private Servico buscarServico(Scanner scanner, List<Servico> servicoes){
        System.out.println("Digite o nome do servico a ser buscado: ");
        String nome = scanner.nextLine();

        Servico serv = servicoes.stream().filter(s -> s.getNome().equals(nome)).findAny().orElse(null);
        if(serv == null){
            System.out.println("Servico nao encontrado, faca a busca novamente!");
        }
        return serv;
    }

    private void mostrarDadosServico(Servico servico){
        System.out.println("Mostrando dados do servico: " + servico.getNome());
        System.out.println("Codigo: " + servico.getCodigo());
        System.out.println("Valor hora: " + servico.getValorHora());
    }
}
