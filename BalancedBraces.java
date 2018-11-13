/*
import java.util.*;

public class BalancedBraces {

    public static void main (String args[]){
      System.out.println("String to test balaced braces");
      char[] str = {'{','(',')','}','[',']'};

      private static boolean arePranthesisBalanced(char exp[]){
        Stack stackChars = new Stack<>();
        for (int i = 0; i < exp.length; i++) {
          char ch = exp[i];
          if (ch == '{' || ch == '(' || ch == '[') {
            stackChars.push(ch);
          }
          if (ch == '}' || ch == ')' || ch == ']') {
            if (stackChars.isEmpty()) {
              return false;
            } else if (!isMatchingPair(stackChars.pop(), ch)) {
              return false;
            }
          }
        }
        if (stackChars.isEmpty()) {
          return true;
        } else {
          return false;
        }
      }

      private static boolean isMatchingPair ( char char1, char char2){
        if (char1 == '(' && char2 == ')')
          return true;
        if (char1 == '{' && char2 == '}')
          return true;
        if (char1 == '[' && char2 == ']')
          return true;
        else
          return false;
      }
    }
  }
*/
