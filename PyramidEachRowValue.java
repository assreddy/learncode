/* Given a pyramid of consecutive integers:
        1
        2 3
        4 5 6
        7 8 9 10
        11 12 13 14 15
        16 17 18 19 20 21
        Find the sum of all the integers in the row number N.
        For example:
        The row #3: 4 + 5 + 6 = 15
        The row #5: 11 + 12 + 13 + 14 + 15 = 65*/

public class PyramidEachRowValue {

    public static void main(String args[]){
        System.out.println("Testing");
        int input =  3;
        int output =0;
        output = input*(input*input + 1)/2;
        System.out.println(output);

    }

}
