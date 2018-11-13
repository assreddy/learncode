package GInt.Glists;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SynomymsPairToSynonmys {

  public static void main(String args[]) {
    List<String> synPairList1 = new ArrayList<>();
    synPairList1.add("movie");
    synPairList1.add("film");

    List<String> synPairList2 = new ArrayList<>();
    synPairList2.add("review");
    synPairList2.add("rating");

    Map<String, List<String>> synMap = new HashMap<>();
    synMap.put("movie", synPairList1 );
    synMap.put("review", synPairList2 );

    for(Map.Entry<String, List<String>> m: synMap.entrySet()){
      System.out.println(m.getKey() +":" + m.getValue());

    }
    System.out.println(isSynAreValid(synMap, "movie review", "film rating"));

  }

  public static boolean isSynAreValid(Map<String, List<String>>  synMap, String str1, String str2){

    String[] str1Words = str1.split(" ");
    String[] str2Words = str2.split(" ");
    int arraySize = str1Words.length;

    if(str1Words.length != str1Words.length){
      return false;
    }

/*    Map.Entry<String, List<String>> mm = (Entry<String, List<String>>) synMap.entrySet();
    List<String> allSyn = mm.getValue();*/

    for(Map.Entry<String, List<String>> m: synMap.entrySet()){
      //System.out.println(synMap.containsKey(m.getKey()));
      List<String> mValue = m.getValue();
      //System.out.println(mKeys);
      //System.out.println(mValue.toString());
      for(int i=0; i<arraySize; i++){
        if(!m.getValue().contains(str1Words[i])){
          return false;
        }
      }
    }
    return true;
  }
}
