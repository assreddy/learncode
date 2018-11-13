package GInt;

public class ArrayMonoTonicallyIncreaseDescrease {

  public static void main(String args[]){
    System.out.println("Testing");
    int[] a = {8, 10, 20, 80, 100, 200, 400, 500, 3, 2, 1};

    System.out.println(getMaxFromArray(a));
  }

  public static int getMaxFromArray(int[] a){
    int maxValue = 0;

    for(int i=0; i< a.length;i++) {
      if (a[i] > maxValue) {
        maxValue = a[i];
      }
    }

    return maxValue;
  }

}
