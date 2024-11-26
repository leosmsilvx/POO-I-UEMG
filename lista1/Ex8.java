package lista1;

import java.util.Scanner;

import objetos.Exercicio;

public class Ex8 implements Exercicio {

    public void execute(Scanner scanner) {
        System.out.print("Digite o valor do primeiro cateto: ");
        String bStr = scanner.nextLine();
        Double b = Double.valueOf(bStr); // Transforma a leitura de String para Double
        System.out.print("Digite o valor do segundo cateto: ");
        String cStr = scanner.nextLine();
        Double c = Double.valueOf(cStr); // Transforma a leitura de String para Double

        Double h = hipotenusa(b, c);

        System.out.println("Hipotenusa: " + h);
    }

    private Double hipotenusa(Double b, Double c){
        Double somaCatetos = Math.pow(b, 2) + Math.pow(c, 2); // Math.pow é o metodo de potencia - Math.pow(a,b) -> a^b
        return Math.sqrt(somaCatetos); // Math.sqrt é o metodo de raiz - Math.sqrt(a) -> √a
    }
}
