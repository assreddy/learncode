package ProblemsInSearch;

import java.util.Arrays;

public class BinarySearch {

  public static void main(String args[]){
    System.out.println("Testing Binary Search");
    int[] a = {10,30,40,50,60,80,40,50};
    System.out.println(a.length-1);
    Arrays.sort(a);
    printArray(a);
    System.out.println(binarySearch(a, 80));
  }

  public static int binarySearch(int[] a, int key) {
    int first = 0;
    int last = a.length - 1;

    while (first <= last) {
      int mid = (first + last) / 2;
      if(a[mid] == key){
        return mid;
      }else if(a[mid] < key){
        first = mid+1;
      }else {
        last = mid -1;
      }
    }
    return -1;
  }


  public static void printArray(int[] a) {
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i] + " ");
    }
    System.out.println();
  }

}
