public class Conta {
    private String nome;
    private double saldo;

    // Construtor
    public Conta(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Saca uma quantia em dinheiro
    public void sacar(double quantia) {
        saldo -= quantia;
        if (saldo <= 0)
            saldo = 0;
    }

    // Deposita uma quantia em dinheiro
    public void depositar(double quantia) {
        saldo += quantia;
    }
}
