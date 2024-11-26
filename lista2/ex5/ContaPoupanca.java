package lista2.ex5;

public class ContaPoupanca extends ContaBancaria{
    private Double txRendimento;

    public ContaPoupanca(String senha, String numero){
        super(senha, numero);
        this.txRendimento = 0.0;
    }

    public Double getTxRendimento() {
        return txRendimento;
    }

    public void setTxRendimento(Double txRendimento) {
        this.txRendimento = txRendimento;
    }
    
    public void saca(Double vlRetirar){
        if(super.getSaldo() < vlRetirar){
            System.out.println("Nao e possivel retirar pois seu saldo ficara negativo!");
            return;
        }        
        super.setSaldo(super.getSaldo() - vlRetirar);
        System.out.println("Seu novo saldo e de: " + super.getSaldo());
    }
}
