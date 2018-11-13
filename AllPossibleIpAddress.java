import java.util.ArrayList;

public class AllPossibleIpAddress {

  public static ArrayList<String> restoreIpAddresses(String s) {
    ArrayList<String> res = new ArrayList<String>();
    if (s.length()<4||s.length()>12) return res;
    dfs(s,"",res,0);
    return res;
  }

  public static void dfs(String s, String tmp, ArrayList<String> res, int count){
    if (count == 3 && isValid(s)) {
      res.add(tmp + s);
      return;
    }
    for(int i=1; i<4 && i<s.length(); i++){
      String substr = s.substring(0,i);
      if (isValid(substr)){
        dfs(s.substring(i), tmp + substr + '.', res, count+1);
      }
    }
  }

  public static boolean isValid(String s){
    if (s.charAt(0)=='0') return s.equals("0");
    int num = Integer.parseInt(s);
    return num<=255 && num>0;
  }
  public static void main(String[] args){
    String a = "25525511135";
    for(String s : restoreIpAddresses(a)){
      System.out.println(s);
    }
  }
}