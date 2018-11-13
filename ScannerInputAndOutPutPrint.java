/*
import java.util.Scanner;

public class ScannerInputAndOutPutPrint {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        checkStatus(a);
        int b = scanner.nextInt();
        checkStatus(b);
        scanner.close();

    }

    private static void checkStatus(int a){
        if(a%2 != 0){
            System.out.println("Weird");
        } else if(a%a == 0 && a >=6 && a <= 20){
            System.out.println("Weird");
        } else if(a%2 == 0 && a<2 && a<5){
            System.out.println("not Werid");
        } else if(a%2 == 0 && a>20 ){
            System.out.println("not Werid");
        }
    }

    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
}
import java.util.*;


public class mergeTwoArray{
    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);
        scanner.skip("\n");

        int arraySize1 = scanner.nextInt();
        int[] a = new int[arraySize1];


        Set<Integer> finalSet = new HashSet();

        for(int i = 0; i<arraySize1-1;i++){
            finalSet.add(scanner.nextInt());

        }
        int arraySize2 = scanner.nextInt();
        int[] b = new int[arraySize2];


        for( int j=0; j<arraySize2-1; j++){
            finalSet.add(scanner.nextInt());
        }
        List<Integer> listIntegers = new ArrayList<>(finalSet);
        Collections.sort(listIntegers);
        System.out.println("After Merge="+listIntegers);


    }
}*/
