import java.util.*;

public class Num3 {

  public static void main(String ars[]) {
    int n = 5;
    for(int i=1; i<=n; i++) {
      for(int j=1; j<=i; j++) {
        int sum=i+j;
        if(sum % 2 == 0) {
          System.out.print("1");
        } else {
        System.out.print("0");
        }
      }
      System.out.println();
    }
  }
}
