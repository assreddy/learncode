package geeksforgeeks.string;

public class StringBasics {

  public static void main(String args[]){
    String inputStr = "Welcome ???@@##$ to#$% Geeks%$^for$%^&Geeks";
    System.out.println(inputStr);
    String newStr= inputStr.replaceAll("\\p{Punct}", "");
    System.out.println(newStr);

    System.out.println("-----------------------------");

    String name = "prabhat kumar singh";
    String[] nameArray = name.split(" ");
    String initaials = "";
    for(int i=0; i< nameArray.length; i++){
      String eachWord = nameArray[i];
      initaials = initaials + eachWord.charAt(0) + " ";
    }
    System.out.println(initaials.toUpperCase());
  }



}
