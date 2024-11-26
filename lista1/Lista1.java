package lista1;

import objetos.ListaExercicio;

public class Lista1 extends ListaExercicio{

    public Lista1(){ // Construtor da lista1, todas as listas terão um parecido, porém com outros exercicios
        super(); // Garante que a lista de exercicios seja criada;
        exercicios.add(new Ex1());
        exercicios.add(new Ex2());
        exercicios.add(new Ex3());
        exercicios.add(new Ex4());
        exercicios.add(new Ex5());
        exercicios.add(new Ex6());
        exercicios.add(new Ex7());
        exercicios.add(new Ex8());
        exercicios.add(new Ex9());
        exercicios.add(new Ex10Erro()); // Ex10 - JOptionPane
        exercicios.add(new Ex11());
    }
    
}
