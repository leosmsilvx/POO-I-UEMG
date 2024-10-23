package lista1;

import java.util.Scanner;

import objetos.Exercicio;

// IMPORTANTE!!!!
// O JOptionPane não funciona em uma thread diferente da principal, resumidamente, é necessário rodar esse código na classe main
// Para manter o padrão das classes de Exercicio, eu criei a classe Ex10Erro, porém não é possível executa-lo junto com os outros
// Existe uma pasta ./JOptionPane com o arquivo separado, execute por lá!
public class Ex10Erro extends Exercicio {

    @Override
    public void execute(Scanner scanner) {
        System.out.println("""
        IMPORTANTE!!!!\n
        O JOptionPane não funciona em uma thread diferente da principal, resumidamente, é necessário rodar esse código na classe main\n
        Para manter o padrão das classes de Exercicio, eu criei a classe Ex10Erro, porém não é possível executa-lo junto com os outros\n
        Existe uma pasta ./JOptionPane com o arquivo separado, execute por lá!\n
        """);
    }
        
}
