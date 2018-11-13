/*A program with linear running time. Read in n integers
    *  and find the one closest to 0.*/

public class OneSum {

  public static void main(String args[]){
    System.out.println("Testing new S/w");
    int[] input = {10,20,30,40,50,60};
    System.out.println("===> " +count(input));
  }


  public static int count(int[] a){
    int n = a.length;
    int count = 0;
    for(int i =0; i<n; i++){
      if(a[i] == 30)
        count++;
    }
    return count;
  }


}
