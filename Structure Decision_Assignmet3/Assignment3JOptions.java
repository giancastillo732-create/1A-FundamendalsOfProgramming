import javax.swing.JOptionPane;

public class Assignment3JOptions {
    public static void main(String[] args) {
        double nsat = Double.parseDouble(
                JOptionPane.showInputDialog("Enter Your NSAT Score: "));
        double salary = Double.parseDouble(
                JOptionPane.showInputDialog("Enter your monthly salary: "));
        double exam = Double.parseDouble(
                JOptionPane.showInputDialog("Enter your exam score:"));

        double ave = (exam + nsat) /2;

        String result;
        if(salary > 10000 || nsat < 90 || exam < 85){
            result = "THE APPLICANT REJECTED";
        }else if (salary <= 3500 && ave >= 91){
            result = "THE APPLICANT ACCEPTED!";
        }else{
            result= "The application is for FURTHER STUDY.";
        }
        JOptionPane.showMessageDialog(null, result);

    }
}