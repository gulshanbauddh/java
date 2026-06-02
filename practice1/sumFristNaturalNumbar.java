package practice1;

import java.util.Scanner;

public class sumFristNaturalNumbar {
  public int sum = 0;
  public static int sumNum(int num){
    if (num == sum){
      System.out.println("The sum is " + sum);
      return 0;
    }
    sum=sum+1;
    sumNum(num++);++++++++++++++++++++++++++++
  }
  static void main() {
    System.out.print("Enter limit:");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    sumNum(num);
  }
}
