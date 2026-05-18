// Sarah Aurora Barbosa Alencar
// Hendrielly Rikelly Pereira Silva

import javax.swing.JOptionPane;

public class ContaTeste {
    public static void main(String[] args) {
        // Perguntas para criar a conta
        String nome = JOptionPane.showInputDialog("Digite seu Nome");

        // Criação de contas
        Conta conta1 = new Conta(nome, 50.00);
        Conta conta2 = new Conta("John Blue", -7.53);

        String mensagem1 = String.format("Olá, %s! Bem-vindo à sua conta. Seu saldo inicial é de R$%.2f.",
                conta1.getNome(), conta1.getSaldo());
        JOptionPane.showMessageDialog(null, mensagem1);

        // Depositar p/ conta 1
        double quantia1 = Double.parseDouble(
                JOptionPane.showInputDialog("Quanto você deseja depositar para " + conta1.getNome() + "?"));
        conta1.depositar(quantia1);

        // Mostrar contas
        String mensagem2 = String.format("%s (R$%.2f)\n%s (R$%.2f)", conta1.getNome(), conta1.getSaldo(),
                conta2.getNome(), conta2.getSaldo());
        JOptionPane.showMessageDialog(null, mensagem2);

        // Depositar p/ conta 2
        double quantia2 = Double.parseDouble(
                JOptionPane.showInputDialog("Quanto você deseja depositar para " + conta2.getNome() + "?"));
        conta2.depositar(quantia2);

        // Fim
        String mensagem3 = String.format("%s (R$%.2f)\n%s (R$%.2f)", conta1.getNome(), conta1.getSaldo(),
                conta2.getNome(), conta2.getSaldo());
        JOptionPane.showMessageDialog(null, mensagem3);
    }
}
