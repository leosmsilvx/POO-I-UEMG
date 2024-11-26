package joptionpane.lista2.ex6;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Ex6 {

    public static void main(String[] args) {
        execute();
    }

    public static void execute() {
        String menuMsg = """
            Escolha uma opção:
            1. Cadastrar uma mídia
            2. Listar todas as mídias
            3. Buscar mídia por título
            4. Reproduzir uma mídia
            5. Sair
            """; // Mensagem padrão do menu
        
        List<Midia> midias = new ArrayList<>();

        // Midias exemplo, descomente para testar!
        // Musica m1 = new Musica("Uma noite só", 2020, "Pericles, Fabio Brazza", "Noite");
        // Musica m2 = new Musica("Besteiras", 2023, "Leall", "Eu ainda tenho coração");
        // Podcast p1 = new Podcast("FNX + FER", 2024, "Flow", 359);
        // Video v1 = new Video("Wasteland - Arcane", 2024, "Riot Games", 2);
        // midias.add(m1);
        // midias.add(m2);
        // midias.add(p1);
        // midias.add(v1);

        while (true) {
            Integer opcao = getIntegerMsg(menuMsg);
            if(opcao == 1){
                Midia midia = cadastrarMidia();
                midias.add(midia);
            } else if(opcao == 2){
                listarMidias(midias);
            } else if(opcao == 3){
                opcaoBuscarMidiaPorTitulo(midias);
            } else if(opcao == 4){
                opcaoReproduzirUmaMidia(midias);;
            } else if(opcao == 5){
                break;
            } else {
                showMsg("Opçao inválida");
            }
        }        
    }

    public static void showMsg(String msg){
        JOptionPane.showMessageDialog(null, msg); // Metodo JOptionPane para só mostrar a mensagem
    }
    
    public static Integer getIntegerMsg(String msg){
        return Integer.parseInt(JOptionPane.showInputDialog(msg)); // Metodo JOptionPane para mostrar a mensagem e pegar o valor digitado, tipo Integer
    }

    public static Double getDoubleMsg(String msg){
        return Double.parseDouble(JOptionPane.showInputDialog(msg)); // Metodo JOptionPane para mostrar a mensagem e pegar o valor digitado, tipo Double
    }

    public static String getStringMsg(String msg){
        return JOptionPane.showInputDialog(msg); // Metodo JOptionPane para mostrar a mensagem e pegar o valor digitado, tipo String
    }

    public static void listarMidias(List<Midia> midias){
        if(midias.isEmpty()){
            showMsg("Não há midias");
        }
        int i = 0;
        int pag = 0;
        String texto = "";
        while (i < midias.size()) {
            texto += getInfoMidia(midias.get(i));
            i++;
            pag++;
            if(pag == 3){ // Paginação de 3 midias por tela
                showMsg(texto);
                pag = 0;
                texto = "";
            }
        }
        if(!texto.isEmpty()){
            showMsg(texto);
        }
    }

    public static String getInfoMidia(Midia midia){
        return midia.exibirDetalhes();
    }

    public static Midia buscarMidiaPorTitulo(List<Midia> midias, String titulo){
        return midias.stream().filter(m -> m.getTitulo().equals(titulo)).findAny().orElse(null);
    }

    public static String getTextoListaMidias(List<Midia> midias){
        if(midias.isEmpty()){
            showMsg("Não há midias para serem reproduzidas");
            return null;
        }
        int i = 0;
        String texto = "";
        while (i < midias.size()) {
            texto += (i+1) + " - " + getInfoMidia(midias.get(i));
            i++;
        }
        return texto;
    }

    public static void opcaoBuscarMidiaPorTitulo(List<Midia> midias){
        String titulo = getStringMsg("Digite o titulo da midia");
        Midia mid = buscarMidiaPorTitulo(midias, titulo);
        if(mid == null){
            showMsg("Midia não encontrada!");
        } else {
            showMsg(getInfoMidia(mid));
        }
    }

    public static void opcaoReproduzirUmaMidia(List<Midia> midias){
        String texto = getTextoListaMidias(midias);
        if(texto != null){
            Integer rep = getIntegerMsg("Digite o numero da midia a ser reproduzida" + "\n" + texto);
            if(rep - 1 >= midias.size() || rep - 1 < 0){
                showMsg("Midia selecionada é inexistente");                        
            } else {
                showMsg(midias.get(rep - 1).reproduzir());
            }
        }
    }

    public static Midia cadastrarMidia(){
        Object[] options = {"Musica", "Video", "Podcast"};
        Object selectionObject = JOptionPane.showInputDialog(null, "Escolha uma midia", "", JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
        String selectionString = selectionObject.toString();
        if(selectionString.equals("Musica")){
            return cadastrarMusica();
        } else if(selectionString.equals("Video")){
            return cadastrarVideo();
        } else if(selectionString.equals("Podcast")){
            return cadastrarPodcast();
        } else {
            showMsg("Deu erro!");
            return null;
        }
    }

    public static Musica cadastrarMusica(){
        String titulo = getStringMsg("Digite o titulo da musica");
        Integer ano = getIntegerMsg("Digite o ano da musica");
        String artista = getStringMsg("Digite o artista da musica");
        String album = getStringMsg("Digite o album da musica");
        return new Musica(titulo, ano, artista, album);
    }

    public static Video cadastrarVideo(){
        String titulo = getStringMsg("Digite o titulo do video");
        Integer ano = getIntegerMsg("Digite o ano do video");
        String diretor = getStringMsg("Digite o diretor do video");
        Integer duracao = getIntegerMsg("Digite a duracao do video");
        return new Video(titulo, ano, diretor, duracao);
    }

    public static Podcast cadastrarPodcast(){
        String titulo = getStringMsg("Digite o titulo do podcast");
        Integer ano = getIntegerMsg("Digite o ano do podcast");
        String anfitriao = getStringMsg("Digite o anfitriao do podcast");
        Integer episodio = getIntegerMsg("Digite o episodio do podcast");
        return new Podcast(titulo, ano, anfitriao, episodio);
    }
}
