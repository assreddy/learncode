package geeksforgeeks.stack;

import java.util.Stack;

// Length of the longest valid substring
//((()
public class LengthOfLongestSubString {
  public static void main(String args[]){
    String inputExp = "((()";
    System.out.println(inputExp);
    System.out.println(longestValidExp(inputExp));
  }

  public static String longestValidExp(String inputExp){

    Stack<Character> expStack = new Stack<>();
    int result = 1;
    for(int i=0; i< inputExp.length(); i++){
      Character expChar = inputExp.charAt(i);
      System.out.println(expChar);
      if(expChar == '(') {
        expStack.push(expChar);
      } else if(expChar == ')'){
        expStack.pop();
        result++;
        System.out.println(expStack.peek());
        System.out.println(result);
      }
    }

    return expStack.toString();
  }

}
