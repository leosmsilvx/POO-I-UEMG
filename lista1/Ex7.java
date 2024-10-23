package lista1;

import java.util.Scanner;

import objetos.Exercicio;

public class Ex7 extends Exercicio {

    @Override  // Override para substituir o metodo da classe pai
    public void execute(Scanner scanner) {
        System.out.print("Digite o numero de horas trabalhadas: ");
        String horasStr = scanner.nextLine();
        Double horas = Double.valueOf(horasStr); // Transforma a leitura de String para Double        
        System.out.print("Digite o valor da hora: ");
        String vlHoraStr = scanner.nextLine();
        Double vlHora = Double.valueOf(vlHoraStr); // Transforma a leitura de String para Double    
        System.out.print("Digite o numero de dependentes: ");
        String dependentesStr = scanner.nextLine();
        Integer dependentes = Integer.valueOf(dependentesStr); // Transforma a leitura de String para Integer
        System.out.print("Digite os descontos: ");
        String descontosStr = scanner.nextLine();
        Double descontos = Double.valueOf(descontosStr); // Transforma a leitura de String para Double

        // salario = numero de horas * valor da hora + (50 * numero de dependentes) - descontos
        Double salario = horas * vlHora + (50 * dependentes) - descontos; 

        System.out.println("Salario liquido: " + salario);
    }
}
