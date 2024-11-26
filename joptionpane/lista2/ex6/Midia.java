package joptionpane.lista2.ex6;

public abstract class Midia {
    private String titulo;
    private Integer ano;

    public Midia(String titulo, Integer ano){
        this.titulo = titulo;
        this.ano = ano;
    }

    public abstract String reproduzir();

    public abstract String exibirDetalhes();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }
}
