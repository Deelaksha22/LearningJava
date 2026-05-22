public class FunctionCalling {
    public static void main(String[] args) {
        greet("Alice");
        greet("Bob");
        add(10, 20);
    }
    
    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }
    public static void add(int a, int b) {
        int sum = a + b;
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);
    }
}
