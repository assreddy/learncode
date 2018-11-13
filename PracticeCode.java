import java.util.HashMap;
import java.util.Map;

public class PracticeCode {

    public static void main(String args[]) {
        System.out.println("Testing Users");

        String userString = "user1, user4, user2, user1, user3, user1, user2, user3";

        HashMap<String, Integer> userMap = new HashMap<>();

        for (String testString : userString.split(",")){

            testString = testString.trim();
             if(userMap.containsKey(testString)){
                 userMap.put(testString, userMap.get(testString).intValue()+1);
             }else {
                 userMap.put(testString, 1);
             }
        }

        for(Map.Entry<String, Integer> user : userMap.entrySet()){
            System.out.println(user.getKey() +"::"+ user.getValue());
        }

    }
}

