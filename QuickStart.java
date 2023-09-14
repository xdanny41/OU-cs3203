import java.util.Scanner;
import java.util.Arrays;

public class QuickStart {
    public static void main(String[] args) { // main driver method

        // Main method
        Scanner input = new Scanner(System.in);
        int b = 0;
        int sum;
        int test;

        System.out.println("Enter array length: ");
        int length = input.nextInt();

        int[] a = new int[length];

        System.out.println("Please enter array elements");
        for (int i = 0; i < a.length; i++) {

            int z = input.nextInt();
            a[i] = z;

        }

        input.close();
        int product = product(a, b);
        sum = add(a, b);
        System.out.println("Sum = " + sum); // Prints Sum of Array
        System.out.println("Product = " + product); // Prints Product of Array
        System.out.println("Reverse Array: " + Arrays.toString(reverseArray(a)));// Prints Reverse Array
    }

    public static int add(int[] x, int sum) { // sum of elements in array

        for (int i = 0; i < x.length; i++) {
            sum = sum + x[i];
        }

        return sum;
    }

    public static int product(int[] x, int product) { // product of array

        product = 1;
        for (int i = 0; i < x.length; i++) {
            product = product * x[i];
        }

        return product;
    }

    public static int[] reverseArray(int[] arr) { // reverse array
        int[] reversed = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }

        return reversed;
    }
}