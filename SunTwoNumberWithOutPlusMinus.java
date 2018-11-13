// Write code to sum 2 integer but u cant use a+b method, you have to use either ++ or --. How you will handle negative numbers.
public class SunTwoNumberWithOutPlusMinus {

    public static void main(String args[]){
        System.out.println("Add Substract two Numbers");
        int a = -2;
        int b = -3;
        for( int i=0; i<3;i++) {
            if (a > 0 && b > 0) {
                if (a < b) {
                    a++;
                } else {
                    b--;
                }
            }else if( a<0 && b< 0){
                if(a < b){
                    a++;
                }else {
                    a--;
                }
                System.out.println("Negative numbers");
            }
        }
        System.out.println(a  +":: " +b);
    }
}
