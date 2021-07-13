public class Objective7Lab4{
  public static void main(String[] args){
    int counter = 1;
    int curSum = 0;

    while(counter <= 20){
      curSum += counter;
      counter++;
    }
    System.out.println(curSum);
  }
}
