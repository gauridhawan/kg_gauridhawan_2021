import java.util.HashMap;
import java.util.Map;


public class main {

    public static void main(String[] args){

        if(args.length <2){
            System.out.println("Invalid number of arguments.");
            return;
        }

        String s1 = args[0];
        String s2 = args[1];

        System.out.println(hasMapping(s1,s2));


    }

    /**
     * Method to determine whether one to one mapping exists between input strings
     * @param s1
     * @param s2
     * @return true if one to one mapping exists, false otherwise
     */
    public static boolean hasMapping(String s1, String s2){

        // if their lengths are unequal
        if((s1.length() != s2.length()) || (s1==null) || (s2==null) ){
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
