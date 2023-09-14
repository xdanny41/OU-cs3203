import java.util.Scanner;
import java.util.Arrays;

public class QuickStart {
    public static void main(String[] args) { // main driver method

        // Main method
        Scanner input = new Scanner(System.in);
        int b = 0;
        int sum;
        int test;

        int[] a;
        sum = add(a, b);

    }

    public static int add(int[] x, int sum) { // sum of elements in array

        for (int i = 0; i < x.length; i++) {
            sum = sum + x[i];
        }

        return sum;
    }