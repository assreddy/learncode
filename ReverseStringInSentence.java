package StringProblems;

public class ReverseStringInSentence {

  public static void main(String args[]){
    String str = "This is a Career Monk String”, Output: “String Monk Career a is This";

    System.out.println(str);
    System.out.println();
    System.out.println(reverseString(str));

  }

  public static String reverseString(String str){
    String[] strArray = str.split(" ");
    StringBuilder sb = new StringBuilder();

    if(str.length() == 0 && str.length() ==1){
      return str;
    }
    for(int i=0; i<strArray.length;i++){
      String word = strArray[i];
      for(int j = word.length()-1; j>=0; j--){
        sb.append(word.charAt(j));
      }
      sb.append(" ");
    }
    return sb.toString();
  }

}
