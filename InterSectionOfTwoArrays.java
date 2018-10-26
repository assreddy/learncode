package com.easy;

/*Given two arrays, write a function to compute their intersection.

    Example 1:

    Input: nums1 = [1,2,2,1], nums2 = [2,2]
    Output: [2,2]
    Example 2:

    Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
    Output: [4,9]*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class InterSectionOfTwoArrays {

  public static void main(String args[]){
    System.out.println();
    int[] input1 =  {4,9,5};
    int[] input2 =  {9,4,9,8,4};
    int[] out = arraysSets(input1, input2);
    for(int i=0; i< out.length; i++){
      System.out.print(out[i] +" ");
    }

/*   int[] resArray = insersetMapArrayList(input1, input2);
   for(int i=0; i<resArray.length; i++){
     System.out.print("==" +resArray[i] +" ");
   }*/

  }

  private static int[] insersetMapArrayList(int[] nums1, int[] nums2){

    Map<Integer, Integer> map = new HashMap<>();
    ArrayList<Integer> list = new ArrayList<>();

    for(int num : nums1){
      if(map.containsKey(num)){
        map.put(num, map.get(num)+1);
      } else {
        map.put(num,1);
      }

    }

    for(int num : nums2){
      if(map.containsKey(num) && map.get(num) > 0){
        map.put(num, map.get(num) -1);
        list.add(num);
      }
    }

    int[] res = new int[list.size()];
    int i=0;
    for(int num:list){
      res[i++] = num;
    }
    return res;
  }


  private static int[] arraysSets(int[] nums1, int[] nums2) {

    if (nums1 == null || nums2 == null || nums1.length == 0 || nums2.length == 0) {
      return new int[0];
    }

    Set<Integer> unionSet = new HashSet<>();
    Set<Integer> resultSet = new HashSet<>();

    for (int n : nums1) {
      unionSet.add(n);
    }

    for (int n : nums2) {
      if (unionSet.contains(n)) {
        resultSet.add(n);
      }
    }

    int i = 0;
    int[] resultArray = new int[resultSet.size()];

    for (int num : resultSet) {
      resultArray[i++] = num;
    }
    return resultArray;
  }
}
