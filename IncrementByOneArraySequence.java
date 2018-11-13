package GInt;

/*Find length of longest sequence in list of elements 1 5 2 3 4 5 4 8 7 6 (sequence is consecutive
elements incremented by 1 or decremented by 1 ,
in this case 2 3 4 5 is one sequence 8 7 6 is one sequence)?*/

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*public class IncrementByOneArraySequence {

  public static void main(String args[]) {

    int[] input = {1, 5, 2, 3, 4, 5, 4, 8, 7, 6};
    System.out.println("Testing");
    Set<Integer> incrementSet = new HashSet<>();
    Set<Integer> decrementSet = new HashSet<>();
    HashMap<Integer, Set<Integer>> map = new HashMap<>();
    int count = 0;
    for(int i=0; i< input.length-1; i++){
     // System.out.print(input[i] +" ");
      if(Math.abs(input[i] - input[i+1]) == 1){
        System.out.println(input[i]);
        incrementSet.add(input[i]);

      } else ((Math.abs(input[i+1] - input[i])) == 1)) {
        decrementSet.add(input[i]);

      }
      map.put(count +1 , exptSet);


      }

    }
    System.out.println(exptSet.toString());


  }
}*/
