import java.util.*;
class factorial
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = in.nextInt();
       System.out.println(fact(n));
    }
    public static int fact(int n)
    {
        if(n==0 || n==1) return 1;
        else return (n*fact(n-1)); 
        
    }
}