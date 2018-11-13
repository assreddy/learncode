/*Find the length of the non repeated numbers in an array. Input : 1,2,2,3,4,5,6,2,3*/

import java.util.HashSet;
import java.util.*;

public class FindLenghtOfNonRepitativeLenth {

  public static void main(String args[]){
      int[] input = {1,2,2,3,4,5,6,2,3};
    System.out.println("Lenght Using String=" +leghtOfNoneDuplicateArrray(input));
    System.out.println("Length Using Set = " +lengthOfNonDuplicateUsingSet(input));
  }
  // Using String and comparing.
  private static int leghtOfNoneDuplicateArrray(int[] input){
    String str = "";
    for(int i=0; i<input.length;i++){
      String tmp = String.valueOf(input[i]);
      if(!str.contains(tmp)){
        str = str+tmp;
      }
    }
    return str.length();
  }
  // Using Set
  private static int lengthOfNonDuplicateUsingSet(int[] input){

    Set<Integer> setIntput = new HashSet<>();
    for(int i=0; i<input.length; i++) {
      setIntput.add(input[i]);
    }
    return setIntput.size();
  }
}
