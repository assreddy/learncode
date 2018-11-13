/*Given the below input and output and asked to write in Java.
    Example 1)
    input : {1,2,3,4, &, 12,13,14,15}
    output : {15,14,13,12,1,2,3,4}

    Example 2 )
    input : {33,34,&,55,63}
    output : {63,55,33,34}

    Assumption : '&' will always be in the middle.*/

public class ReverseSortedBasedonMiddleSpecialChar {

  public static void main(String args[]){
    String[] input = {"33","34","&","55","63"};
    int mid = (input.length-1)/2;
    System.out.println(mid);
    String[] output = new String[input.length-1];

    if(input[mid].equals("&")){
      for(int i =0; i<mid ; i++){
        output[i] = input[input.length-1-i];
      }
      for(int j = mid+1; j<=2*mid; j++){
        output[j-1] = input[j-mid-1];
      }
    }

    ArraysUtils.printStringArray(output);
  }
}
