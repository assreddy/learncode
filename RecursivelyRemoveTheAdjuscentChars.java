package StringProblems;

/*Given a string “ABCCBCBA”, give an algorithm for recursively removing the
    adjacent characters if they are the same. For example, ABCCBCBA --> ABBCBA-
    >ACBA*/

public class RecursivelyRemoveTheAdjuscentChars {

  public static void main(String args[]){
    System.out.println("ABCCBCBA");
    String str = "ABCCBCBA";
    char[] strChars = str.toCharArray();
    System.out.println(removeAdjustCharsSame(strChars));
    StringBuilder sb = new StringBuilder();
    System.out.println(sb.toString());
  }

  public static String removeAdjustCharsSame(char[] strChars){
    char prev = '\0';
    int k =0;
    for(int i =0; i<strChars.length-1; i++){
      if(prev != strChars[i]){
        strChars[k++] = strChars[i];
        prev = strChars[i];
      }
    }

    return new String(strChars).substring(0,k);
  }

  public static void removeAdjacentPairs(char[] str){
    int j=0;
    for(int i=1; i<=str.length; i++){
      while(str[i] == str[j] && (j>=0)){
        i++;
        j--;
      }
      str[++j] = str[i];
    }
  }

}
