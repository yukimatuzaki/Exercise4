import java.util.Random;



class diceGame {
    public static void main(String args[]) {
      Random rand = new Random();
      int total =0;
 //     int num = rand.nextInt(6)+1;
 System.out.println("Rolling the dice...");
      for(int i=0;i<2;i++){ 
        int num = rand.nextInt(6)+1;   
      System.out.println("Die"+ (i+1)+":"+num);
        total += num;
      }
    System.out.println("Total value:"+total);
    if(total>7){
      System.out.println("You won");
    }
    else{
      System.out.println("You lost");
    }
    }
  }