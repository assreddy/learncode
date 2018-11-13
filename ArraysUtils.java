import java.util.List;

public class ArraysUtils {

public static void printIntArray(int[] intArray){
  for(int i=0; i<intArray.length;i++){
    System.out.print(intArray[i] +" ");
  }
}

  public static void printStringArray(String[] intArray){
    for(int i=0; i<intArray.length;i++){
      System.out.print(intArray[i] +" ");
    }
  }

  public static void printStringList(List<String> stringList){
    for(int i=0; i<stringList.size();i++){
      System.out.print(stringList.get(i) +" ");
    }
  }

  public static void printIntegerList(List stringList){
    for(int i=0; i<stringList.size();i++){
      System.out.print(stringList.get(i) +" ");
    }
  }

}



