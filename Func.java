public class Func {
    public static void main(String[] args){
        add(2.5353535,23);
        demo();

    }
    public static void add(double  a,int  b){
        double sum  = a + b;
        System.out.println("sum of " + a + " and " + b + " is: " + sum);
    }
    public static void demo(){
        System.out.println("This is a demo function");
    }
    public class Demo{
        public static void main(String[] args){
            System.out.println("This is a demo class");
            demo();
        }
        public static void demo(){
            System.out.println("This is a demo function in demo class");
        }
    }
    

}
// public class Demo{
//     public static void main(String[] args){
//         System.out.println("This is a demo class");
//         demo();
//     }
//     public static void demo(){
//         System.out.println("This is a demo function in demo class");
//     }
// }
