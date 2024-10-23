import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import lista1.Lista1;
import objetos.ListaExercicio;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<ListaExercicio> listasExercicio = inicializaListas(); // Metodo de inicializar as listas

        while (true) { // Laço da escolha da lista de exercicio, inicialmente é só uma mesmo, mas as proximas também estão aqui  
            System.out.print("Escolha uma lista de exercícios [1-" + listasExercicio.size() + "](para sair digite uma lista invalida): ");
            String escolhaStr = scanner.nextLine();
            Integer escolha = Integer.valueOf(escolhaStr); // Transforma a leitura de String para Integer

            if(escolha < 1 || escolha > listasExercicio.size()){ // Valida a escolha da lista
                System.out.println("Saindo...");
                break;
            }

            ListaExercicio listaEscolhida = listasExercicio.get(escolha-1); // Pega a lista referente a escolha do usuario

            while (true) { // Laço da escolha de exercicio da lista
                Integer exercicio = listaEscolhida.escolherExercicio(scanner); // Metodo da classe ListaExercicio para escolher o exercicio
                if(exercicio != -1){ // -1 é o codigo de retorno caso o usuário escreva um exercicio invalido
                    System.out.println("Exercicio " + exercicio);
                    //O scanner precisa ser reaproveitado entre os exercicios, por isso não há uma abertura do mesmo em cada uma das classes
                    listaEscolhida.exercicios.get(exercicio-1).execute(scanner); // Pega o exercicio referente a escolha do usuario
                } else {
                    break;
                }
            }
        }
        
        scanner.close(); // Muito importante fechar o scanner!
    }

    // Metodo para inicializar as listas, inicialmente é só uma mesmo, mas as proximas também estão aqui  
    private static List<ListaExercicio> inicializaListas(){ 
        List<ListaExercicio> listas = new ArrayList<>(); // Inicializa um array vazio

        ListaExercicio lista1 = new Lista1(); // Chama o construtor da classe Lista1
        listas.add(lista1); // Adiciona a ListaExercicio na lista de ListaExercicio

        return listas;
    }
}
