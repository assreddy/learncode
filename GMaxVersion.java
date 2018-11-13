package arrays.problems;

public class GMaxVersion {

  public static String printLatestVersion(String v1, String v2){
    String[] arr1 = v1.split("\\.");
    String[] arr2 = v2.split("\\.");
    int i =0;
    while(i < arr1.length){
      if(Integer.parseInt(arr2[i]) > Integer.parseInt(arr1[i])){
        return v2;
      }
      if(Integer.parseInt(arr1[i]) > Integer.parseInt(arr2[i])){
        return v1;
      }
      i += 1;
    }
    return "Both are equal" ;
  }

  public static void main(String args[]) {
    String ans = printLatestVersion("1.2.20", "1.5.7");
    String[] strArray = {"2.13.0","5.18.14", "2.0.5", "2.0.6", "2.1"};
    String highValue = "0.0.0.0.0.0";
    for(int i=0; i< strArray.length;i++){
      highValue = printLatestVersion(highValue, strArray[i]);
    }
    System.out.println(highValue);
  }
}
