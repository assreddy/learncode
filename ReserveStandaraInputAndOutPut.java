package ds.stacks.examples;

import java.util.Stack;

public class ReserveStandaraInputAndOutPut {

  public static void main(String args[]){
    System.out.println("Testing new Jobs");
    String st = "it was the best of times";
    StringBuilder sb = new StringBuilder();
    Stack<String> stack = new Stack<>();

    String[] stArray = st.split(" ");

    for(String s : stArray){
      stack.push(s);
    }


    while(!stack.isEmpty()) {
      sb.append(stack.pop()).append(" ");
    }
    System.out.println(sb.toString());
  }
}
