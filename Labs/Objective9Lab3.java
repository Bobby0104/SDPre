import java.util.Scanner;
public class Objective9Lab3 {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    int selection;
    while (true) {
      printMessage();
      selection = kb.nextInt();
      if(selection == 1) {
        System.out.println(" Say Hello");
      }
      else if(selection == 2) {
        System.out.println(" Apples, Bananas, Coconuts");
      }
      else if(selection == 3) {
        System.out.println(" Exit");
        break;
      }

    }
    kb.close();

  }
  public static void printMessage() {
    System.out.println("_____Menu_____");
    System.out.println("1: Say Hello");
    System.out.println("2: List My favorite food");
    System.out.println("3: Exit");
    System.out.println();
  }
}
