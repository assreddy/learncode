package arrays.problems;

import java.util.HashMap;
import java.util.Map;

public class PairOfElementsWithSum {
  public static void main(String args[]){
    System.out.println("Testing");
    int[] a = {2,45,7,3,5,1,8,9};
    System.out.println(getPairValues(a, 10));
  }

  public static Map<Integer, Integer> getPairValues(int[] a, int sum){
    Map<Integer, Integer> map = new HashMap<>();
    for(int i =0; i< a.length; i++){

      int avalue = a[i];

      if(map.containsKey(avalue) && avalue <=10){
        System.out.println(avalue +", "+ map.get(avalue));
      } else {
        map.put(sum-avalue, avalue);
      }
    }
    return map;

  }

}
