package lista1;

import java.util.Scanner;

import objetos.Exercicio;

public class Ex3 extends Exercicio {

    @Override // Override para substituir o metodo da classe pai
    public void execute(Scanner scanner) {
        int contador = 0;
        Double salarioTotal = 0.0; // Inicializando o salario total como 0 para que a primeira soma funcione
        while (true) { // While true pois vou utilizar o break apos a leitura do salario
            contador++; // Aumenta o contador para realizar a media baseado em quantos salarios o usuário digitou
            System.out.print("Digite o salario n"+contador+" (digite um valor negativo para sair): ");
            String salarioStr = scanner.nextLine();
            Double salario = Double.valueOf(salarioStr); // Transforma a leitura de String para Double
            if(salario < 0){ // Se o usuário digitar um valor negativo, quebra o loop
                contador--; // Diminui o contador pois o salario negativo não entra na média
                break;
            }
            salarioTotal += salario; // Soma com o salario total

        }
        // Media ponderada
        Double media = salarioTotal/contador; 

        System.out.println("Media dos salarios: " + media);
    }    
}
