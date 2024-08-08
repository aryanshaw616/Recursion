
import java.util.Scanner;

public class rev_arr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = in.nextInt();
        int a[]=new int [n];
        System.out.println("Enter the " + n + " elements");
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
            print(a,n-1);
    }
    public static void print(int a[],int n) {
        if(n==-1)
        return ;
        System.out.println(a[n]);
        print(a,n-1);
    }
}
