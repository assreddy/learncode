package arrays.problems;

import java.util.Arrays;

public class MostFrequentElement {
  public static void main(String args[]){
    int[] a = {70,70,70,80,80,20,20,20,20,20};
    Arrays.sort(a);
    System.out.println(maxFrequencyCount(a));
  }

  public static int maxFrequencyCount(int[] a){

    int maxCount = 1;
    int currentCount = 0;
    int element = a[0];

    for(int i=1; i< a.length; i++ ) {

      if (a[i] == a[i - 1]) {
        currentCount++;
      } else {
        if (currentCount > maxCount) {
          maxCount = currentCount;
          element = a[i - 1];
        } else {
          currentCount = 1;
          element = a[i - 1];
        }
      }
    }
    if(currentCount > maxCount){
      maxCount = currentCount;
      element = a[a.length-1];
    }

    System.out.println("Element = " +element +" and frequency = " + maxCount);
    return  element;
  }
}
