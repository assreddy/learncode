package arrays.problems;

public class CountParisWithSum {
  public static void main(String args[]){
    int[] a  = {1, 5, 7, -1};
    System.out.println(countPairs(a, 6));
  }

  public static int countPairs(int[] a, int sum){
    int count = 0;
    for(int i=0; i< a.length; i++){
      for( int j= i+1; j< a.length; j++){
        if(a[i]+ a[j] == sum){
          count++;
        }
      }
    }
    return count;
  }

  // Best Option;;


}
