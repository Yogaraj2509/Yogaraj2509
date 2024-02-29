import java.util.Scanner;

public class calculator {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("\t\tWelcome to calculator");
        boolean b = true;
         do {
        System.out.println("1.ADD\n2.SUB\n3.MULTIPICATION\n4.DIVISION\n5.EXIT");
        int a = sc.nextInt();
            switch (a) {
            case 1:{
                System.out.println("\t\tAdding of two numbers");
                add(15,20);
                break;}
            case 2:{
                System.out.println("\t\tSubtract of two numbers");
                sub();
                break;}
            case 3:{
                System.out.println("\t\tMultipication of two numbers");
                mul();
                break;}
            case 4:{
                System.out.println("\t\tDivision of two numbers");
                div();
                break;}
            case 5:{
                System.out.println("\t\tThank you!!!");
                b=false;
                break;}
        
            default:{
                System.out.println("Enter the correct number");
                break;}
        } 
        } while (b);
       
    }

    public static void add(int a, int b) {
        System.out.println("The sum of two number is = "+(a+b));
    }

     public static void sub() {
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the second number:");
        int b = sc.nextInt();
        System.out.println("The subtract of two number is = "+(a-b));
        
    }
    
    public static void mul() {
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the second number:");
        int b = sc.nextInt();
        System.out.println("The Multipication of two number is = "+(a*b));
        
    }

     public static void div() {
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the second number:");
        int b = sc.nextInt();
        System.out.println("The Multipication of two number is = "+(a/b));
        
    }
}
