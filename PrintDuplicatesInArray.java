package ProblemsInSearch;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class PrintDuplicatesInArray {


  public static void main(String args[]){
    System.out.println("Finding duplicates in an Array");
    int[] a = {1,1,5,6,3,4,5,6,7,7};
    //printArray(a, a.length);
    System.out.println("---------");

//    printDuplicatesInArray(a, a.length);
    //getDuplicatesUsingSortedArray(a, a.length);
    getDuplicateHashSet(a, a.length);

  }

  // print Array based on size of array.
  public static void printArray(int[] a, int arraySize){
    for(int i=0; i< arraySize; i++) {
      System.out.print(a[i]);
    }
  }
  // Brute Force Method: Complexity 0(n2) and Space (0(1))
  public static void printDuplicatesInArray(int[] a, int size){
    PrintDuplicatesInArray p = new PrintDuplicatesInArray();
    int[] newArray = new int[size];
    int newIndex =0;
    for(int i=0; i<size; i++){
      for( int j = i+1; j<size; j++){
        if(a[i] == a[j]){
          System.out.print(a[i] +" ");
          newArray[newIndex++] = a[i];
        }
      }
    }
    System.out.println("Final....");
    p.printArray(newArray, newIndex);
  }

  // Sort Array and then find by comparing the next element ==Complexity O(n.logn) and O(1)
  public static void getDuplicatesUsingSortedArray(int[] a , int size){
    Arrays.sort(a);
    int index =0;
    for(int i=0; i<size; i++){
      if(a[i] == a[i+1]) {
        System.out.print(a[i] +" ");
      }
    }
  }

  // HashTable O(n) and O(1)
  public static void getDuplicateHashSet(int[] a, int size) {
    HashSet<Integer> hset = new HashSet<>();
    for (int i = 0; i < size; i++) {
      if (hset.contains(a[i])) {
        System.out.print(a[i] + " ");
      } else {
        hset.add(a[i]);
      }
    }
  }

  // HashMap
  public static void getDuplicateHashMap(int[] a, int size){
    System.out.println("Testing");
    HashMap<Integer, Integer> hMap = new HashMap<>();
    for(int i=0; i<size; i++){

    }

  }


  // Counting Approach


}
