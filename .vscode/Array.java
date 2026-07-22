import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.err.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        System.out.println("Enter " + n + " integers:");
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println("The elements in the array are:");
        for (int i = 0; i < n; i++) {
            System.out.println(numbers[i]);
        }
    }
}
