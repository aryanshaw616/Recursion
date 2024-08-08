
import java.util.Scanner;

public class first_index {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = in.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the " + n + " elements");
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        System.out.println("Enter the element to be searched");
        int h = in.nextInt();
        int res = first(a, 0, h);
        if (res != -1) {
            System.out.println("First occurrence is at index " + res);
        } else {
            System.out.println("Element not found");
        }
    }

    public static int first(int a[], int index, int h) {
        if (index == a.length) {
            return -1;
        }
        if (a[index] == h) {
            return index;
        }
        return first(a, index + 1, h);
    }
}
