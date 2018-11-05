package GInt;

public class ArrayIsEquilibriam {

public static void main(String args[]) {
  int[] a1 = {1, 2, 3, 3, 2, 1};
  int[] a2 = {1, 2, 3, 4, 3, 2, 1};
  int[] a3 = {1, 2, 5, 3, 2, 1};

  System.out.println(isEquilibrianOrNot(a1));
  System.out.println(isEquilibrianOrNot(a2));
  System.out.println(isEquilibrianOrNot(a3));
}
public static boolean isEquilibrianOrNot(int[] a){
  int len = a.length;
  if(len%2 != 0){
    return false;
  }
  int leftSum = 0;
  int rightSum = 0;
  for(int i=0; i< a.length; i++){
    int mid = a.length/2;
//    System.out.println(mid);
    if(i < mid){
      leftSum = leftSum+a[i];
      System.out.println(leftSum);
    }
    if(i >= mid){

      rightSum= rightSum+a[i];
      System.out.println(rightSum);
    }
  }
  return (leftSum==rightSum);
}

}
