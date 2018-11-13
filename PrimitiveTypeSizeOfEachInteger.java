package ElementsOfProgramingInterviewsInjava.PrimitiveDataTypes;

import java.util.*;
import javax.print.DocFlavor.STRING;
import org.omg.CORBA.INTERNAL;
import sun.nio.cs.ext.MacHebrew;

public class PrimitiveTypeSizeOfEachInteger {

  public static short countBits(int x){
    short numBits = 0;
    while(x !=0){
      numBits += (x & 1);
      x >>>=1;
    }
    return numBits;
  }
  public static void main(String args[]){
    System.out.println(countBits(10));
    System.out.println(Integer.MIN_VALUE);
    System.out.println(Integer.MAX_VALUE);
    System.out.println(Boolean.TRUE);
    System.out.println(Double.valueOf(12.55));
    System.out.println(Boolean.valueOf(true));
    System.out.println(Integer.parseInt("45"));
    System.out.println(Float.toString(Float.parseFloat("-1.15")));

    System.out.println(Math.abs(-34.5));
    System.out.println(Math.ceil(2.17));
    System.out.println(Math.floor(3.14));
    System.out.println(Math.min(10,20));
    System.out.println(Math.max(10,20));
    System.out.println(Math.pow(2.71,3.14));
    System.out.println(Math.sqrt(225));

    System.out.println(Character.getNumericValue('A'));
    System.out.println(String.valueOf(65));
    System.out.println("=================");
    Random ran = new Random();
    System.out.println(ran.nextInt(500));
    System.out.println(ran.nextDouble());
    System.out.println(ran.nextBoolean());


  }

}
