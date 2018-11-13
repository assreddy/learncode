package StringProblems;

public class SampleStrings {

  public static void main(String args[]) {
    String text = "Hello, World!";
    System.out.println(text);

    char[] arr = {'H','e','l','l','o', ',' ,' ','W','o','r','l','d','!'};

    String hello = new String(arr);
    System.out.println(hello);
    System.out.println(hello.length());
    System.out.println(hello.charAt(3));

    char[] toArray = hello.toCharArray();


  }




}
