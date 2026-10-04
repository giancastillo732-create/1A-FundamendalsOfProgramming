import javax.swing.JOptionPane;

public class Assignment2JOptions {
    public static void main(String[] args) {
        double rate = Double.parseDouble(
                JOptionPane.showInputDialog("Enter hourly pay rate:").trim());
        double hours = Double.parseDouble(
                JOptionPane.showInputDialog("Enter hours worked:").trim());

        double gross = hours * rate;
        double percent;

        if (gross <= 2000) {
            percent = 0.10;
        } else if (gross <= 4000) {
            percent = 0.12;
        } else if (gross <= 10000) {
            percent = 0.15;
        } else {
            percent = 0.20;
        }

        double tax = gross * percent;
        double net = gross - tax;

        String result = String.format(
                "Gross Pay: Php %.2f%nWithholding Tax (%.0f%%): Php %.2f%nNet Pay: Php %.2f",
                gross, percent * 100, tax, net);
        JOptionPane.showMessageDialog(null, result);
    }
}