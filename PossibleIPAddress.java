public class PossibleIPAddress {

  public static void main(String args[]){
    System.out.println("testing ip address");
     String str = "25525511135";
     System.out.println(isValid(str));
  }

  public static boolean isValid(String ip){
    if(ip.charAt(0) == '0')
      return ip.equals("0");
    int num = Integer.parseInt(ip);
    return num <= 255 && num >0;
  }
}
