package com.easy;

/*Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.
    Example 1:
    Input: a = 1, b = 2
    Output: 3

    Example 2:
    Input: a = -2, b = 3
    Output: 1*/
public class SumOfTwoNumbers {

  public static void main(String args[]){
    System.out.println("Testing");
    System.out.println(addTwoNumbers(10,-20));


  }

  public static int addTwoNumbers(int a, int b){

    //Iterate till there is no carry
    while(b != 0){
      //carry now contains common set bits of x and y
      int carry = a & b;
      System.out.println("carry : " +carry);
      // Sum of bits of x and y where at least one  of the bits is not set
      a = a ^ b;
      System.out.println("a : " +a);
      // Carry is shifted by one so that adding it to x gives the required sum
      b = carry << 1;
      System.out.println("b : " +b);
    }
    return a;
  }

}
