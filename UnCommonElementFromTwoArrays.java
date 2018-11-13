package arrays.problems;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UnCommonElementFromTwoArrays {

  public static void main(String args[]) {
    Integer[] a = {10, 20, 30};
    Integer[] b = {20, 25, 30, 40, 50};
    Arrays.sort(a);
    Arrays.sort(b);
    List<Integer> newList = unCommanElementsUsingList(a, b);
    for(Integer i: newList){
      System.out.print(i +" ");
    }

    int[] a1 = {10, 20, 30,50};
    int[] b1 = {20, 25, 30, 40, 50,60};
    Arrays.sort(a1);
    Arrays.sort(b1);

    unCommanEleementUsingArrays(a1, b1);

  }

// Arrays only
  public static void unCommanEleementUsingArrays(int[] a, int[] b){

    int an = a.length;
    int bn = b.length;

    int i =0, j =0;
    while(i < an && j < bn ){
      if(a[i] < b[j]){
        System.out.print(a[i] + " ");
        i++;
        j++;
      } else if(b[j] < a[i]){
        System.out.print(b[j] + " ");
        i++;
        j++;
      } else {
        i++;
        j++;
      }

      while(i < an){
        System.out.print(a[i] + " ");
        i++;
        j++;
      }
      while(j < bn){
        System.out.print(b[j] + " ");
        i++;
        j++;
      }



    }

  }

  // Using List
  public static List<Integer> unCommanElementsUsingList(Integer[] a, Integer[] b){

    List<Integer> listA = Arrays.asList(a);
    List<Integer> listB = Arrays.asList(b);
    List<Integer> mainList = new ArrayList<>();

    for(Integer i : listA){
      if(!listA.contains(i)){
        mainList.add(i);
      }
    }

    for(Integer i : listB){
      if(!listB.contains(i)){
        mainList.add(i);
      }
    }
    return mainList;
  }
}
