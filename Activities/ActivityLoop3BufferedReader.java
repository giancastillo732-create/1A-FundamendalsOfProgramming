import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.nio.Buffer;

public class ActivityLoop3BufferedReader {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double balance = 20000;

        while (true){
            System.out.println("Enter amount (0 to stop): ");
            double amount = Double.parseDouble(br.readLine());

            if(amount == 0){
                  break;
            }
            if (amount > 0){
                    balance +=  amount;
                }else {
                if(Math.abs(amount) <= balance){
                    balance +=  amount;
                }else {
                    System.out.println("INSUFFICIENT FUNDS!");
                }
            }
            System.out.printf("Outstanding Balance: P%.2f%n",
                    balance);
        }
        System.out.printf("Final Balance: P%.2f%n", balance);
    }
}
