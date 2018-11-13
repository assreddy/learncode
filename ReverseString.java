package StringProblems;

public class ReverseString {

  public static void main(String args[]) {
    String word = "TESTING";
    System.out.println(word);
    System.out.println("==>" +revreseString(word));

  }
  public static String revreseString(String str){
    StringBuilder sb = new StringBuilder();
    for(int i=str.length()-1; i>=0; i--){
      sb.append(str.charAt(i));
    }
    return sb.toString();
  }
}
