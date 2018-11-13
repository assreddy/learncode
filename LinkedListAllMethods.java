import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListAllMethods {

  public static void main(String args[]){
    System.out.println("Testing Linked List Methods");
    LinkedList<Integer> lList = new LinkedList<>();
    lList.add(10);
    lList.add(11);
    lList.add(12);
    lList.add(11);
    lList.add(13);
    lList.add(14);
    lList.add(14);

    System.out.println(lList);
/*    System.out.println(lList.size());
    System.out.println(lList.get(0));
    System.out.println(lList.getFirst());
    System.out.println(lList.getLast());
    System.out.println(lList.lastIndexOf(lList));
    System.out.println("-------");
    System.out.println(lList.pollFirst());
    System.out.println(lList.pollLast());
    System.out.println(lList.poll());
    System.out.println(lList);
    System.out.println("******");
    System.out.println(lList.peek());
    System.out.println(lList.peekFirst());
    System.out.println(lList.peekLast());
    System.out.println(lList.peek());
    System.out.println(lList.toArray());*/
/*    lList.remove(2);*/
    lList.removeFirstOccurrence(11);
    ListIterator<Integer> lt  = lList.listIterator();
    while(lt.hasNext()){
      System.out.print(lt.next() +" ");
    }
/*


    Object[] lListArray = lList.toArray();
    for(int i =0; i<lListArray.length; i++){
      System.out.print(lListArray[i] +" ");


    }*/

    //System.out.println(lList.pollLast());


/*    int head = lList.getFirst();
    for(int i =2 ; i< lList.size()-1; i++) {
      if (head == lList.get(i+1)){


      }

    }*/

  }

}
