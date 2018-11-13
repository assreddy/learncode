package GInt.Glists;

import java.util.ArrayList;
import java.util.List;

public class GivenTwoListsContainsSecondOne {
  public static void main(String args[]){
    System.out.println("Testing");
    List<Integer> l1 = new ArrayList<>();
    l1.add(1);
    l1.add(2);
    l1.add(10);
    l1.add(20);
    l1.add(30);


    List<Integer> l2 = new ArrayList<>();
    l2.add(10);
    l2.add(20);
    l2.add(30);
    System.out.println(l1);
    System.out.println(l2);

    System.out.println(listAContainsB(l1, l2));


  }

  public static boolean listAContainsB(List<Integer> l1, List<Integer> l2) {

 /*   for(Integer i: )*/

    return l2.contains(l1);
  }

}
