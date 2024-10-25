package singleton;

public class conta {
    private static conta instancia;
    private String numero_conta = "";
    private double saldo = 0.0;
    
    private conta(String numero_conta){
        this.numero_conta = numero_conta;
    }

    public static conta getInstance(String numero_conta) {
        if(instancia == null){
            instancia = new conta(numero_conta);
        }
        return instancia;
    }

    public void depositar(Double valor){
        this.saldo += valor;
     }
     public void sacar(Double valor){
        this.saldo -= valor;
     }
     public Double getSaldo(Double valor){
        this.saldo;
     }
}
