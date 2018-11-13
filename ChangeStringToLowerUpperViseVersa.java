package StringProblems;

public class ChangeStringToLowerUpperViseVersa {

  public static void main(String args[]){
    String strUpperCase = "LOWERCASE";
    char[] output2 = toLowerCaseString(strUpperCase);
    for(int i=0; i< output2.length; i++){
      System.out.print(output2[i] +" ");
    }
    System.out.println("\n"+ "--------------------------");
    String strLowerCase= "lowercase";

    char[] output1 = toUpperCaseString(strLowerCase);
    for(int i=0; i< output1.length; i++){
      System.out.print(output1[i] +" ");
    }

  }
  public static char[] toLowerCaseString(String str){
    char[] strArray = str.toCharArray();
    for(int i =0; i<strArray.length; i++){
      if(strArray[i] >= 65 && strArray[i] <= (65+25)){
        strArray[i] += 32;
      }
    }
    return strArray;
  }

  public static char[] toUpperCaseString(String str){

    char[] strArray = str.toCharArray();

    for(int i =0 ; i<strArray.length; i++){
      if(strArray[i] >=97 && strArray[i] <=(97+25)){
        strArray[i] -= 32;
      }
    }

    return strArray;
  }

}
