import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Fourthjava {
    public static void main(String[] args){

        String filePath = "Castillo.txt";

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))){

            writer.write("This is the first line of tex");
            writer.newLine();
            writer.write("This is the second line of text.");
            writer.newLine();
            writer.write("BufferedWriter makes writing fast and efficient.");
            System.out.println("Data successfully writen to the file!");
        }catch (IOException e){
            System.err.println("An error occuerred while writing to the file.");
            e.printStackTrace();
        }
        }
    }

