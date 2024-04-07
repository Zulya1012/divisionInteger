import java.util.Scanner;
public class Method1 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Input an integer:");
    int n = s.nextInt();
    System.out.print("Factors of 3 of the said integer:");
    test(n);
  }

  public static void test(int n) {
    System.out.print(n + " = ");
    int result = n;
    while (result % 3 == 0) {
      System.out.print("3 * ");
      result = result / 3;
    }
    System.out.print(result);
  }
}
