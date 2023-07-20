package Day08.practice;

import java.util.HashMap;

public class CountNames {
    public static void main(String[] args) {
        HashMap<String, Integer> user = new HashMap<>();
        
        user.put("Ram", 2);
        user.put("Superman", 1);
        user.put("Spider", 2);
        user.put("hey", 2);
        user.put("hello", 1);

        for(String key : user.keySet()) {
        	
        	System.out.println(key + ":" + user.get(key));
        }
    }

}
