package objetos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaExercicio {

    public ListaExercicio(){
        this.exercicios = new ArrayList<>(); // Construtor inicia a lista inicialmente com um array vazio
    }

    public List<Exercicio> exercicios; // Publico pois precisamos acessar a lista no metodo main

    public Integer getNumeroExercicios(){ // Metodo para contabilizar quantos exercicios existem na lista
        return exercicios.size(); // O metodo size() retorna o numero de elementos de uma lista
    }

    public Integer escolherExercicio(Scanner scanner){
        System.out.print("Escolha um exercicio [1-"+getNumeroExercicios()+"](para sair digite um exercicio invalido): ");
        String exercicioStr = scanner.nextLine();
        Integer exercicio = Integer.valueOf(exercicioStr);  // Transforma a leitura de String para Integer
        if(exercicio > getNumeroExercicios() || exercicio < 1){  // Valida a escolha do exercicio
            System.out.println("Voltando para escolha de listas"); // Volta para a lista caso o exercicio seja invalido
            exercicio = -1; // -1 é o codigo de retorno caso o usuário escreva um exercicio invalido
        }
        return exercicio;
    }

}
