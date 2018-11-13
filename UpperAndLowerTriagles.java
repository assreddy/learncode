package Arrays.Matrixs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UpperAndLowerTriagles {

  public static void main(String args[]){
    int[][] mat= { {0, 0, 0, 1}, {0, 1, 1, 1}, {1, 1, 1, 1}, {0, 0, 0, 0}};
    System.out.println(mat.length);



    for(int i=0; i<mat.length; i++){
      for(int j=0; j<mat.length;j++){
        System.out.print(mat[i][j] +" ");
      }
      System.out.println();
    }
    System.out.println();



    List<Integer> l = new ArrayList<>();
    for(int i=0; i<mat.length; i++){
      int count =0;
      for(int j=0; j<mat.length;j++){
        if(mat[i][j] == 1){
          count++;
      }
    }
      l.add(count);
      count = 0;
      System.out.println();
  }
    System.out.println(l.toString());
    System.out.println(Collections.max(l));
  }





}
