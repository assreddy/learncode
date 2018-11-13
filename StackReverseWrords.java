import java.util.Stack;

public class StackReverseWrords {

  public static void main(String args){
    System.out.println("Reverse words using Stack");
    String str = "Hello World";
    Stack<Character> stackChars = new Stack<>();
    for(int i=0; i<str.length();i++) {
      stackChars.push(str.charAt(i));
    }
    System.out.println(stackChars.toString());
  }

}
