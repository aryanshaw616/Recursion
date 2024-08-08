import java.util.Scanner;
 public class max_arr {
     public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         System.out.println("Enter the number of elements");
         int n = in.nextInt();
         int a[]=new int [n];
         System.out.println("Enter the " + n + " elements");
         for(int i=0;i<n;i++)
             a[i]=in.nextInt();
             int h =a[a.length-1];
             int res = max(a,n-1,h);
             System.out.println("Max element is" + res);
     }
     public static int max(int a[],int n,int h) {
         if(n==-1)
         return 0;
         if (a[n]>h)
         h=n;
         max(a,n-1,h);
         return h;
     }
 }
 