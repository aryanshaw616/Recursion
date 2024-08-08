import java.util.*;
class dec_inc
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = in.nextInt();
        increase(n);
    }
    public static void increase(int n)
    {
        if(n==0) return ;
        System.out.println(n);
        increase(n-1);
        System.out.println(n);
    }
}