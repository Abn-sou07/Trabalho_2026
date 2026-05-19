public class Conta {

    private int numero;
    private Pessoa titular;
    private double saldo;

    public int getNumero() {
        return this.numero;
    }

    public Pessoa getTitular() {
        return this.titular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    

    boolean sacar(double valor) {
        if (valor > this.saldo) {
            return false;
        } else {
            this.saldo -= valor;
            return true;
        }
    }
    void depositar(double valor) {
        this.saldo += valor;
    }
}
