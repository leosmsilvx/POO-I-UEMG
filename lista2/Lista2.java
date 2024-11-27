package lista2;

//Infelizmente é necessário importar classe por classe, visto que estão em pacotes diferentes
import lista2.ex1.Ex1;
import lista2.ex2.Ex2;
import lista2.ex3.Ex3Erro;
import lista2.ex4.Ex4;
import lista2.ex5.Ex5;
import lista2.ex6.Ex6Erro;
import lista2.ex7.Ex7Erro;
import objetos.ListaExercicio;

public class Lista2 extends ListaExercicio{

    public Lista2(){
        super();
        exercicios.add(new Ex1());
        exercicios.add(new Ex2());
        exercicios.add(new Ex3Erro());
        exercicios.add(new Ex4());
        exercicios.add(new Ex5());
        exercicios.add(new Ex6Erro());
        exercicios.add(new Ex7Erro());
    }
    
}
