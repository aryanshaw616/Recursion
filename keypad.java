import java.util.*;
public class keypad {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your digit String");
        String s = in.next();
        System.out.println(key(s));
    }
    public static ArrayList<String> key(String st) {
        if (st.length() == 0) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        HashMap<Character, String> map = new HashMap<>();
        map.put('1', "abc");
        map.put('2', "def");
        map.put('3', "ghi");
        map.put('4', "jkl");
        map.put('5', "mno");
        map.put('6', "pqrs");
        map.put('7', "tu");
        map.put('8', "vwx");
        map.put('9', "yz");
        map.put('0', ".,");
        char first = st.charAt(0);
        String rs = st.substring(1);
        ArrayList<String> res = key(rs);
        ArrayList<String> mres = new ArrayList<>();
        String imp = map.get(first);
        for (int i = 0; i < imp.length(); i++) {
            char flag = imp.charAt(i);
            for (String var : res) 
                mres.add(flag + var);  
        }
        return mres;
    }
}
