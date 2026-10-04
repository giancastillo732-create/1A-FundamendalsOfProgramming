import javax.swing.JOptionPane;

public class Assignment4JOptions {
    public static void main(String[] args) {

        double height = Double.parseDouble(
                JOptionPane.showInputDialog("Enter Your Height: ").trim());
        int age = Integer.parseInt(
                JOptionPane.showInputDialog("Enter Your Age: ").trim());

        String citizen = JOptionPane.showInputDialog("Citizenship code(C = citizen of Endor, N = non-citizen): ".trim());
        String recommend = JOptionPane.showInputDialog("Recommendee code((R = for recommendee, N =  non-recommendee): ".trim());

        boolean requiments = height >= 200 && age >= 21 && age >= 25 && citizen.equalsIgnoreCase("C");

        String result;
        if(recommend.equalsIgnoreCase("R") || requiments) {
                result = "The Applicant is Accecpted!";
        }else {
            result = "The Applicant is Rejected";

        }
        JOptionPane.showMessageDialog(null, result);
    }
}
