public class ThreeLargetElementInGivenArray {

  public static void main(String args[]){
    System.out.println("Testing Java");
    int f = Integer.MIN_VALUE;
    int s = Integer.MIN_VALUE;
    int t = Integer.MAX_VALUE;

    int[] ar = {10,8,1,0,9};

    for(int i=0; i<ar.length; i++){
      if(ar[i] > f){
        t = s;
        s= f;
        f = ar[i];
      } else if(ar[i] > s){
        t = s;
        s = ar[i];
      }else if(ar[i] > t){
        t = ar[i];
      }
      System.out.println(+f +s +t);


    }



  }

}
