import java.util.Scanner;
public class Objective4Lab2 {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    System.out.println("Please enter the first number you would like to add.");
    int num1 = kb.nextInt();
    System.out.println("Please enter the second number you would like to add.");
    int num2 = kb.nextInt();
    System.out.println("Please enter the third number you would like to add.");
    int num3 = kb.nextInt();
    System.out.println("Please enter the first decimal number you would like to add.");
    double dub1 = kb.nextDouble();
    System.out.println("Please enter the second decimal number you would like to add.");
    double dub2 = kb.nextDouble();
    System.out.println("Please enter the third decimal number you would like to add.");
    double dub3 = kb.nextDouble();
    int sum1 = num1 + num2 + num3;
    double sum2 = dub1 + dub2 + dub3;
    System.out.println("The sum1 of " + num1 + " and " + num2 + " and " + num3 + " is " + sum1 + " . ");
    System.out.println("The sum2 of " + dub1 + " and " + dub2 + " and " + dub3 + " is " + sum2 + " . ");

  }
}
