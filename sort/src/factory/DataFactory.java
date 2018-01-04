package factory;

import java.util.Random;

public class DataFactory {
  
  private static Random random = new Random();
  
  public static int[] randomNumbers(int size) {
    int[] arr = new int[size];
    for (int idx = 0; idx < arr.length; idx++) {
      arr[idx] = random.nextInt(size);
    }
    return arr;
  }
  
}
