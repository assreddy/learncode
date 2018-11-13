import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeAndSortTwoArrays {

  public static void main(String args[]){
    System.out.println("Merge Two Arrays and Sort the final Array");
    int[] a = {50,20,5,75};
    int[] b = {3,56,78,82};
    List listArray = new ArrayList(Arrays.asList(a));
    listArray.add(Arrays.asList(b));
    ArraysUtils.printIntArray(a);
    ArraysUtils.printIntArray(b);
    Object[] c = listArray.toArray();

    System.out.println("==============================");
    // System.out.println(Arrays.);
  }

/*  private static int[] sortMergeArray(){

  }*/
}
