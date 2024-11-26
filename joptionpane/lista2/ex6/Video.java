package joptionpane.lista2.ex6;

public class Video extends Midia {
    private String diretor;
    private Integer duracao;

    public Video(String titulo, Integer ano, String diretor, Integer duracao){
        super(titulo, ano);
        this.diretor = diretor;
        this.duracao = duracao;
    }

    public String getDiretor() {
        return diretor;
    }
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
    public Integer getDuracao() {
        return duracao;
    }
    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }

    public String reproduzir() {
        return "Reproduzindo video: " + this.getTitulo() + " dirigido por " + this.diretor;
    }

    public String exibirDetalhes() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Video: " + this.getTitulo() + "\n");
        stringBuilder.append("  - Ano: " + this.getAno() + "\n");
        stringBuilder.append("  - Diretor: " + this.diretor + "\n");
        stringBuilder.append("  - Duracao: " + this.duracao + "\n");
        return stringBuilder.toString();
    }
}
