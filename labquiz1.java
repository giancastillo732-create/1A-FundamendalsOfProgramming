import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class labquiz1 {
    public static void main(String[] args) throws IOException {

        BufferedReader dataln = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Enter your Birth Year:");
            String BirthInput = dataln.readLine();
            int taon = Integer.parseInt(BirthInput);
            System.out.println("You were born lat " + taon + ".");
            int birth = 2026 - taon;
            System.out.println("You are now " + birth + "years old");


        }catch (IOException e) {
            System.err.println("error reading input stream.");
        }catch (NumberFormatException e0) {
            System.err.println("Invalid number format! Please enter digits only.");
        }
    }
}
