package LinkedLists;

import java.util.Collections;
import java.util.LinkedList;

public class MergeTwoLinkedLists {


  public static LinkedList<Integer> MergeTwoLinkedLists(LinkedList<Integer> ll1, LinkedList<Integer> ll2){

    LinkedList<Integer> mergll = new LinkedList<>();
    for(Integer l1 : ll1){
      for(Integer l2 : ll2){
        if(l1 < l2){
          if(!mergll.contains(l1)){
            mergll.add(l1);
          }
        }
        if(l1 < l2) {
          if (!mergll.contains(l2)) {
            mergll.add(l2);
          }
        }
      }
    }

    System.out.println(mergll.toString());
    return  mergll;

  }


  public static void main(String args[]){
    LinkedList<Integer> ll1 = new LinkedList<>();
    ll1.add(10);
    ll1.add(20);
    ll1.add(30);
    Collections.sort(ll1);
    System.out.println(ll1.toString());

    LinkedList<Integer> ll2 = new LinkedList<>();
    ll2.add(40);
    ll2.add(50);
    ll2.add(60);

    Collections.sort(ll2);
    System.out.println(ll2.toString());

    MergeTwoLinkedLists(ll1, ll2);



  }

}
