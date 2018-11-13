package geeksforgeeks.stack;

//Delete consecutive same words in a sequence

import java.util.Stack;
import java.util.Vector;

public class DeleteConsecutiveSameWordsInSequence {

  public static void main(String args[]){
    Vector<String> stringVector = new Vector<>();
    stringVector.add("ab");
    stringVector.add("aa");
    stringVector.add("aa");
    stringVector.add("bcd");
    stringVector.add("ab");
    System.out.println(stringVector.toString());
    System.out.println(deleteConsectiveSameWords(stringVector).toString());
  }

  public static Vector<String> deleteConsectiveSameWords(Vector<String> inputVector){
    Stack<String> stackWords = new Stack<>();

    for(int i=0; i< inputVector.size(); i++){
      String word = inputVector.get(i);
      System.out.println(word);
      if(stackWords.isEmpty()){
        stackWords.push(word);
      } else {
        if(word.equals(stackWords.peek())){
          stackWords.pop();
          inputVector.remove(word);
        }else{
          stackWords.push(word);
        }
      }
    }
    System.out.println(stackWords.size());
    return inputVector;
  }

}
