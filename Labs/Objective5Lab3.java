import java.util.Scanner;
public class Objective5Lab3 {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    int userNum;
    System.out.println("Please enter a number:");
    userNum = kb.nextInt();
    if(userNum > 0) {
      System.out.println("The number is positive.");
    }
    else if(userNum == 0) {
      System.out.println("The number is equal to.");

    }
    else if(userNum < 0) {
      System.out.println("The number is negative.");

      }
      kb.close();




  }
}
