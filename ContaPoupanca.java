public class ContaPoupanca extends Conta {

    private double rendimento;

    public double getRendimento() {
        return this.rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }

    public ContaPoupanca() {
        setSaldo(100.0);
    }

}
