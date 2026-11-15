import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ActivityLoop2BufferedReader {
    public static void main(String[] args){

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String output = "";

        for(int i = 2; i <= 100; i += 2){
        output += i + " ";

        if (i % 20 == 0){
            output+= i + "\n";
        }
        }
        System.out.println(output);
    }
}
