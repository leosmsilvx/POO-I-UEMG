package lista2.ex2;

import java.util.Scanner;

import objetos.Exercicio;

public class Ex2 implements Exercicio {

    public void execute(Scanner scanner) {
        System.out.println("Metodos de calculo: ");
        System.out.println("1 - primo");
        System.out.println("2 - perfeito");
        System.out.println("3 - fatorial");
        System.out.println("4 - fibonacci");        
        System.out.println("Escolha o metodo baseado no numero: ");

        String metodoStr = scanner.nextLine();
        Integer metodo = Integer.parseInt(metodoStr);          

        switch (metodo) {
            case 1:
                Matematica.primo(lerValorUsuario(scanner));
                break;
            case 2:
                Matematica.perfeito(lerValorUsuario(scanner));
                break; 
            case 3:
                Matematica.fatorial(lerValorUsuario(scanner));
                break;        
            case 4:
                Matematica.fibonacci(lerValorUsuario(scanner));
                break;
            default:
                System.out.println("Metodo invalido!");
                break;
        }
    }

    private Integer lerValorUsuario(Scanner scn){
        System.out.println("Digite o valor de n: ");
        String nStr = scn.nextLine();
        return Integer.parseInt(nStr);
    }
}
