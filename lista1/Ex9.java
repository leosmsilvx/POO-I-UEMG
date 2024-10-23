package lista1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import objetos.Exercicio;

public class Ex9 extends Exercicio {

    @Override // Override para substituir o metodo da classe pai
    public void execute(Scanner scanner) {
        List<Integer> listaInteiros = new ArrayList<>(); // Utilizando o List do java que armazena objetos do tipo Integer

        for(int i = 1; i <= 10; i++){ // Loop de 10 iterações começando em 1 e terminando em 10 para o contador
            System.out.print("Digite o valor n"+i+": ");
            String valStr = scanner.nextLine();
            Integer val = Integer.valueOf(valStr); // Transforma a leitura de String para Integer
            listaInteiros.add(val); // Adiciona o valor lido para a lista com o metodo add
        }

        Collections.reverse(listaInteiros); // Utilizando o Collections.reverse para inverter a ordem da lista
        System.out.println("Lista: " + listaInteiros); // É possível printar a lista diretamente -> ex: Lista: [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
    }
}
