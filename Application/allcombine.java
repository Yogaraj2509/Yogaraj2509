import java.util.Scanner;

public class allcombine {
    static Scanner sc = new Scanner(System.in);
    static boolean repeat = true;
    public static void main(String[] args) {
        System.out.println("\t\tWelcome to Application");
        do {
            System.out.println("1.number program\n2.pattern program\n3.calculator\n4.exit");
            int a = sc.nextInt();
            switch (a) {
                case 1:{
                    System.out.println("\t\tWelcome to number program");
                    number();
                    break;}
                case 2:{
                    System.out.println("\t\tWelcome to pattern program");
                    break;}
                case 3:{
                    System.out.println("\t\tWelcome to calculator");
                    break;}
                case 4:{
                    repeat=false;
                    System.out.println("\t\tThank you!!!!");
                    break;}
            
                default:{
                    System.out.println("\t\tplease enter the correct input");
                    break;}
            }
        } while (repeat);
    }

    public static void number() {
        do {
            System.out.println("1.Factorial\n2.Factors\n3.Palindrome\n4.Perfect number\n5.Strong number\n6.Armstrong number\n7.fibinocii number\n8.OTP\n9.Prime number\n10.exit");
            int a =sc.nextInt();
            switch (a) {
                case 1:{
                      System.out.println("\t\twelcome to factorial program");
                      System.out.println("enter the number:");
                      int num =sc.nextInt(),fact = 1;;
                         for (int i=1;i<=num;i++) {
                        fact=fact*i;
                      }
                    System.out.println("\t\tThe factorial of given number:"+fact);
                    break;}
                case 2:{
                    System.out.println("\t\twelcome to factors program");
                    System.out.println("enter the number:");
                    int num = sc.nextInt();
                        for (int j= 1; j<num; j++) {
                             if (num%j==0) {
                            System.out.println("the factors of "+num+" is :"+j);
                        }
                    }
                    break;}
                case 3:{
                    System.out.println("welcome to palindrome program");
                    System.out.println("enter the number:");
                    int nu = sc.nextInt(),temp = nu;
                    int rev =0;
                    while (nu>0) {
                        rev = (rev*10)+(nu%10);
                        nu=nu/10;
                    }
                    String result = rev==temp?"\t\tPALINDROME":"\t\tNOT PALINDROME";
                    System.out.println(result);
                    break;}
                case 4:{
                    System.out.println("welcome to perfect number");
                    break;}
                case 5:{break;}
                case 6:{break;}
                case 7:{break;}
                case 8:{break;}
                case 9:{break;}
                case 10:{
                    repeat=false;
                    System.out.println("\t\tThank you!!!!!!");
                    break;}
            
                default:{
                    System.out.println("\t\tplease enter the correct input");
                    break;}
            }
        } while (repeat);
    }
}
