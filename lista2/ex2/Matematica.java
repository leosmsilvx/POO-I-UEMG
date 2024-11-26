package lista2.ex2;

public class Matematica {

    public static void primo(Integer x){
        if (x <= 1) { // Números menores ou iguais a 1 não são primos
            System.out.println(x + " nao e primo");
            return;
        }
        for (int i = 2; i <= x; i++) {
            if (x % i == 0) { // Se o resto da divisão for 0, não é primo
                System.out.println(x + " nao e primo");
                return;
            }
        }
        // Se passou por todos os testes, é primo
        System.out.println(x + " e primo"); 
    }

    public static void perfeito(Integer x){
        Integer somaDivisores = 0;
        for (int i = 1; i < x; i++) {
            if (x % i == 0) {
                somaDivisores += i;
            }
        }

        if (somaDivisores == x) { // Se a soma de divisores for igual ao numero, é perfeito
            System.out.println(x + " e um numero perfeito");
        } else { // Se não, não é perfeito
            System.out.println(x + " nao e um numero perfeito");
        }
    }

    public static void fatorial(Integer x){        

        Integer fatorial = 1; // Começar em 1 pois se começarmos em 0, o valor sempre vai ser 0
        for(int i = 1; i <= x; i++){
            fatorial *= i;
        }

        System.out.println(fatorial + " e o fatorial de " + x);
    }

    public static void fibonacci(Integer x){
        Integer n1 = 0, n2 = 1;
        for (int i = 0; i < x; ++i) {
            int proximo = n1 + n2; // Soma o anterior com o proximo
            n1 = n2; // Coloca o proximo para o anterior
            n2 = proximo; // Coloca a soma do anterior com o proximo para o proximo
        }

        System.out.println(x + "-esimo numero e: " + n1);
    }
}