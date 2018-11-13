package geeksforgeeks.arrays;

import java.util.HashSet;
import java.util.Set;

public class SubArrays {

  public static void main(String args[]){
    int[] a = {7,8,9,9,3,2,1,22,25,26};
    subArray(a);
  }

  public static int[] subArray(int[] a ){


    int[] newI = new int[a.length];
    int[] newD = new int[a.length];
    Set<Integer> setI = new HashSet<>();
    Set<Integer> setD = new HashSet<>();
    int current = a[0];
    int iI = 0;
    int iD = 0;
    for(int i=1; i< a.length; i++){
      int next = a[i];
      //int next = a[i+1];

      if(current-next == -1){
        setI.add(current);
        setI.add(next);
        newI[iI] = current;
        newI[iI+1] = next;
        iI = iI+2;
        current = next;
      } else if (current-next == 1){
        newD[iD] = current;
        newD[iD+1] = next;
        setD.add(current);
        setD.add(next);
        iD=iD+2;
        if(a.length == current){
          newD[iD]=a[a.length];
        }
        current = next;

      } else {
        current = next;
      }

    }

    System.out.println(setI.toString());
    System.out.println(setD.toString());

    for(int i=0; i<newI.length;i++){
      System.out.print(newI[i] +" ");
    }

    System.out.println();

    for(int i=0; i<newD.length;i++){
      System.out.print(newD[i] +" ");
    }





    return new int[] {1,2,3};
  }

}
