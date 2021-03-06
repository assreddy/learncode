package com.easy;

/*Given an integer, write a function to determine if it is a power of three.

    Example 1:

    Input: 27
    Output: true
    Example 2:

    Input: 0
    Output: false
    Example 3:

    Input: 9
    Output: true
    Example 4:

    Input: 45
    Output: false
    Follow up:
    Could you do it without using any loop / recursion?*/

public class PowerOfThree {

  public static void main(String args[]){
    System.out.println("Testing");
    System.out.println(isPowerOfThree(45));
    System.out.println(isPowerWhileLoop(45));
  }


  private static Boolean isPowerOfThree(int a) {

    if(a <= 0){
      return false;
    }
    if( a == 0){
      return true;
    }
    if (a % 3 == 0) {
      return true;
    }else{
      return false;
    }
  }

  private static boolean isPowerWhileLoop(int a){
    while(a/3>=1){
      if(a%3!=0)
        return false;
        a/=3;
    }
    return a==1;
  }

}
