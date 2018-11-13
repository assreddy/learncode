package StringProblems;

import java.util.HashSet;
import java.util.Set;

public class GetAllUsedAplabetDictronryFromWords {

  public static void main (String args[]){
    String[] inputWords = {"rbc","rfa","abc","arc","acc","cer","car","dcba"};
    Set<Character> discSet = new HashSet<>();
    for(int i=0; i<inputWords.length; i++){
      String eachWord = inputWords[i];
      for(int j=0; j< eachWord.length(); j++){
        discSet.add(eachWord.charAt(j));
      }
    }
    System.out.println(discSet.toString());
  }

}
