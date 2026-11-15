import javax.swing.JOptionPane;
public class ActivityLoop3Joptions {
    public static void main(String[] args) {

        double balance = 20000;

        while (true) {

            double amount = Double.parseDouble(
                    JOptionPane.showInputDialog(
                            "Enter amount (0 to stop):"));

            if (amount == 0) {
                break;
            }

            if (amount > 0) {
                balance += amount;
            } else {
                if (Math.abs(amount) <= balance) {
                    balance += amount;
                } else {
                    JOptionPane.showMessageDialog(null,
                            "INSUFFICIENT FUNDS!");
                }
            }

            JOptionPane.showMessageDialog(null,
                    String.format("Outstanding Balance: P%.2f",
                            balance));
        }

        JOptionPane.showMessageDialog(null,
                String.format("Final Balance: P%.2f", balance));
    }
}

