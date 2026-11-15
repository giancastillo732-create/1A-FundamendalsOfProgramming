import javax.swing.JOptionPane;
public class ActivityLoop1Joptions {
    public static void main(String[] args){

        int highest = 0;
        int lowest = 0;

        for (int i = 1; i <= 10; i++){
            int num = Integer.parseInt(JOptionPane.showInputDialog("Enter Nunmber " + i + ":"));

            if(i == 1){
                highest = num;
                lowest = num;

            }else{
                if(num > highest){
                highest = num;
                }
                if(num < lowest){
                    lowest = num;
                }
            }
        }
JOptionPane.showMessageDialog(null, "Highest: " + highest + "\n Lowest: " + lowest);
    }
}
