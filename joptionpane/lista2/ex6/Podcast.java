package joptionpane.lista2.ex6;

public class Podcast extends Midia{
    private String anfitriao;
    private Integer episodio;

    public Podcast(String titulo, Integer ano, String anfitriao, Integer episodio){
        super(titulo, ano);
        this.anfitriao = anfitriao;
        this.episodio = episodio;
    }

    public String getAnfitriao() {
        return anfitriao;
    }
    public void setAnfitriao(String anfitriao) {
        this.anfitriao = anfitriao;
    }
    public Integer getEpisodio() {
        return episodio;
    }
    public void setEpisodio(Integer episodio) {
        this.episodio = episodio;
    }

    public String reproduzir() {
        return "Episodio: " + this.episodio + " de " + this.getTitulo() + " com " + this.anfitriao;
    }

    public String exibirDetalhes() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Podcast: " + this.getTitulo() + "\n");
        stringBuilder.append("  - Ano: " + this.getAno() + "\n");
        stringBuilder.append("  - Episodio: " + this.episodio + "\n");
        stringBuilder.append("  - Anfitriao: " + this.anfitriao + "\n");
        return stringBuilder.toString();
    }
    
    
}
