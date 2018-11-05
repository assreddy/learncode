package GInt.GStrings;

public class MakeTwoWordsEqualAfterSwap {

  public static void main(String args[]) {
    String str1 = "crud";
    String str2 = "curd";
    System.out.println(sameWords(str1,str2));
  }

  public static boolean sameWords(String str1, String str2){
    int curr = -1, prev = -1;
    int count =0;
    for(int i=0; i< str1.length();i++){
      if(str1.charAt(i) != str2.charAt(i)) {
        count++;
        if (count > 2) {
          return false;
        }
        prev = curr;
        curr = i;
      }
    }

    System.out.println(count);
    return (count == 2 &&
        str1.charAt(prev) == str2.charAt(curr) &&
        str1.charAt(curr) == str2. charAt(prev));
  }
}
