import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Thirdjava{
    public static void main(String[] args){

        BufferedReader dataln = new BufferedReader(new InputStreamReader(System.in));
        String name = "";
        System.out.println("Please Enter Your Name: ");

        try{

            name = dataln.readLine();
        }catch (IOException e){

            System.out.println("Eroor!");

        }
        System.out.println("Hell0 " + name +"!");
    }
}