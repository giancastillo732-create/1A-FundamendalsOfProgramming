import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ActivityLoop1BufferedReader {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int highest = 0;
        int lowest = 0;

        for (int i = 1; i <= 10; i++){
            System.out.println("Enter Number " + i + ":");
            int num = Integer.parseInt(br.readLine());

            if (i == 1){
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
        System.out.println("Highest " + highest);
        System.out.println("Lowest " + lowest);

    }
}
