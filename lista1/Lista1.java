package lista1;

import objetos.Exercicio;
import objetos.ListaExercicio;

public class Lista1 extends ListaExercicio{

    public Lista1(){ // Construtor da lista1, todas as listas terão um parecido, porém com outros exercicios
        Exercicio ex1 = new Ex1();
        Exercicio ex2 = new Ex2();
        Exercicio ex3 = new Ex3();
        Exercicio ex4 = new Ex4();
        Exercicio ex5 = new Ex5();
        Exercicio ex6 = new Ex6();
        Exercicio ex7 = new Ex7();
        Exercicio ex8 = new Ex8();
        Exercicio ex9 = new Ex9();
        Exercicio ex10 = new Ex10Erro(); // Ex10 - JOptionPane
        Exercicio ex11 = new Ex11();

        exercicios.add(ex1);
        exercicios.add(ex2);
        exercicios.add(ex3);
        exercicios.add(ex4);
        exercicios.add(ex5);
        exercicios.add(ex6);
        exercicios.add(ex7);
        exercicios.add(ex8);
        exercicios.add(ex9);
        exercicios.add(ex10);
        exercicios.add(ex11);
    }
    
}
