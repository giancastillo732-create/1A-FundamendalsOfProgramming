import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Assignment4Bufferedreader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter your height: ");
        double height = Double.parseDouble(br.readLine().trim());

        System.out.print("Enter your age: ");
        int age = Integer.parseInt(br.readLine().trim());

        System.out.println("Enter citizenship code (C = citizen of Endor, N = non-citizen): ");
        String citizen = br.readLine();

        System.out.println("Enter Recommendee code((R = for recommendee, N =  non-recommendee): ");
        String recommendee = br.readLine();

        boolean requiments = height >= 200 && age >= 21 && age >= 25 && citizen.equalsIgnoreCase("C");


        if (recommendee.equalsIgnoreCase("R") || requiments) {
            System.out.println("The Applicant is Accecpted!");
        } else {
            System.out.println("The Applicant is Rejected");

        }
    }
}