package Recuresion;

public class FactorialFoNumber {
  public static void main(String args[]){
    System.out.println("Testing");
    System.out.println(factorial(3));
    //System.out.println(print(3));

  }

  public static  int factorial(int n){
    if (n == 0) {
      return 1;
    } else {
      System.out.println(n);
    }
      return n*factorial(n-1);
  }

  public static int print(int n){
    if(n == 0){
      return 0;
    }else {
      System.out.println(n);
      return print(n-1);
    }
  }

}
