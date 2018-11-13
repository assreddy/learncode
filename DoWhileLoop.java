public class DoWhileLoop {

  public static void main(String args[]){
    System.out.println("Under Standing Do While Loop");
    int i =5;
    do{
      System.out.println("Lopp :   " +i);
      i++;
    } while(i<=5);


    while(i<=6){
      System.out.println("while loop " +i);
      i++;
    }

    int[] arr = {10,20,30,40,50};

    // Using Do .. While Loop
    int j =0;
    do{
      System.out.print(arr[j]+" ");
      j++;
    }while(j<arr.length);

    System.out.println("\n"+"-----------------" );

    int k=0;
    while(k<arr.length){
      System.out.print(arr[k]+" ");
      k++;
    }
  }
}
