package joptionpane.lista2.ex3;

public class Cargo {
    private String titulo;
    private Double salario;

    public Cargo(String titulo, Double salario){
        this.titulo = titulo;
        this.salario = salario;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public Double getSalario() {
        return salario;
    }
    public void setSalario(Double salario) {
        this.salario = salario;
    }    
}
