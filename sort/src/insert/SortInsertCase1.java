package insert;

import commons.Debug;
import factory.DataFactory;

public class SortInsertCase1 {
  
  public static int[] sort(int[] dataIn) {
    int[] dataOu = null;
    
    if (dataIn == null) {
      return dataOu;
    }
    
    dataOu = new int[dataIn.length];
    
    for (int i = 0; i < dataIn.length; i++) {
      dataOu[i] = dataIn[i];
    }
    
    // ... to be continued ...
    
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
