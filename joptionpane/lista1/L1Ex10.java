package joptionpane.lista1;

import javax.swing.JOptionPane;

public class L1Ex10{

    public static void main(String[] args) {
        execute();
    }

    public static void execute() {
        String menuMsg = """
            Escolha uma opção:
            1. Calcular a área de um quadrado
            2. Calcular a área de um círculo
            3. Calcular a área de um triângulo
            4. Sair
            """; // Mensagem padrão do menu
            
        while (true) { // While true pois vou utilizar o break apos a leitura da opção
            Integer opcao = getIntegerMsg(menuMsg); // Chamada do metodo que utiliza JOptionPane, só por questão de estetica
            if(opcao == 1){
                calculaQuadrado(); // Chamada do metodo do calculo do quadrado
            } else if(opcao == 2){
                calculaCirculo(); // Chamada do metodo do calculo do circulo
            } else if(opcao == 3){
                calculaTriangulo(); // Chamada do metodo do calculo do triangulo
            } else if(opcao == 4){
                break; // Break caso a opção seja 4. Sair
            } else {
                showMsg("Opçao inválida"); // Chamada do metodo que utiliza o JOptionPane, só por questão de estetica
            }
        }        
    }

    public static void showMsg(String msg){
        JOptionPane.showMessageDialog(null, msg); // Metodo JOptionPane para só mostrar a mensagem
    }
    
    public static Integer getIntegerMsg(String msg){
        return Integer.parseInt(JOptionPane.showInputDialog(msg)); // Metodo JOptionPane para mostrar a mensagem e pegar o valor digitado, tipo Double
    }

    public static Double getDoubleMsg(String msg){
        return Double.parseDouble(JOptionPane.showInputDialog(msg)); // Metodo JOptionPane para mostrar a mensagem e pegar o valor digitado, tipo Integer
    }

    public static void calculaQuadrado(){
        double ladoQuadrado = getDoubleMsg("Digite o lado do quadrado:"); // Chamada do metodo que utiliza o JOptionPane, só por questão de estetica
        double areaQuadrado = ladoQuadrado * ladoQuadrado; // Area do quadrado a*a
        showMsg("A área do quadrado é: " + areaQuadrado); // Chamada do metodo que utiliza o JOptionPane, só por questão de estetica
    }

    public static void calculaCirculo(){        
        double raioCirculo = getDoubleMsg("Digite o raio do círculo:"); // Chamada do metodo que utiliza o JOptionPane, só por questão de estetica
        double areaCirculo = Math.PI * Math.pow(raioCirculo, 2); // Area do circulo π*r^2
        showMsg("A área do círculo é: " + areaCirculo); // Chamada do metodo que utiliza o JOptionPane, só por questão de estetica
    }

    public static void calculaTriangulo(){        
        double baseTriangulo = getDoubleMsg("Digite a base do triângulo:"); // Chamada do metodo que utiliza o JOptionPane, só por questão de estetica
        double alturaTriangulo = getDoubleMsg("Digite a altura do triângulo:"); // Chamada do metodo que utiliza o JOptionPane, só por questão de estetica
        double areaTriangulo = (baseTriangulo * alturaTriangulo) / 2; // Area do triangulo (b*h)/2
        showMsg("A área do triângulo é: " + areaTriangulo); // Chamada do metodo que utiliza o JOptionPane, só por questão de estetica
    }
}
