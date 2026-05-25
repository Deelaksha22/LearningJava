public class Operators{
    public static void main(String[] args) {
        //Arthmetic operator
        int a = 10;
        int b = 20;
        int res = a + b;
        System.out.println("The sum of " + a +" and "+ b +" is " +res);
        oplgc();

    }
    public static void oplgc(){
        System.out.println(22==22);

        if(!true){
            System.out.println("Its Logic");

        }
        else{
            System.out.println("Its not");

        }
        System.out.println(2>1 && 23>1);
        System.out.println(22==0 || 1==1);
    }
    
}