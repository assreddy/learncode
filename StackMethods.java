import java.util.List;
import java.util.Stack;

public class StackMethods {
  public static void main(String args[]){
    System.out.println("Testing Stack Methods...");
    Stack<String> strStack = new Stack<>();
    strStack.push("Sree");
    strStack.push("Amita");
    strStack.push("Dheeraj");
    strStack.push("Sarada");
    System.out.println(strStack.empty());
    System.out.println(strStack.toString());
    System.out.println(strStack.peek());
    System.out.println(strStack.toString());
    System.out.println(strStack.pop());
    System.out.println(strStack.toString());
    System.out.println(strStack.search("Dheeraj"));

    System.out.println("Reverse words using Stack");
    String str = "Hello World";
    Stack<Character> stackChars = new Stack<>();
    for(int i=0;i<str.length();i++) {
      stackChars.push(str.charAt(i));
    }

    while(stackChars.empty() == false){
      System.out.print(stackChars.pop());
    }
    //System.out.println(stackChars.toString());
  }
}
