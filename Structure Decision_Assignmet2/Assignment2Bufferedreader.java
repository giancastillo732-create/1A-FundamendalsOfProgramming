import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Assignment2Bufferedreader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter hourly pay rate: ");
        double rate = Double.parseDouble(br.readLine().trim());

        System.out.print("Enter hours worked: ");
        double hours = Double.parseDouble(br.readLine().trim());

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

        System.out.printf("Gross Pay: Php %.2f%n", gross);
        System.out.printf("Withholding Tax (%.0f%%): Php %.2f%n", percent * 100, tax);
        System.out.printf("Net Pay: Php %.2f%n", net);
    }
}