package ElementsOfProgramingInterviewsInjava.PrimitiveDataTypes;

public class NumberIsPalindrome {

  public static boolean isPaindromeWithEachNumberComp(int givenInt){

    int divisor = 1;
    while(givenInt / divisor >= 10){
      divisor *= 10;
    }
    System.out.println(divisor);

    while(givenInt !=0){
      int leadInt = givenInt/divisor;
      int trailInt = givenInt%10;
      if(leadInt != trailInt){
        return  false;
      }
      givenInt = (givenInt%divisor) /10;
      divisor = divisor/100;
    }
    return  true;
  }

  public static void main(String args[]){
    int givenInt = 123456;
    System.out.println("----------------------");
    System.out.println(isPaindromeWithEachNumberComp(1021));
  }
}
