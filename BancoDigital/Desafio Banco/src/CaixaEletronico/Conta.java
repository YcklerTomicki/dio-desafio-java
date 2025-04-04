package CaixaEletronico;

public abstract class Conta implements IConta{

    private static final int AGENCIA_PADRAO = 235;
    private static int SEQUENCIAL = 1;  
    
    protected int agencia;
    protected int numeroConta;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente){
        this.agencia = AGENCIA_PADRAO;
        this.numeroConta = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void sacar(double valor) {
        saldo -= valor;

    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void transferir(double valor, Conta ContaDestino) {
        this.sacar(valor);
        ContaDestino.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s ", this.cliente.getNome()));
        System.out.println(String.format("CPF: %s ", this.cliente.getCpf()));
        System.out.println(String.format("Agencia: %d ", this.agencia));
        System.out.println(String.format("Numero: %d ", this.numeroConta));
        System.out.println(String.format("Saldo: %.2f ", this.saldo));
    }
}