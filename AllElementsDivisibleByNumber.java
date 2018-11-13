package arrays.problems;

public class AllElementsDivisibleByNumber {

  public static void main(String args[]){

    int[] a  = {25, 20, 5, 10, 100, 22};
    System.out.println(25%1);


    int divNumber = 2;
    for(int i=0; i< a.length; i++){
      int mod= a[i]%divNumber;
      if(mod == 0){
        System.out.println("Number = " + divNumber);
      } else {
        System.out.println("Number not exists -1");
      }
      divNumber++;
    }
  }


}
