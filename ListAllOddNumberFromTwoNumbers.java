package GInt;

import java.util.HashSet;
import java.util.Set;

public class ListAllOddNumberFromTwoNumbers {

  public static void main(String args[]){
    System.out.println("Testing");
    System.out.println(printAllOddNumbers(10,20).toString());
  }

  public static Set<Integer> printAllOddNumbers(int a, int b){
    Set<Integer> setOddNum = new HashSet<>();
    for(int i=a; i< b; i++){
      System.out.println(i);
      if(i%2 == 1){
        setOddNum.add(i);
      }
    }
    return setOddNum;
  }
}
