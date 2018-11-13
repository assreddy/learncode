import java.util.HashMap;
import java.util.Map;

public class CountOccuring {

    public static void main (String args[]) {

        String testString = "aabcccccaaa";
        char[] chars = testString.toCharArray();

        StringBuilder sb = new StringBuilder();

        int count =0;
        char prev = chars[0];

        for(int i =0; i<chars.length-1; i++){
            char current = chars[i];
            if(current== prev){
                count++;
            } else {
                sb.append(prev).append(count);
                count =1;
            }
            prev = current;


        }
        System.out.println(sb.append(prev).append(count).toString());

    }



}
