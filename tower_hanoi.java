import java.util.*;
public class tower_hanoi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of disks");
        int n =in.nextInt();
        System.out.println("Enter the disks");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        toh(n,a,b,c);
    }
    public static void toh(int n , int a , int b,int c)
    {
        if(n==0)
        return ;
        toh(n-1,a,c,b);
        System.out.println(n + "[ " + a +" - >" + b +"]");
        toh(n-1,c,b,a);
    }
}
