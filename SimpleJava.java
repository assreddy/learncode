package StringProblems;

public class SimpleJava {

  public static void main(String args[]){
    char c =0;

    for(c =0; c< 256; c++){
    if(c >=65 && c <=(65+25)) {
      System.out.print((char)(c+32) +" ");
    }
    }
    System.out.println();

    for(c = 0; c< 256 ; c++){
      if(c >=97 && c <=97+25){
        System.out.print((char)(c-32) +" ");
      }
    }
  for(c =0; c<256; c++){
    System.out.print(c);
  }

  }


}
