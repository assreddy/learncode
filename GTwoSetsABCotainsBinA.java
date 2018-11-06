package GInt;

import java.util.ArrayList;
import java.util.List;

public class TwoSetsABCotainsBinA {

  public static void main(String args[]){
    List<Integer> al1 = new ArrayList<>();
    al1.add(1);
    al1.add(2);
    al1.add(3);
    al1.add(4);

    List<Integer> al2 = new ArrayList<>();
    al2.add(5);
    al2.add(4);
    System.out.println(isSubList(al1, al2));
  }
  
  public static boolean isSubList(List<Integer> al1, List<Integer> al2){
    if(al1.containsAll(al2)){
      for(int i=0; i<al2.size()-1; i++){
        int al2Value = al2.get(i);
        for(int j=i; j<al1.size()-1;j++){
          int al1Value = al1.get(j);
          if(al2Value !=  al1Value) {
            break;
          }
/*          if(j == al2.size())
            return false;*/
        }
      }
    }
    return true;
  }

}

