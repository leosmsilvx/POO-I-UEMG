package lista1;

import java.util.Random;
import java.util.Scanner;

import objetos.Exercicio;

public class Ex11 extends Exercicio {

    @Override // Override para substituir o metodo da classe pai
    public void execute(Scanner scanner) {
        Integer numeroAleatorio = gerarNumeroAleatorio(); // Chamada do metodo de gerar numero aleatorio

        while (true) {
            System.out.print("Digite o valor de X: ");
            String valStr = scanner.nextLine();
            Integer val = Integer.valueOf(valStr); // Transforma a leitura de String para Integer
            
            if(val == numeroAleatorio){ // Numero lido é igual ao numero aleatorio
                System.out.println("Você acertou o numero! O numero era: " + numeroAleatorio);
                break;
            } else if(numeroAleatorio < val){ // Numero aleatorio é menor que o numero lido
                System.out.println("Quase... O numero é menor que " + val);
            } else { // Numero aleatorio é maior que o numero lido
                System.out.println("Quase... O numero é maior que " + val);
            }
        }
    }

    public static Integer gerarNumeroAleatorio(){
        Random gerador = new Random(); // Classe do gerador de numero aleatorio
        //.nextInt(numeroMaximo) -> retorna um valor entre 0 (inclusivo) e numeroMaximo (exclusivo)
        //Por ser exclusivo, é necessário somar 1 no valor gerado, para não incluir o 0 e incluir o 100
        Integer valor = gerador.nextInt(100) + 1; // 
        return valor;
    }
}
