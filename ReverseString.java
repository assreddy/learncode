package com.easy;

/*Write a function that takes a string as input and returns the string reversed.
    Example 1:
    Input: "hello"
    Output: "olleh"
    Example 2:
    Input: "A man, a plan, a canal: Panama"
    Output: "amanaP :lanac a ,nalp a ,nam A"*/

public class ReverseString {

  public static void main(String args[]){
    System.out.println("testing reverse String");

    //System.out.println(reverseString("hello"));
//    System.out.println(reverseString("A man, a plan, a canal: Panama"));
    System.out.println(reverseEachWorkInString("A man, a plan, a canal: Panama"));
    // System.out.println(reverseEachWorkInString("hello"));
  }

  // Reverse Entire String...
  public static String reverseString(String s){
    StringBuilder sb = new StringBuilder();
    if(s.length() ==0 && s.length() ==1){
      return s;
    }
    for(int i=s.length()-1; i>=0; i--){
      sb.append(s.charAt(i));
    }
    return sb.toString();
  }



  // Reverse Each Work in a Given String
  public static String reverseEachWorkInString(String s){
    StringBuilder sb = new StringBuilder();
    String[] givenString = s.split(" ");
    if(s.length() ==0 && s.length() ==1){
      return s;
    }
    if(givenString.length != 1){
      for(int i =0; i< givenString.length-1; i++){
        String word = givenString[i];
        System.out.println(word);
        for(int j = word.length()-1; j>=0; j--){
          sb.append(word.charAt(j));
        }
      }
    }else {
     for(int k=s.length()-1; k>=0; k--) {
       sb.append(s.charAt(k));
     }
    }

    return sb.toString();
  }

}
