package ElementsOfProgramingInterviewsInjava.PrimitiveDataTypes;

import java.util.Stack;

public class ConvertNumbverToBits {


  public static void convertNumberToBits(int num){
    if(num > 1){
      convertNumberToBits(num/2);
    }
    System.out.print(num%2);
  }

  public static String singStack(int num){

    StringBuilder sb = new StringBuilder();
    Stack<Integer>  rev = new Stack<>();
    while (num != 0) {
      System.out.println(num&1);
      rev.push(num & 1);
      num = num >> 1;
      System.out.println(num);
    }
    System.out.println(rev.toString());
    while(rev.size() > 0){
      sb.append(rev.pop());
    }
    return sb.toString();
  }

  public static void main(String args[]){
    System.out.println("Testing");
    /*convertNumberToBits(10);*/
    System.out.println("=============");
    System.out.println("==> " +singStack(10));
  }

}
