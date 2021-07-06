import java.util.Random;
import java.util.Scanner;


class diceGame {
    public static void main(String args[]) {
      Random rand = new Random();
      int total =0;
      Scanner scanner = new Scanner(System.in);
      System.out.println("What is your name?");
      System.out.print(">");
      String input_text = scanner.nextLine();
      System.out.println("Hello,"+input_text+"!");
 //     int num = rand.nextInt(6)+1;
 System.out.println("Rolling the dice...");
      for(int i=0;i<2;i++){ 
        int num = rand.nextInt(6)+1;   
      System.out.println("Die"+ (i+1)+":"+num);
        total += num;
      }
    System.out.println("Total value:"+total);
    }
  }