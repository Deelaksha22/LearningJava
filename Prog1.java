import java.util.Scanner;

public class Prog1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  student name:");
        String name = sc.next();
        System.err.println("Enter marks in sub1:");
        float mark1  = sc.nextFloat();
        System.err.println("Enter the marks in sub2:");
        float mark2 = sc.nextFloat();
        float Total = mark1 +  mark2;
        float percentage  = ((Total)/200) *100;
        System.out.println("The student" +name+ "He score "+ Total +"and the percent is " + percentage);
    }
    
}