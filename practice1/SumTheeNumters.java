import java.util.Scanner;

public class SumTheeNumters {
  public static void main(String[] args) {
    int a, b, c, d;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter Value a");
    a = s.nextInt();
    System.out.println("Enter Value b");
    b = s.nextInt();
    System.out.println("Enter Value c");
    c = s.nextInt();
    d = a + b + c;
    System.out.println("Sum=" + d);    
    s.close();
  }
}
