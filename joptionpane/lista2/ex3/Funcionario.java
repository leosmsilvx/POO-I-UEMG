package joptionpane.lista2.ex3;

public class Funcionario {
    private String nome;
    private String cpf;
    private Cargo funcao;

    public Funcionario(String nome, String cpf, String titulo, Double salario){
        this.nome = nome;
        this.cpf = cpf;
        this.funcao =  new Cargo(titulo, salario);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public Cargo getFuncao() {
        return funcao;
    }
    public void setFuncao(Cargo funcao) {
        this.funcao = funcao;
    }

    
}
