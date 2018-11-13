package LinkedLists;

import java.util.Iterator;
import java.util.LinkedList;

public class JLinkedListUsage {

  public static void main(String args[]){
    LinkedList<String> ll = new LinkedList<>();
    ll.add("John");
    ll.add("David");
    ll.add("Lara");

    Iterator<String> it = ll.iterator();
    while(it.hasNext()){
      String name = it.next();
      System.out.println(name);
    }
  }

}
