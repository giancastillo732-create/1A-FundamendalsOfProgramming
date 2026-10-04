import java.util.Scanner;
public class Assignment3Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your NSAT Score: ");
        double nsat = sc.nextDouble();

        System.out.print("Enter your monthly salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter your exam Score: ");
        double exam = sc.nextDouble();

        double ave = (nsat + exam) /2;

        if(salary > 10000 || nsat < 90 || exam < 85){
            System.out.println("Applicant Rejected");
        }else if(salary <= 3500 && ave >= 91){
            System.out.println("Applicant is Accepted");
        }else{
            System.out.println("The application is for FURTHER STUDY.");
        }
        sc.close();
    }
}