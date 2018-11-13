package geeksforgeeks.string;

public class CompressedString {

  public static void main(String args[]){
    String givenStr = "aabbbcccdddaaa";
    System.out.println(givenStr);
    System.out.println(compressedString(givenStr));
  }
  public static String compressedString(String givenStr){
    char[] strArray = givenStr.toCharArray();
    int count = 1;
    char prev = strArray[0];
    StringBuilder sb = new StringBuilder();
    System.out.println(prev);
    for(int i=1; i< strArray.length-1; i++){
      char current = strArray[i];
      if(current == prev){
        count++;
      } else{
        sb.append(prev).append(count);
        count = 1;
      }
      prev = current;
    }
    return sb.toString();
  }

}
