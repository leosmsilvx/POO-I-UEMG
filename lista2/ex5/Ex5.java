package lista2.ex5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import objetos.Exercicio;

public class Ex5 implements Exercicio {

    public void execute(Scanner scanner) {

        List<ContaBancaria> contas = new ArrayList<>();

        System.out.println("Bem vindo ao seu app de banco favorito!");       
        ContaBancaria contaAtual = null;
        while (true) {    
            mostrarOpcoesAntesLogin();
            String opcaoConta = scanner.nextLine();
            if(opcaoConta.equals("1")){
                ContaCorrente contaCorrente = criarContaCorrente(scanner);
                contas.add(contaCorrente);
                System.out.println("Cadastro realizado com sucesso!");
            } else if(opcaoConta.equals("2")){    
                ContaPoupanca contaPoupanca = criarContaPoupanca(scanner);
                contas.add(contaPoupanca);
                System.out.println("Cadastro realizado com sucesso!");
            } else if(opcaoConta.equals("3")){
                contaAtual = logarConta(scanner, contas);                
            } else if(opcaoConta.equals("4")){
                System.out.println("Saindo do seu app de banco favorito!");
                break;
            } else {
                System.out.println("Opcao invalida - Tente outra");
            }

            if(contaAtual != null){ // necessário estar logado!
                System.out.println("Ola, seu numero de conta e: " + contaAtual.getNumero());                
                operarContaAtual(scanner, contaAtual);
                break; // Sair do loop principal
            }
        }        
    }    

    private void operarContaAtual(Scanner scanner, ContaBancaria contaAtual){
        while (true) {
            mostrarOpcoesAposLogin();
            String opcaoLogin = scanner.nextLine();
            if(opcaoLogin.equals("1")){
                System.out.println("Digite o valor para sacar: ");
                String valorStr = scanner.nextLine();
                Double valor = Double.valueOf(valorStr);
                contaAtual.saca(valor);
            } else if(opcaoLogin.equals("2")){
                System.out.println("Digite o valor para depositar: ");
                String valorStr = scanner.nextLine();
                Double valor = Double.valueOf(valorStr);
                contaAtual.setSaldo(contaAtual.getSaldo() + valor);
            } else if(opcaoLogin.equals("3")){
                System.out.println("Digite o seu saldo atual e: ");
                System.out.println(contaAtual.getSaldo());
            } else if(opcaoLogin.equals("4")){
                System.out.println("Deslogando e saindo!");
                break;
            } else {
                System.out.println("Opcao invalida - Tente outra");
            }
        }
    }

    private ContaCorrente criarContaCorrente(Scanner scanner){
        System.out.println("Digite o numero da conta: ");
        String numeroConta = scanner.nextLine();

        System.out.println("Digite a senha da conta: ");
        String senhaConta = scanner.nextLine();

        return new ContaCorrente(senhaConta, numeroConta);
    }

    private ContaPoupanca criarContaPoupanca(Scanner scanner){
        System.out.println("Digite o numero da conta: ");
        String numeroConta = scanner.nextLine();

        System.out.println("Digite a senha da conta: ");
        String senhaConta = scanner.nextLine();

        return new ContaPoupanca(senhaConta, numeroConta);
    }

    private ContaBancaria logarConta(Scanner scanner, List<ContaBancaria> contas){
        System.out.println("Digite o numero da conta: ");
        String numeroConta = scanner.nextLine();

        ContaBancaria conta = contas.stream().filter(c -> c.getNumero().equals(numeroConta)).findFirst().orElse(null);
        if(conta == null){
            System.out.println("Nao foi possivel encontrar sua conta! Se cadastre antes...");
            return null;
        }

        System.out.println("Conta encontrada, digite a senha da conta " + conta.getNumero() + ":");
        String senhaConta = scanner.nextLine();
        if(conta.getSenha().equals(senhaConta)){
            System.out.println("Login realizado com sucesso!");
            return conta;
        } else {
            System.out.println("Senha invalida, faca o login novamente...");
            return null;
        }
    }

    private void mostrarOpcoesAntesLogin(){
        System.out.println("Digite uma opcao:");
        System.out.println("1 - Criar conta corrente");        
        System.out.println("2 - Criar conta poupanca");
        System.out.println("3 - Login");
        System.out.println("4 - Sair");
    }

    private void mostrarOpcoesAposLogin(){
        System.out.println("Digite uma opcao:");
        System.out.println("1 - Sacar");        
        System.out.println("2 - Depositar");
        System.out.println("3 - Verificar saldo");
        System.out.println("4 - Sair");
    }
}
