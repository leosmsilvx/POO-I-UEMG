package lista1;

import java.util.Scanner;

import objetos.Exercicio;

public class Ex6 extends Exercicio {

    @Override // Override para substituir o metodo da classe pai
    public void execute(Scanner scanner) {
        System.out.println("Calculadora de media Km/L de um carro");
        while (true) { // While true pois vou utilizar o break apos a leitura da resposta
            System.out.println("Deseja realizar o calculo para o seu carro? (s/n)");
            String resposta = scanner.nextLine();
            if(resposta.equals("s")){ // Comparação de string em java é necessário utilizar o .equals()
                calculaKmL(scanner); // Chamada do metodo principal
            } else { // Se resposta != s, break
                break;
            }
        }
    }

    private void calculaKmL(Scanner scanner){
        System.out.print("Digite o numero de quilometros foram percorridos: ");
        String kmStr = scanner.nextLine();
        Integer km = Integer.valueOf(kmStr); // Transforma a leitura de String para Integer
        System.out.print("Digite o numero de litros gastos: ");
        String litroStr = scanner.nextLine();
        Integer litro = Integer.valueOf(litroStr); // Transforma a leitura de String para Integer

        Double kml = (double) km/litro; // Necessário o cast (double) para transformar o resultado da divisão para o tipo Double

        System.out.println("seu carro realiza: " + kml + " km/L");
    }
}
