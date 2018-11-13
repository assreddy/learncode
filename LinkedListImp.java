package dsimplementations;

// http://www.mathcs.emory.edu/~cheung/Courses/171/Syllabus/8-List/

class Link{

  public int idata;
  public double ddata;
  public Link next;

  public Link(int id, double dd){
    idata = id;
    ddata = dd;
  }

  public void displayLink(){
    System.out.println("id =" +idata +" : "  +"data = " + ddata);

  }
}

class LinkedList{

  public Link first;

  public boolean isEmpty(){
    return (first == null);
  }

  public void LinkFirst(){
    first = null;
  }

  public void insertFirst(int id, double dd){
    Link newLink = new Link(id, dd);
    newLink.next = first;
    first = newLink;
  }

  public void insertLast(int id, double dd){
    Link newLink = new Link(id, dd);
    Link n = first;
    while(n.next != null){
      n=n.next;
    }
    n.next=newLink;
  }

  public void insert(int id, double dd){
    Link newLink = new Link(id, dd);
    if(first == null){
      first=newLink;
    } else {
      Link n = first;
      while(n.next != null){
        n = n.next;
      }
      n.next=newLink;
    }
  }

  public Link deleteFirst(){
    Link temp = first;
    first = temp.next;
    return  temp;
  }

  public Link deleteLast(){
    Link current = first;
    Link currentNext = first.next;
    while(currentNext != null){
      current = currentNext;
      currentNext = currentNext.next;
    }
    current.next=null;
    return current;
  }

  public void displayLinkedList(){
    Link current = first;
    while(current != null){
      current.displayLink();
      current = current.next;
    }
    System.out.println(" ");
  }

  public int size(){
    int count = 0;
    Link current = first;
    while (current != null){
      current= current.next;
      count++;
    }
    return count;
  }

  public Link find(int key){
    Link current = first;
    while(current.idata != key){
      if(current.next==null){
        return null;
      } else {
        current= current.next;
      }
    }
    return current;
  }

  public Link delete(int key){
    Link current = first;
    Link previous = first;
    while(current.idata != key){
      if(current.next==null){
        return null;
      }else {
        previous = current;
        current = current.next;
      }
    }
    if(current== first){
      first = first.next;
    } else {
      previous.next = current.next;
    }
    return current;
  }
}

public class LinkedListImp {

  public static void main(String args[]){
    System.out.println("Testing");
    LinkedList ll = new LinkedList();
    ll.insertFirst(1,10.10);
    ll.insert(2,20.20);
    ll.insertFirst(3,30.20);
    ll.insertFirst(4,40.30);
    ll.insert(5,50.40);
    ll.insertLast(6,60.60);

 /*   System.out.println(ll.isEmpty());*/
    System.out.println(ll.size());
    ll.displayLinkedList();
    Link key = ll.find(6);
    key.displayLink();
/*    Link delKey = ll.delete(6);
    delKey.displayLink();*/
    System.out.println("------------");
    Link lastDel = ll.deleteLast();
    lastDel.displayLink();
    System.out.println("===================");
    ll.displayLinkedList();
    System.out.println(ll.size());

  }
}
