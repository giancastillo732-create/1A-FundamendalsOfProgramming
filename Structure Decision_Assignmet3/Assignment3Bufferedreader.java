import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Assignment3Bufferedreader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter Your NSAT Score: ");
        double nsat = Double.parseDouble(br.readLine().trim());

        System.out.print("Enter your monthly salary: ");
        double salary = Double.parseDouble(br.readLine().trim());

        System.out.print("Enter your score exam: ");
        double exam = Double.parseDouble(br.readLine().trim());

        double ave = (nsat + exam) / 2;

        if (salary > 10000 || nsat < 90 || exam < 85) {
            System.out.println("Applicant Rejected");
        } else if (salary <= 3500 && ave >= 91) {
            System.out.println("Applicant is Accepted");
        }else{
            System.out.println("The application is for FURTHER STUDY.");
        }

    }
}