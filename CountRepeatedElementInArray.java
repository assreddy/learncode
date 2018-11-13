package arrays.problems;

import java.util.Arrays;

public class CountRepeatedElementInArray {

  public static void main(String args[]){
    int[] a = {1, 2, 3, 4, 4, 4, 5, 6};
    Arrays.sort(a);
    System.out.println(countRepeatElements(a));

  }

  public static int countRepeatElements(int[] a){

    int j =0;
    int count =1;
    int indexElement = 0;
    for(int i=1; i< a.length; i++){
      if(a[i] == a[j]){
        count++;
        indexElement=j;
      } else {
        count =1;
      }
      j=i;
    }
    System.out.println("Elemement = " +indexElement +" and count =" +count);
    return count;
  }

}
