package GInt.Glists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfLists {
  public static void main(String args[]){
    System.out.println("Intersection of two Lists");

    List<Integer>  l1 = new ArrayList<>();
    l1.add(2);
    l1.add(6);
    l1.add(3);
    l1.add(0);
    l1.add(2);
    l1.add(7);
    l1.add(6);

    List<Integer>  l2 = new ArrayList<>();
    l2.add(8);
    l2.add(0);
    l2.add(2);
    l2.add(9);
    l2.add(2);
    l2.add(0);
    System.out.println(intersectionOfArrays(l1, l2));
  }

  public static List<Integer> intersectionOfArrays(List<Integer> l1, List<Integer> l2){
    List<Integer>  outPutList = new ArrayList<>();
    if(l1.size() > l2.size()) {
      for (Integer l : l1) {
        if (l2.contains(l)) {
          outPutList.add(l);
        }
      }
    } else if(l1.size() < l2.size()){
      for (Integer l : l2) {
        if (l1.contains(l)) {
          outPutList.add(l);
        }
      }
    }
    return outPutList;
  }
}
