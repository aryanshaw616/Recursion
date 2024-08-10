import java.util.*;
public class subsequence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your String");
        String st=in.next();
        System.out.println(seq(st));
    }
    public static ArrayList<String> seq(String st)
    {
        if(st.length()==0)
        {
            ArrayList<String>bres=new ArrayList<>();
            bres.add("");
            return bres;
        }
        char ch=st.charAt(0);
        String st1=st.substring(1);
        ArrayList<String>res=seq(st1);
        ArrayList<String > mres = new ArrayList<>();
        for(String a1:res)
        {
            mres.add(a1);
            mres.add(ch +a1);
        }
        return mres;
    }
}
