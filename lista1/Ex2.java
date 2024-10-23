package lista1;

import java.util.Scanner;

import objetos.Exercicio;

public class Ex2 extends Exercicio {

    @Override // Override para substituir o metodo da classe pai
    public void execute(Scanner scanner) {
        System.out.print("Digite a renda aplicada: ");
        String rendaAplicStr = scanner.nextLine();
        Double rendaAplic = Double.valueOf(rendaAplicStr); // Transforma a leitura de String para Double
        System.out.print("Digite o juros: ");
        String jurosStr = scanner.nextLine();
        Double juros = Double.valueOf(jurosStr); // Transforma a leitura de String para Double
        System.out.print("Digite a quantidade de meses: ");
        String mesesStr = scanner.nextLine();
        Integer meses = Integer.valueOf(mesesStr); // Transforma a leitura de String para Integer

        //VF = VP * (1+j)^n
        Double rendaFinal = rendaAplic * Math.pow((1 + juros), meses); // Math.pow é o metodo de potencia - Math.pow(a,b) -> a^b

        System.out.println("Renda final: " + rendaFinal);
    }    
}
