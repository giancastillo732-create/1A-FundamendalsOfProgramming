import javax.swing.JOptionPane;

public class LabQuiz3 {
    public static void main(String[] args){

        String employees = "";
        double salary = 0;

        String msg = "Salary Checker";
        JOptionPane.showMessageDialog(null, msg);
        salary = Double.parseDouble(JOptionPane.showInputDialog("Enter your Old Salary:"));


        double newSalary = salary + ( .1775 * salary);
        double newRetro = salary * .1775;


        String msgs = "Your old salary: " + salary + "\n" + "YOUR NEW SALARY IS: " + newSalary + "\n" + "Amount of retro:" + newRetro + "\n" + (newRetro * 2);
        JOptionPane.showMessageDialog(null, msgs);












    }
}
