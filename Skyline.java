import java.util.Scanner;
import java.io.*;
public class Skyline {
    public static void main(String[] args){
        try {
            readFile();
          } catch (FileNotFoundException e) {
            // Do something with `e`
          } 

    }

    public static void readFile() throws FileNotFoundException {
        Scanner input = new Scanner(new File("Prog-1-test-1.txt"));
        while(input.hasNextLine()){
          System.out.println(input.nextInt());
          
        }
      }
}

