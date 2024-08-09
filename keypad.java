import java.util.*;
public class keypad {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your digit String");
        String s=in.next();
         key(s);
    }
    public static ArrayList<String> key(String st)
    {
        HashMap<Character , String>map=new HashMap<>();
        map.put('1', "abc");
        map.put('2', "def");
        map.put('3', "gh");
        map.put('4', "jkl");
        map.put('5', "mnop");
        map.put('6', "qrst");
        map.put('7', "uv");
        map.put('8', "wxyz");
        map.put('9', ".;");
        map.put('0', "?!");
    }
    
}
