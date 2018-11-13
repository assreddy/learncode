package arrays.problems;

import java.util.Arrays;

public class ClosestNumberInArray {

  public static void main(String args[]){
    int[] a = {1, 2, 4, 25, 6, 6, 8, 9};
    Arrays.sort(a);
    int target = 35;

    int closestNum = 0;
    for(int i=0; i< a.length-1;i++){
      if(closestNum < target){
        if(a[i] < a[i+1]);
        closestNum = a[i+1];
      }
    }
    System.out.println(closestNum);
  }
}
