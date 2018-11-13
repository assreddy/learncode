import java.util.Arrays;

public class RemoveDuplicateArrays {

  public static void main (String args[]) {
    System.out.println("Testing");
    int[] ar = {4, 3, 2, 4, 9, 2};
    int noUnique = ar.length;
    int[] newAr = new int[noUnique];
    Arrays.sort(ar);

    ArraysUtils.printIntArray(ar);

    int j =0;
    int i =1;
    while(i<ar.length){
      if(ar[i] == ar[j]){
        i++;
      }else {
        ar[++j] = ar[i++];
      }
    }
    int[] output = new int[j+1];




  }



}
