package lista1;

import java.util.Scanner;

import objetos.Exercicio;

public class Ex5 implements Exercicio {

    public void execute(Scanner scanner) {
        System.out.println("Calculadora de funções quadraticas");
        while (true) { // While true pois vou utilizar o break apos a leitura da resposta
            System.out.println("Deseja realizar um calculo de uma funcao? (s/n)");
            String resposta = scanner.nextLine();
            if(resposta.equals("s")){ // Comparação de string em java é necessário utilizar o .equals()
                realizarCalculo(scanner); // Chamada do metodo principal
            } else { // Se resposta != s, break
                break;
            }
        }
    }

    private void realizarCalculo(Scanner scanner){
        //Função quadratica ax^2 + bx + c = y
        //Raizes das funções y = 0
        System.out.print("Digite o valor de a: ");
        String aStr = scanner.nextLine();
        Double a = Double.valueOf(aStr); // Transforma a leitura de String para Double
        System.out.print("Digite o valor de b: ");
        String bStr = scanner.nextLine();
        Double b = Double.valueOf(bStr); // Transforma a leitura de String para Double
        System.out.print("Digite o valor de c: ");
        String cStr = scanner.nextLine();
        Double c = Double.valueOf(cStr); // Transforma a leitura de String para Double

        Double[] raizes = calculaXs(a, b, c); // raizes = [x', x'']
        System.out.println("x' = " + raizes[0]); // Primeiro elemento do array é x' 
        System.out.println("x'' = " + raizes[1]); // Segundo elemento do array é x'' 
    }

    private Double calculaDelta(Double a, Double b, Double c){
        return Math.pow(b, 2) - (4 * a * c); // Δ = b^2 - 4ac -> Math.pow é o metodo de potencia - Math.pow(a,b) -> a^b
    }

    private Double[] calculaXs(Double a, Double b, Double c){
        Double delta = calculaDelta(a, b, c); // Δ
        Double raizDelta = Math.sqrt(delta); // √Δ -> Math.sqrt é o metodo de raiz - Math.sqrt(a) -> √a

        Double x1 = ((-1) * b + raizDelta)/(2*a); // (-b + √Δ)/2a = x'
        Double x2 = ((-1) * b - raizDelta)/(2*a); // (-b - √Δ)/2a = x''

        return new Double[]{x1,x2}; // Retona um array de raizes
    }
}
