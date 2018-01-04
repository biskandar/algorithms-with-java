package commons;

public class Debug {
  
  public static void info(int[] arr) {
    for (int a : arr) {
      System.out.print(a);
      System.out.print(" ");
    }
    System.out.println();
  }
  
}
