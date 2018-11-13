package ProblemsInSearch;

public class Sample {

  public static void main (String args[]) {

    int[] a = {7,7,7,6,3,4,5,6,7,7};
    int[] b = {7,7,7,7,3,4,5,6,7,7};
    System.out.println("Size " + a.length);
    printArray(a);

  }
  public static void printArray(int[] a ){
    for(int i =0; i< a.length; i++){
      System.out.print(a[i] +" ");
    }
    System.out.println();
  }

}
