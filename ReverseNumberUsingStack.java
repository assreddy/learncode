package geeksforgeeks.stack;

import java.util.Stack;

public class ReverseNumberUsingStack {
  public static void main(String args[]){
    int input = 12345;
    System.out.println(reverseInteger(input));
  }

  public static Stack<Integer> pushIntToStack(int input) {
    Stack<Integer> stackInput = new Stack<>();
    while(input != 0) {
      int eachDigit = input%10;
      stackInput.push(eachDigit);
      input = input/10;
    }
    return stackInput;
  }

  public static int reverseInteger(int input){
    Stack<Integer> stacktest = pushIntToStack(input);
    int reverseNumber = 0;
    int i=1;

    while(!stacktest.isEmpty()){
      reverseNumber = reverseNumber+(stacktest.peek()*i);
      stacktest.pop();
      i = i*10;
    }
    return reverseNumber;
  }
}
