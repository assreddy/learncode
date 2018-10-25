package com.easy;

/*Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
    Examples:
    s = "leetcode"
    return 0.
    s = "loveleetcode",
    return 2.
    Note: You may assume the string contain only lowercase letters.*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class IndexOfFirstNonRepititiveCharInString {

  public static void main(String args[]){
    System.out.println("Testing Leet Code");
    String s1 = "leetcode";
    String s2 = "loveleetcode";
    System.out.println("index =" +firstUniqueChar(s1) +" and Letter = " +s1.charAt(firstUniqueChar(s1)));
    System.out.println("index =" +firstUniqueChar(s2) +" and Letter = " +s1.charAt(firstUniqueChar(s2)));

    System.out.println("--------------------------");
    System.out.println("index =" +firstUniqCharWithArray(s1) +" and Letter = " +s1.charAt(firstUniqCharWithArray(s1)));
    System.out.println("index =" +firstUniqCharWithArray(s2) +" and Letter = " +s1.charAt(firstUniqCharWithArray(s2)));

    System.out.println("--------------------------");

    System.out.println("index =" +firstUniqueMaps(s1) +" and Letter = " +s1.charAt(firstUniqueMaps(s1)));
    System.out.println("index =" +firstUniqueMaps(s2) +" and Letter = " +s1.charAt(firstUniqueMaps(s2)));


  }

  // Direclty compare first occurance of a character && last occurance, see if at same spot
  public static int firstUniqueChar(String s1){
    if( s1 == null || s1.length() ==0){
      return -1;
    }
    for(int i =0; i<s1.length(); i++){
      if(s1.indexOf(s1.charAt(i)) == s1.lastIndexOf(s1.charAt(i))){
        return  i;

      }
    }
    return -1;
  }

  //Using Arrays
  public static int firstUniqCharWithArray(String s){

    int[] frq = new int[256];
    for(char c : s.toCharArray()){
      frq[c - 'a']++;
    }

    for(int i=0; i<s.length();i++){
      if(frq[s.charAt(i) -'a'] == 1){
        return i;
      }
    }

    return -1;
  }

 /*
Thoughts: Put all letter into map <char, index> && If more than 1 occurs, remove it from
*/

  public static int firstUniqueMaps(String s){

    if(s == null || s.length() == 0){
      return -1;
    }
    final Map<Character, ArrayList<Integer>> map = new HashMap<>();

    for(int i =0; i<s.length(); i++){
      final char letter = s.charAt(i);
      if(!map.containsKey(letter)){
        map.put(letter, new ArrayList<Integer>());
      }
      map.get(letter).add(i);
    }

    final ArrayList<Integer> indexes = new ArrayList<>();
    for(Map.Entry<Character, ArrayList<Integer>> entity : map.entrySet()){
      if(entity.getValue().size() == 1){
        indexes.addAll(entity.getValue());
      }
    }

    if(indexes.size() ==0){
      return -1;
    }
    Collections.sort(indexes);
    return indexes.get(0);
  }
}
