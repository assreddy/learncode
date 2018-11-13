package GInt;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ReturnArrayAfterDeleetingDuplicates {

  public static void main(String args[]){
    System.out.println("Testing");
    int[] a = {10,10,20,30,40,50,60,70};
    Arrays.sort(a);
    System.out.println(removeDuplicates(a).toString());
    System.out.println(removeDuplicateUsingArray(a));
    for(int i=0; i<removeDuplicateUsingArray(a); i++){
      System.out.print(a[i] + " ");
    }
  }

  public static Set<Integer> removeDuplicates(int[] a){
    Set<Integer> setArray = new HashSet<>();
    for(int i=0; i< a.length; i++){
      setArray.add(a[i]);
    }
    return setArray;
  }

  public static int removeDuplicateUsingArray(int[] a){

    int j =0;
    int n = a.length;
    for(int i=1; i< n-1;i++){
      if(a[i] == a[j]){
        j=i;
        n=n-1;
      }
    }
    return n;
  }



}
