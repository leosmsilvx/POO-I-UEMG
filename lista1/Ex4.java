package lista1;

import java.util.Scanner;

import objetos.Exercicio;

public class Ex4 implements Exercicio {

    public void execute(Scanner scanner) {
        Double imc = calculaImc(scanner); // Método de calcular IMC
        String grauObesidade = calculaGrauObesidade(imc); // Método de calcular o grau de obesidade
        System.out.println("Seu IMC e: " + imc);
        System.out.println("Seu grau de obesidade e: " + grauObesidade);
    }

    private Double calculaImc(Scanner scanner){
        System.out.print("Digite seu peso: ");
        String pesoStr = scanner.nextLine();
        Double peso = Double.valueOf(pesoStr); // Transforma a leitura de String para Double
        
        System.out.print("Digite sua altura: ");
        String alturaStr = scanner.nextLine();
        Double altura = Double.valueOf(alturaStr); // Transforma a leitura de String para Double

        return peso/Math.pow(altura,2); // Math.pow é o metodo de potencia - Math.pow(a,b) -> a^b
    }

    //Esse método retorna qual o grau de obesidade baseado no IMC
    // IMC < 18.6 - Abaixo do peso
    // 18.6 <= IMC < 25 - Saudável
    // 25 <= IMC < 30 - Peso em excesso
    // 30 <= IMC < 35 - Obesidade grau I
    // 35 <= IMC < 40 - Obesidade grau II
    // IMC >= 40 - Obesidade mórbida
    private String calculaGrauObesidade(Double imc){
        if(imc < 18.6){
            return "Abaixo do peso";
        } else if(imc >= 18.6 && imc < 25){
            return "Saudavel";
        } else if(imc >= 25 && imc < 30){
            return "Peso em excesso";
        } else if(imc >= 30 && imc < 35){
            return "Obesidade grau 1";
        } else if(imc >= 35 && imc < 40){
            return "Obesidade grau 2";
        } else {
            return "Obesidade morbida";
        }
    }
}
