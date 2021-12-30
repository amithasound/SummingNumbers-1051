import java.io.*;
import java.util.*;
import java.util.Scanner;

public class SummingNumbers{
public static void main (String [] args) throws IOException{

    Scanner kb = new Scanner(System.in);
    System.out.print("Enter the file name you would like to read numbers from: " );
    String fileName = kb.nextLine();
    
     FileReader input = new FileReader(fileName);
     BufferedReader inputBuffer = new BufferedReader(input);
     
     int sum = 0;
     String[] numbers;
     
     System.out.println("Reading numbers from " + fileName);

     String line = inputBuffer.readLine();
        
      System.out.println(line);
      numbers = line.split(" ");
        


      int [] nums = new int[numbers.length];
      
      for (int i = 0; i < numbers.length; i++){
         int n = Integer.parseInt(numbers[i]);
         nums[i] =  n;
     }
       
       for(int i = 0; i < nums.length; i++){
                sum += nums[i];
       }
      
      System.out.println("Total is " + sum);
      
      inputBuffer.close();
}
}