
package lista2.ex5;

public abstract class ContaBancaria {
    private String senha;
    private String numero; // String pois podemos ter uma conta 00001
    private Double saldo;

    public ContaBancaria(String senha, String numero){
        this.senha = senha;
        this.numero = numero;
        this.saldo = 0.0;
    }

    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public Double getSaldo() {
        return saldo;
    }
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public abstract void saca(Double vlRetirar);

}
