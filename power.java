import java.util.*;
class power
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your number");
        int x = in.nextInt();
        System.out.println("Enter your power");
        int n = in.nextInt();
        double x1=(double)x;
        if(n<0)
        System.out.println("Result is "+ power2(x1,n));
        else
        System.out.println("Result is "+ power(x,n));
    }
    public static int power(int x , int n)
    {
        if(n==0)
        return 1;
       else  return  (x*power(x,n-1));
    }
    public static double power2(double x , int n)
    {
        if(n==0)
        return 1.0;
       else 
       return(1.0/x*(power2(x,n+1)));
    }
}