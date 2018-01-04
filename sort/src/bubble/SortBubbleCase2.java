package bubble;

import commons.Debug;
import commons.Swapper;
import factory.DataFactory;

public class SortBubbleCase2 {
  
  public static int[] sort(int[] dataIn) {
    int[] dataOu = null;
    
    if (dataIn == null) {
      return dataOu;
    }
    
    dataOu = new int[dataIn.length];
    
    for (int i = 0; i < dataIn.length; i++) {
      dataOu[i] = dataIn[i];
    }
    
    // optimized
    
    int step = 1;
    
    for (int i = 0; i < dataOu.length - 1; i++) {
      
      boolean swapped = false;
      
      for (int j = 1; j < dataOu.length; j++) {
        
        if (dataOu[j - 1] > dataOu[j]) {
          Swapper.swap(dataOu, j - 1, j);
          swapped = true;
        }
        
        System.out.print(String.format(
            "Step %02d : a = %02d , b = %02d , arr = ", step++, j - 1, j));
        Debug.info(dataOu);
        
      }
      
      // next page
      
      System.out.println();
      
      // if nothing to be swapped again then stop here
      
      if (!swapped) {
        System.out.println("Stopped here");
        System.out.println();
        break;
      }
      
    }
    
    return dataOu;
  }
  
  public static void main(String[] args) throws Exception {
    
    int[] dataIn = DataFactory.randomNumbers(10);
    Debug.info(dataIn);
    System.out.println();
    
    int[] dataOu = sort(dataIn);
    Debug.info(dataOu);
    System.out.println();
    
  }
  
}
