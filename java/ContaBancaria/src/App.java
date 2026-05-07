import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        // Perguntas para criar a conta
        String nome = JOptionPane.showInputDialog("Seu Nome");
        double saldo = Double.parseDouble(JOptionPane.showInputDialog("Saldo inicial"));
        Conta conta = new Conta(nome, saldo);

        // Contas testes
        Conta contaJohn = new Conta("John Blue", -7.53);
        Conta contaJane = new Conta("Jane Green", 50);

        // Loop
        while (true) {
            // Menu de opções
            String opcao = JOptionPane.showInputDialog(
                    "Nome: " + conta.getNome() +
                            "\nSaldo: " + conta.getSaldo() +
                            "\n\nVocê deseja sacar ou depositar?");

            // Checa opções
            if (opcao.equals("sacar")) { // Sacar
                double quantia = Double.parseDouble(JOptionPane.showInputDialog("Quanto você quer sacar?"));
                JOptionPane.showMessageDialog(null, "Você sacou " + quantia + "!");
                conta.sacar(quantia);

            } else if (opcao.equals("depositar")) { // Depositar
                double quantia = Double.parseDouble(JOptionPane.showInputDialog("Quanto você quer depositar?"));
                JOptionPane.showMessageDialog(null, "Você depositou " + quantia + "!");
                conta.depositar(quantia);

            } else if (opcao.equals("john")) { // John
                JOptionPane.showMessageDialog(null,
                        "Nome: " + contaJohn.getNome() + "\nSaldo: " + contaJohn.getSaldo());

            } else if (opcao.equals("jane")) { // Jane
                JOptionPane.showMessageDialog(null,
                        "Nome: " + contaJane.getNome() + "\nSaldo: " + contaJane.getSaldo());
            }
        }
    }
}
