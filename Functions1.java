import java.util.*;

public class Functions1 {

  public static int calculateProd(int a, int b) {

    return a*b;
  }
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    System.out.println("multiply 2 numbers is : "+ calculateProd(a, b));
  }
}
