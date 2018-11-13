package geeksforgeeks.stack;

import java.util.Stack;

public class ReverseStringUsingStack {

  public static void main(String args[]){
    String givenString = "GeeksQuiz";
    System.out.println(givenString);
    System.out.println(reverseStringWithStack(givenString));
  }

  public static String reverseStringWithStack(String givenString){
    Stack<Character> stackStr = new Stack<>();
    for(int i=0; i<givenString.length(); i++){
      stackStr.push(givenString.charAt(i));
    }
    StringBuilder sb = new StringBuilder();
    while(!stackStr.isEmpty()){
      sb.append(stackStr.peek());
      stackStr.pop();
    }
    return sb.toString();
  }

}
