package GInt;

import java.util.Arrays;

public class FindEvenNumberTimesPresentInArray {

  public static void main(String args[]){
    int[] a = {10,10,10,10,20,20,40,40,40};
    Arrays.sort(a);
    System.out.println(oddNumberInt(a));
  }

  public static int oddNumberInt(int[] a){

    int count =1;
    int j =0;
    int output =0;
    for(int i=1; i< a.length;i++){
      if(a[i] == a[j]){
        count++;
      }
      else {
        count =1;
      }
      if(count%2 ==1){
        System.out.println(count%2);
        output = a[i];
      }

    }
    System.out.println(count);
    System.out.println(count%2);
    return output;
  }

}
