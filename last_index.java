import java.util.Scanner;
 public class last_index {
     public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         System.out.println("Enter the number of elements");
         int n = in.nextInt();
         int a[]=new int [n];
         System.out.println("Enter the " + n + " elements");
         for(int i=0;i<n;i++)
             a[i]=in.nextInt();
             System.out.println("Enter the elemeent to be searched");
             int h =in.nextInt();
             int res = first(a,n-1,h);
             System.out.println("Last occurence is is" + res);
     }
     public static int first(int a[],int n,int h) {
         if(n==-1)
         return -1;
         if (a[n]==h)
         {
            int m=n;
            n=-1;
            return m; 
         }
         return first(a,n-1,h);
     }
 }
 