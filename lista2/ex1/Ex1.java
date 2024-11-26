package lista2.ex1;

import java.util.Scanner;

import objetos.Exercicio;

public class Ex1 implements Exercicio {

    public void execute(Scanner scanner) {
        System.out.println("Calculadora de equacoes do 2º grau");
        while (true) { // While true pois vou utilizar o break apos a leitura da resposta
            System.out.println("Deseja realizar o calculo para uma equacao? (s/n)");
            String resposta = scanner.nextLine();
            if(resposta.equals("s")){ // Comparação de string em java é necessário utilizar o .equals()
                calculaEquacao(scanner); // Chamada do metodo principal
            } else { // Se resposta != s, break
                break;
            }
        }
    }
    
    private void calculaEquacao(Scanner scn){
        System.out.print("Digite o valor de a: ");
        String aStr = scn.nextLine();
        Double a = Double.valueOf(aStr);
        System.out.print("Digite o valor de b: ");
        String bStr = scn.nextLine();
        Double b = Double.valueOf(bStr);
        System.out.print("Digite o valor de c: ");
        String cStr = scn.nextLine();        
        Double c = Double.valueOf(cStr);

        Equacao eq = new Equacao();
        eq.setA(a);
        eq.setB(b);
        eq.setC(c);

        Double x1 = eq.retornaX1();
        Double x2 = eq.retornaX2();

        System.out.println("x': " + x1 + " / x'': " + x2);

    }
}
