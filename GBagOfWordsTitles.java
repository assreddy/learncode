package GInt.GStrings;


import java.util.ArrayList;
import java.util.List;

public class BagOfWordsTitles {
  public static void main(String args[]){
    System.out.println("Testing");

    List<String> titles = new ArrayList<>();
    titles.add("NEW INDIA BAZAR");
    titles.add("TESTING");

    List<String> words = new ArrayList<>();
    words.add("INDIA");
    words.add("TESTING WORLD");
    System.out.println(isWordContainsTitle(titles, words));

  }

  public static boolean isWordContainsTitle(List<String> titles, List<String> words){
    for(String title : titles){
      System.out.println(title);
      for(String word : words){
        return  title.contains(word);
      }
    }
    return false;
  }

}
