import java.util.*;

public class Num2 {

  public static void main(String ars[]) {
    int n = 5;
    for(int i=1; i<=n; i++) {
      for(int j=1; j<=n-i+1; j++) {
        System.out.print(j+" ");
      }
      System.out.println();
    }
  }
}
