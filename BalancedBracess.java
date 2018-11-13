package ds.stacks.examples;

import java.util.Stack;

public class BalancedBracess {

  public static void main(String args[]){
    System.out.println("Testing Bracess");
    String givenString = "[()]{}{[()()]()}";
    System.out.println(checkBalanceBracess(givenString));
    System.out.println(checkBalanceBracess("[(]))"));

  }


  private static boolean checkBalanceBracess(String s){
    Stack<Character> stack = new Stack<>();
    for(int i=0; i<s.length();i++) {
      if (s.charAt(i) == '{') stack.push('{');
      else if (s.charAt(i) == '[')  stack.push('[');
      else if(s.charAt(i) == '(') stack.push('(');
      else if(s.charAt(i) == '}') {
        if (s.isEmpty())
          return false;
        if (stack.pop() != '{')
          return false;
      }
      else if(s.charAt(i) == ')') {
        if (s.isEmpty())
          return false;
        if (stack.pop() != '(')
          return false;
      }
      else if(s.charAt(i) == ']') {
        if (s.isEmpty())
          return false;
        if (stack.pop() != '[')
          return false;
      }
    }
    return stack.isEmpty();
  }

}
