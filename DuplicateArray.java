package com.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.swing.text.html.parser.Entity;

public class DuplicateArray {

  public static void main(String args[]) {
    int[] input = {3, 1, 4, 5,-4, 5, 0, 9, -3, 5, 2, 9, 1, -5}; // → [1,5,0,9,]

    for(int i =0; i< input.length; i++){
      if(input[i] < 0){
        input[i] = 0;
      }
    }
    Arrays.sort(input);
    printArray(input);
    System.out.println("-----------");
    printArray(usingArrayLoop(input));
    usingHashSet(input);
    int[] onlyDup = usingHashSet(input);
    System.out.println();
    printArray(onlyDup);
  }

  public static int[] usingArrayLoop(int[] input){
    int[] temp = new int[input.length];
    int j =0;
    for(int i =0; i< input.length-1; i++){
      if(input[i] !=input[i+1]) {
        temp[j++] = temp[i];
      }
    }
    return temp;
  }

  public static int[] usingHashSet(int[] input){
    HashSet<Integer> hset = new HashSet<>();
    int[] dupArray = new int[input.length];
    int[] noDupArray = new int[input.length];
    int dc = 0, c = 0;
    for(int i =0; i< input.length; i++){
      if(hset.add(input[i]) == false){
        dupArray[dc] = input[i];
        dc = dc +1;
        System.out.print(input[i] +" ");
      } else {
        noDupArray[c] = input[i];
        c = c+1;
        System.out.print("Non-Duplcate:" +input[i] +" ");
      }
    }
    return dupArray;
  }


  public static void printArray(int[] input){
    for(int i =0; i< input.length; i++){
      System.out.print(input[i] +" ");
    }
    System.out.println();
  }



}




