package lista1;

import java.util.Scanner;

import objetos.Exercicio;

public class Ex1 extends Exercicio {

    @Override // Override para substituir o metodo da classe pai
    public void execute(Scanner scanner) {
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine(); // Le o nome digitado pelo usuário
        System.out.print("Digite sua idade: ");
        String idadeStr = scanner.nextLine(); // Le a idade digitado pelo usuário
        Integer idade = Integer.valueOf(idadeStr); // Transforma a leitura de String para Integer

        System.out.println(nome + ", sua idade e " + idade);
    }    
}
