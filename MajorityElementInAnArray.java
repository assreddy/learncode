package ProblemsInSearch;

import java.util.Arrays;

public class MajorityElementInAnArray {


  public static void main(String args[]) {

    int[] a = {7, 7, 7, 6, 3, 4, 5, 6, 7, 7};
    int[] b = {7, 7, 7, 7, 3, 4, 5, 6, 7, 7};
    System.out.println("Size " + a.length);
    Arrays.sort(a);
    printArray(a);
    System.out.println("==Count Number" +majorirtyElement(a));

  }

  public static int majorirtyElement(int[] a) {
    int mNum = a.length / 2;
    System.out.println("Majority Number = " + mNum);
    int count =0;
    int number=0;
    for (int i = 0; i < a.length - 1; i++) {
      if (a[i] == a[i+1]) {
        count++;
        number = a[i];

      }
    }
    if(count == 5){
      System.out.println("Majority Element =" +number);
      return count;
    } else
      return -1;

  }


    public static void printArray(int[] a) {
      for (int i = 0; i < a.length; i++) {
        System.out.print(a[i] + " ");
      }
      System.out.println();
    }
}
