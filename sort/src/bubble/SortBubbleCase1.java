package bubble;

import commons.Debug;
import commons.Swapper;
import factory.DataFactory;

public class SortBubbleCase1 {
  
  /*
   * Although bubble sort is one of the simplest sorting algorithms to
   * understand and implement, its O(n^2) complexity means that its efficiency
   * decreases dramatically on lists of more than a small number of elements.
   * Even among simple O(n^2) sorting algorithms, algorightms like insertion
   * sort are usually considerable more efficient
   */
  
  public static int[] sort(int[] dataIn) {
    int[] dataOu = null;
    
    if (dataIn == null) {
      return dataOu;
    }
    
    dataOu = new int[dataIn.length];
    
    for (int i = 0; i < dataIn.length; i++) {
      dataOu[i] = dataIn[i];
    }
    
    int step = 0;
    
    for (int i = 0; i < dataOu.length - 1; i++) {
      for (int j = 1; j < dataOu.length; j++) {
        
        if (dataOu[j - 1] > dataOu[j]) {
          Swapper.swap(dataOu, j - 1, j);
        }
        
        System.out.print(String.format(
            "Step %02d : a = %02d , b = %02d , arr = ", step++, j - 1, j));
        Debug.info(dataOu);
        
      }
      
      // next page
      System.out.println();
      
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
