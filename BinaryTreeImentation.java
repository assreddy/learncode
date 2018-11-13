package BinaryTrees;

class BTNode{
  int data;
  double fdata;
  BTNode left, right;


  public BTNode(){
    left = null;
    right = null;
    data =0;
    fdata = 0;
  }

  public BTNode(int data) {
    left = null;
    right = null;
    data = data;
  }

  public int getData() {
    return data;
  }

  public void setData(int data) {
    this.data = data;
  }

  public BTNode getLeft() {
    return left;
  }

  public void setLeft(BTNode left) {
    this.left = left;
  }

  public BTNode getRight() {
    return right;
  }

  public void setRight(BTNode right) {
    this.right = right;
  }
}


class BT{
  private BTNode root;

  private BT(){
    root = null;
  }

  public boolean isEmpty(){
    return root == null;
  }

  public void insert(int id, double dd){
    BTNode newNode = new BTNode();
    newNode.data = id;
    newNode.fdata = dd;

    if(root == null){
      root = newNode;
    } else {
      BTNode current = root;
      BTNode parent;
      while(true){
        parent = current;
        if(id < current.fdata){
          current = current.left;
          if(current == null){
            parent.left = newNode;
            return;
          }
        } else {
          current =  current.right;

        }
      }
    }

  }

}

public class BinaryTreeImentation {

  public static void main(String args[]){
    System.out.println("Testing Binary Tree");
  }

}
