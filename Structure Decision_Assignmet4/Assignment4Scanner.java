import java.util.Scanner;
public class Assignment4Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        double height = sc.nextDouble();

        System.out.print("Enter hours worked: ");
        int age = sc.nextInt();

        System.out.println("Enter citizenship code (C = citizen of Endor, N = non-citizen): ");
        String citizen = sc.next();

        System.out.println("Enter Recommendee code((R = for recommendee, N =  non-recommendee): ");
        String recommendee = sc.next();

        boolean requirements = height >= 200 && age >= 21 && age >= 25 && citizen.equalsIgnoreCase("C");

        if (recommendee.equalsIgnoreCase("R") || requirements) {
            System.out.println("The Applicant is Accecpted!");
        } else {
            System.out.println("The Applicant is Rejected");

        }
        sc.close();
    }
}
