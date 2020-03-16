import java.util.HashMap;
import java.util.Map;


public class main {

    public static void main(String[] args){

        String s1 = args[0];
        String s2 = args[1];

        System.out.println(hasMapping(s1,s2));


    }

    public static boolean hasMapping(String s1, String s2){

        // if their lengths are unequal
        if(s1.length() != s2.length()){
            return false;
        }
        Map<Character,Character> map = new HashMap<>();
        for(int i=0;i<s1.length();i++){
            if(map.containsKey(s1.charAt(i)) || map.containsValue(s2.charAt(i))){
                return false;
            }
            map.put(s1.charAt(i),s2.charAt(i));

        }

        return true;

    }
}
