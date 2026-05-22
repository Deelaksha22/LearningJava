import java.util.Scanner;
public class TakingInput{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        float a = sc.nextFloat();
        System.out.println("Enter the value of b:");
        float b = sc.nextFloat();
        System.out.println("The sum of a and b is: " + (a+b));
        System.out.println("enter yourname");
        String name = sc.next();
        System.out.println("Hello " + name);
        sc.close();
        System.out.println("Demo of taking input from user is completed");

    }
}