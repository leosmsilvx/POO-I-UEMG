package lista2.ex5;

public class ContaCorrente extends ContaBancaria {
    private Integer nrTransacoes;
    private Double limChequeEspecial;
    
    public ContaCorrente(String senha, String numero){
        super(senha, numero);
        this.nrTransacoes = 0;
        this.limChequeEspecial = 0.0;
    }

    public Integer getNrTransacoes() {
        return nrTransacoes;
    }

    public void setNrTransacoes(Integer nrTransacoes) {
        this.nrTransacoes = nrTransacoes;
    }

    public Double getLimChequeEspecial() {
        return limChequeEspecial;
    }

    public void setLimChequeEspecial(Double limChequeEspecial) {
        this.limChequeEspecial = limChequeEspecial;
    }

    public void saca(Double vlRetirar){
        if(super.getSaldo() - vlRetirar < -1 * limChequeEspecial){
            System.out.println("Nao e possivel retirar pois seu saldo ficara abaixo do limite do cheque especial!");
            return;
        }
        super.setSaldo(super.getSaldo() - vlRetirar);
        System.out.println("Seu novo saldo e de: " + super.getSaldo());
    }
}
