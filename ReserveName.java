public class ReserveName {

  public static void main(String args[]){
    System.out.println("Testing");
    String inputString = "Sr";
    System.out.println(reverseWord(inputString.trim()));
  }

  public static String reverseWord(String inputString){

    if(inputString.length() == 0 && inputString.length() == 1){
      return inputString;
    }
    if(inputString.length() == 2 ){
      return new StringBuilder().append(inputString.charAt(1)).append(inputString.charAt(0)).toString();
    }
    System.out.println(inputString);
    String[] words = inputString.split(" ");
    StringBuilder sb = new StringBuilder();
    String newString ="";
    String reverseWordsString = "";
    for(int i=words.length-1; i>=0; i--){
      String eachWord = words[i];
      String eachWordReverse = "";
      for(int j = eachWord.length()-1; j>=0; j--){
        /*        System.out.println(eachWord.charAt(j));*/
        eachWordReverse = eachWordReverse+eachWord.charAt(j);
      }
      reverseWordsString = reverseWordsString + eachWordReverse + " ";
      System.out.println(eachWordReverse);
      System.out.println(words[i]);
      sb.append(words[i]).append(" ");
      newString = newString + words[i] +" ";
    }
    System.out.println(sb.toString());
    System.out.println(newString);
    return reverseWordsString;
  }

}
