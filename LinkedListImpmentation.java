package dsimplementations;

import java.util.List;

class LinkNode{
  private int data;
  private LinkNode next;

  public LinkNode(int data){
    this.data=data;
  }

  public void setData(){
  }

  public int getData(){
    return data;
  }

  public void setNext(LinkNode next){
    this.next = next;
  }
  public LinkNode getNext(){
    return next;
  }

  public void displayLinkNode(){
    System.out.print(+getData() + " ");
  }

}

public class LinkedListImpmentation {

  int lenght = 0;
  LinkNode head;

  public LinkedListImpmentation(){
    lenght = 0;
  }

  public int getLenght() {
    return lenght;
  }

  public LinkNode getHead() {
    return head;
  }

  public void insertAtBegin(int data){
    LinkNode node = new LinkNode(data);
    node.setNext(head);
    head = node;
    lenght++;
  }

  public void insertAtEnd(int data){
    LinkNode node = new LinkNode(data);
    LinkNode n = head;
    if(head == null){
      head = node;
    } else{
      LinkNode p, q;
      for(p = head; (q=p.getNext())!=null; p=q){
        p.setNext(node);
      }

    }


/*    while(n.getNext() != null) {
      n = n.getNext();
    }
    n.next = node;*/
/*    n.getNext() = node;*/
  }

  public void insertAtPosition(int data, int position){
    LinkNode node = new LinkNode(data);


  }

  public void display(){
    LinkNode current = head;
    while(current != null){
      current.displayLinkNode();
      current = current.getNext();
    }
    System.out.println("");
  }

  public String toString(){
    String result = "[";
    if(head == null){
      return result+"]";
    }
    result = result+head.getData();
    LinkNode temp= head.getNext();
    while(temp != null){
      result = result + ", " +temp.getData();
      temp = temp.getNext();
    }
    return result + "]";
  }



  //
  public static void main(String args[]){
    System.out.println("testing");
    LinkedListImpmentation ll = new LinkedListImpmentation();
    System.out.println(ll.getHead());
    ll.insertAtBegin(20);
    ll.display();
    ll.insertAtBegin(10);
    ll.display();
    ll.insertAtEnd(30);
    System.out.println(ll.getLenght());
    ll.insertAtEnd(40);
    System.out.println(ll.getLenght());
  }
}
