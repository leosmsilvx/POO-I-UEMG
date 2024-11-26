package joptionpane.lista2.ex6;

public class Musica extends Midia{
    private String artista;
    private String album;     
    
    public Musica(String titulo, Integer ano, String artista, String album){
        super(titulo, ano);
        this.artista = artista;
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String reproduzir() {
        return "Tocando música: " + this.getTitulo() + " de " + this.artista;
    }

    public String exibirDetalhes() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Musica: " + this.getTitulo() + "\n");
        stringBuilder.append("  - Ano: " + this.getAno() + "\n");
        stringBuilder.append("  - Artista: " + this.artista + "\n");
        stringBuilder.append("  - Album: " + this.album + "\n");
        return stringBuilder.toString();
    }
}
