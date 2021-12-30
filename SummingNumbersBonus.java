import java.io.*;
import java.util.*;
import java.util.Scanner;

public class SummingNumbersBonus{
public static void main (String [] args) throws IOException{

        FileReader input = new FileReader("nums.txt");
        Scanner scan = new Scanner(input);

        double total = 0;
        int count = 0;
       

        while (scan.hasNextInt()) {
            int number = scan.nextInt();

            // Count it and add it to the sum
            count++;
            total += number;

                  }

        System.out.println("Total: " + (int)(total));
        System.out.println("Average: " + total / count);
        
        
    }
}