package StringProblems;

public class LongestPalindromeSubString {
  public static void main(String args[]){
    String str = "forgeeksskeegfor";
    System.out.println(str);
    System.out.println(longestPalindromeString(str));

  }

  public static String longestPalindromeString(String str){
    int n = str.length();
    int pStart =0;
    int max_len = 1;

    boolean[][] pdrome = new boolean[n][n];

    for(int i=0; i< n;i++){
      pdrome[i][i] = true;
    }

    for(int i=0; i<n-1; i++){
      if(str.charAt(i) == str.charAt(i+1)){
        pdrome[i][i+1] = true;
        pStart = i;
        max_len=2;
      }
    }

    for(int clength =3; clength<=n; clength++){
      for(int i =0; i<= n-clength; i++){
        int j =i+clength-1;
        if(str.charAt(i) == str.charAt(j) && pdrome[i+1][j-1]){
          pdrome[i][j] = true;
          pStart= i;
          max_len = clength;
        }
      }
    }
    return str.substring(pStart, max_len+pStart);
  }


}
