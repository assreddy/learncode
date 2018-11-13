public class LinkedList {
  static node head;
  static class node
  {
    int val;
    node next;

    public node(int val)
    {
      this.val = val;
    }
  }

  void printList(node head){
    while(head != null){
      System.out.println(head.val);
      head = head.next;
    }
  }

  void removeDuplicates(){
    node ptr1 =null, ptr2 = null, dup = null;
    ptr1 = head;

    while(ptr1 != null && ptr1.next != null){
      ptr2 = ptr1;
      while(ptr2.next != null){
        if(ptr1.val == ptr2.next.val){
          dup = ptr2.next;
          ptr2.next = ptr2.next.next;
          System.gc();
        } else {
          ptr2 = ptr2.next;
        }
      }
      ptr1 = ptr1.next;
    }
  }

  public static void main(String args[]){
    System.out.println("Linked List");

    // 10->12->11->11->12->11->10
    LinkedList list = new LinkedList();

    //node start = new node(10);
    list.head =  new node(10);
    list.head.next =  new node(12);
    list.head.next.next =  new node(11);
    list.head.next.next.next =  new node(11);
    list.head.next.next.next.next =  new node(12);
    list.head.next.next.next.next.next =  new node(11);
    list.head.next.next.next.next.next.next =  new node(10);
    list.removeDuplicates();



    list.printList(head);
  }

}
