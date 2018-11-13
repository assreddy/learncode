package StringProblems;

public class UniqueCharsInString {

  public static void main(String args[]){
    String str = "tyyesting";
    System.out.println(str);
    System.out.println(isUnique(str));
  }

  public static boolean isUnique(String str){

    int[] bitArray = new int[26];
    for(int i=0; i< bitArray.length; i++){
      bitArray[i] = 0;
    }
    printArray(bitArray);
    int size = str.length();
    for(int i=0; i<size; i++){
      char c = str.charAt(i);
      if('A' <= c && 'Z' >= c){
        c = (char)(c-'A');
      } else if('a' <=c && 'z' >=c){
        c = (char)(c-'a');
      } else {
        System.out.println("UnKNown Chars!\n");
        return false;
      }
      if(bitArray[c] !=0){
        System.out.println("Duplicates Detected \n");
        return false;
      }
    }
    System.out.println("NO DUPLICATES");

    return true;
  }

  public static void printArray(int[] a){
    for(int i=0; i<a.length; i++){
      System.out.print(a[i] +" ");
    }

  }

}
