package ProblemsInSearch;

import java.util.Arrays;

public class OccurenceCountsInSortedArray {

  public static void main(String args[]){
    int[] a = {1,1,5,6,3,4,5,6,7,7};
    Arrays.sort(a);
    printArray(a);
    System.out.println("===>" +getOccurenceOfElement(a, 7));


  }

  // Brute force appoach
  public static int getOccurenceOfElement(int[] a, int find){
    int count = 0;
    for(int i=0; i<a.length-1;i++){
      if(a[i] == find){
        count = count +1;
      }
    }
    return count;
  }

  // Binary Search Approach
//  int[] a = {1,1,5,6,3,4,5,6,7,7};

  public static void printArray(int[] a ){
    for(int i =0; i< a.length; i++){
      System.out.print(a[i] +" ");
    }
  }
}
