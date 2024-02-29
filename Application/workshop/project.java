import java.util.Scanner;

public class project {
    static Scanner sc= new Scanner(System.in);

    public static void swiggy()throws Exception{
        System.out.println("\t\t\tSelect the Hotel");
        System.out.println("1.Bilal's\n2.Buhari\n3.A2B\n4.Exit");
        int selecting_hotel = sc.nextInt(); 
        switch(selecting_hotel){
            case 1:{
                System.out.println("\t\t\tWelcome to Bilal's hotel");
                System.out.println("1.Mutton briyani\n2.chicken briyani\n3.exit");
                int selecting_dish = sc.nextInt();
                switch(selecting_dish){
                    case 1:{
                        int dish_price = 380;
                        System.out.println("Enter the Quantity:");
                        int quantity = sc.nextInt();
                        int total_price = dish_price*quantity;
                        System.out.println("total bill ="+total_price);
                        System.out.println("1.gpay\n2.phonepe\n3.cod");
                        int payment_mode = sc.nextInt();
                        switch(payment_mode){
                            case 1:{
                                System.out.println("Please enter the bill Amount:");
                                int bill_amount = sc.nextInt();
                                if(bill_amount==total_price){
                                    System.out.println("please wait otp will generate!!!");
                                    int sys_otp=(int)(Math.random()*9999+9999);
                                    Thread.sleep(3000);
                                    System.out.println("The otp is:"+sys_otp);
                                    System.out.println("Enter the otp: ");
                                    int user_otp = sc.nextInt();
                                    if(sys_otp==user_otp){
                                        System.out.println("\t\t\t\tORDER PLACED!!!!");
                                        System.out.println("\t\t\t***********Thank you*************");
                                    }
                                    else{
                                        System.out.println("please enter the correct otp");
                                    }
                                }
                                else{
                                    System.out.println("please enter the correct bill amount");
                                }
                                break;}
                            case 2:{
                                System.out.println("Please enter the bill Amount:");
                                int bill_amount = sc.nextInt();
                                if(bill_amount==total_price){
                                    System.out.println("please wait otp will generate!!!");
                                    int sys_otp=(int)(Math.random()*9999+9999);
                                    Thread.sleep(3000);
                                    System.out.println("The otp is:"+sys_otp);
                                    System.out.println("Enter the otp: ");
                                    int user_otp = sc.nextInt();
                                    if(sys_otp==user_otp){
                                        System.out.println("\t\t\t\tORDER PLACED!!!!");
                                        System.out.println("\t\t\t***********Thank you*************");
                                    }
                                    else{
                                        System.out.println("please enter the correct otp");
                                    }
                                }
                                else{
                                    System.out.println("please enter the correct bill amount");
                                }
                                break;}
                            case 3:{
                                System.out.println("Enter the bill amount:");
                                int bill_amount = sc.nextInt();
                                if(bill_amount==total_price){
                                    System.out.println("\t\t\tORDER PLACED");
                                    System.out.println("\t\t\tPlease pay to the Delivery boy");
                                    System.out.println("\t\t\t***********Thank you*************");
                                }
                                else{
                                    System.out.println("please enter the correct bill amount");
                                }
                                break;}
                            default:{
                                System.out.println("enter the correct input");
                            }
                        }
                        break;}
                    case 2 :{
                        int dish_price = 280;
                        System.out.println("Enter the Quantity:");
                        int quantity = sc.nextInt();
                        int total_price = dish_price*quantity;
                        System.out.println("total bill ="+total_price);
                        System.out.println("1.gpay\n2.phonepe\n3.cod");
                        int payment_mode = sc.nextInt();
                        switch(payment_mode){
                            case 1:{
                                System.out.println("Please enter the bill Amount:");
                                int bill_amount = sc.nextInt();
                                if(bill_amount==total_price){
                                    System.out.println("please wait otp will generate!!!");
                                    int sys_otp=(int)(Math.random()*9999+9999);
                                    Thread.sleep(3000);
                                    System.out.println("The otp is:"+sys_otp);
                                    System.out.println("Enter the otp: ");
                                    int user_otp = sc.nextInt();
                                    if(sys_otp==user_otp){
                                        System.out.println("\t\t\t\tORDER PLACED!!!!");
                                        System.out.println("\t\t\t***********Thank you*************");
                                    }
                                    else{
                                        System.out.println("please enter the correct otp");
                                    }
                                }
                                else{
                                    System.out.println("please enter the correct bill amount");
                                }
                                break;}
                            case 2:{
                                System.out.println("Please enter the bill Amount:");
                                int bill_amount = sc.nextInt();
                                if(bill_amount==total_price){
                                    System.out.println("please wait otp will generate!!!");
                                    int sys_otp=(int)(Math.random()*9999+9999);
                                    Thread.sleep(3000);
                                    System.out.println("The otp is:"+sys_otp);
                                    System.out.println("Enter the otp: ");
                                    int user_otp = sc.nextInt();
                                    if(sys_otp==user_otp){
                                        System.out.println("\t\t\t\tORDER PLACED!!!!");
                                        System.out.println("\t\t\t***********Thank you*************");
                                    }
                                    else{
                                        System.out.println("please enter the correct otp");
                                    }
                                }
                                else{
                                    System.out.println("please enter the correct bill amount");
                                }
                                break;}
                            case 3 :{
                                System.out.println("Enter the bill amount:");
                                int bill_amount = sc.nextInt();
                                if(bill_amount==total_price){
                                    System.out.println("\t\t\tORDER PLACED");
                                     System.out.println("\t\t\tPlease pay to the Delivery boy");
                                    System.out.println("\t\t\t***********Thank you*************");
                                }
                                else{
                                    System.out.println("please enter the correct bill amount");
                                }
                                break;}
                            default:{
                                System.out.println("enter the correct input");
                                break;
                            }
                        }
                        break;}
                    case 3:{
                        System.out.println("\t\t\t*********Thank you!!!!!!***********");
                        break;}
                    default:{
                        System.out.println("Enter the valid input");
                    }
                }
                break;
            }
            case 2:{
                System.out.println("\t\t\tWelcome to Buhari hotel");
                System.out.println("1.Mutton briyani\n2.chicken briyani\n3.exit");
                int selecting_dish = sc.nextInt();
                switch(selecting_dish){
                    case 1:{
                        int dish_price = 380;
                        System.out.println("Enter the Quantity:");
                        int quantity = sc.nextInt();
                        int total_price = dish_price*quantity;
                        System.out.println("total bill ="+total_price);
                        System.out.println("1.gpay\n2.phonepe\n3.cod");
                        int payment_mode = sc.nextInt();
                        switch(payment_mode){
                            case 1:{
                                System.out.println("Please enter the bill Amount:");
                                int bill_amount = sc.nextInt();
                                if(bill_amount==total_price){
                                    System.out.println("please wait otp will generate!!!");
                                    int sys_otp=(int)(Math.random()*9999+9999);
                                    Thread.sleep(3000);
                                    System.out.println("The otp is:"+sys_otp);
                                    System.out.println("Enter the otp: ");
                                    int user_otp = sc.nextInt();
                                    if(sys_otp==user_otp){
                                        System.out.println("\t\t\t\tORDER PLACED!!!!");
                                        System.out.println("\t\t\t***********Thank you*************");
                                    }
                                    else{
                                        System.out.println("please enter the correct otp");
                                    }
                                }
                                else{
                                    System.out.println("please enter the correct bill amount");
                                }
                                break;}
                            case 2:{
                                System.out.println("Please enter the bill Amount:");
                                int bill_amount = sc.nextInt();
                                if(bill_amount==total_price){
                                    System.out.println("please wait otp will generate!!!");
                                    int sys_otp=(int)(Math.random()*9999+9999);
                                    Thread.sleep(3000);
                                    System.out.println("The otp is:"+sys_otp);
                                    System.out.println("Enter the otp: ");
                                    int user_otp = sc.nextInt();
                                    if(sys_otp==user_otp){
                                        System.out.println("\t\t\t\tORDER PLACED!!!!");
                                        System.out.println("\t\t\t***********Thank you*************");
                                    }
                                    else{
                                        System.out.println("please enter the correct otp");
                                    }
                                }
                                else{
                                    System.out.println("please enter the correct bill amount");
                                }
                                break;}
                            case 3:{
                                 System.out.println("Enter the bill amount:");
                                int bill_amount = sc.nextInt();
                                if(bill_amount==total_price){
                                    System.out.println("\t\t\tORDER PLACED");
                                    System.out.println("\t\t\tPlease pay to the Delivery boy");
                                    System.out.println("\t\t\t***********Thank you*************");
                                }
                                else{
                                    System.out.println("please enter the correct bill amount");
                                }
                                break;}
                            default:{
                                 System.out.println("Enter the valid input");
                            }
                        }
                        break;}
                    case 2:{
                        int dish_price = 280;
                        System.out.println("Enter the Quantity:");
                        int quantity = sc.nextInt();
                        int total_price = dish_price*quantity;
                        System.out.println("total bill ="+total_price);
                        System.out.println("1.gpay\n2.phonepe\n3.cod");
                        int payment_mode = sc.nextInt();
                        switch(payment_mode){
                            case 1:{
                                 System.out.println("Please enter the bill Amount:");
                                int bill_amount = sc.nextInt();
                                if(bill_amount==total_price){
                                    System.out.println("please wait otp will generate!!!");
                                    int sys_otp=(int)(Math.random()*9999+9999);
                                    Thread.sleep(3000);
                                    System.out.println("The otp is:"+sys_otp);
                                    System.out.println("Enter the otp: ");
                                    int user_otp = sc.nextInt();
                                    if(sys_otp==user_otp){
                                        System.out.println("\t\t\t\tORDER PLACED!!!!");
                                        System.out.println("\t\t\t***********Thank you*************");
                                    }
                                    else{
                                        System.out.println("please enter the correct otp");
                                    }
                                }
                                else{
                                    System.out.println("please enter the correct bill amount");
                                }
                                break;}
                            case 2:{
                                 System.out.println("Please enter the bill Amount:");
                                int bill_amount = sc.nextInt();
                                if(bill_amount==total_price){
                                    System.out.println("please wait otp will generate!!!");
                                    int sys_otp=(int)(Math.random()*9999+9999);
                                    Thread.sleep(3000);
                                    System.out.println("The otp is:"+sys_otp);
                                    System.out.println("Enter the otp: ");
                                    int user_otp = sc.nextInt();
                                    if(sys_otp==user_otp){
                                        System.out.println("\t\t\t\tORDER PLACED!!!!");
                                        System.out.println("\t\t\t***********Thank you*************");
                                    }
                                    else{
                                        System.out.println("please enter the correct otp");
                                    }
                                }
                                else{
                                    System.out.println("please enter the correct bill amount");
                                }
                                break;}
                            case 3:{
                                System.out.println("Enter the bill amount:");
                                int bill_amount = sc.nextInt();
                                if(bill_amount==total_price){
                                    System.out.println("\t\t\tORDER PLACED!!!!");
                                    System.out.println("\t\t\tPlease pay to the Delivery boy");
                                    System.out.println("\t\t\t***********Thank you*************");
                                }
                                else{
                                    System.out.println("please enter the correct bill amount");
                                }
                                break;}

                        }
                        break;}
                    case 3:{
                         System.out.println("\t\t\t*********Thank you!!!!!!***********");
                        break;}
                    default:{
                         System.out.println("Enter the valid input");
                    }
                }
                break;}
            case 3:{
                System.out.println("\t\t\tWelcome to A2B hotel");
                System.out.println("1.Carrot\n2.Grass\n3.Water\n4.exit");
                int selecting_dish = sc.nextInt();
                switch(selecting_dish){
                    case 1:{
                        int dish_price = 100;
                        System.out.println("Enter the Quantity in KG:");
                        int quantity = sc.nextInt();
                        int total_price = dish_price*quantity;
                        System.out.println("total bill ="+total_price);
                        System.out.println("1.gpay\n2.phonepe\n3.cod");
                        int payment_mode = sc.nextInt();
                        switch(payment_mode){
                            case 1:{
                                System.out.println("Please enter the bill Amount:");
                                int bill_amount = sc.nextInt();
                                if(bill_amount==total_price){
                                    System.out.println("please wait otp will generate!!!");
                                    int sys_otp=(int)(Math.random()*9999+9999);
                                    Thread.sleep(3000);
                                    System.out.println("The otp is:"+sys_otp);
                                    System.out.println("Enter the otp: ");
                                    int user_otp = sc.nextInt();
                                    if(sys_otp==user_otp){
                                        System.out.println("\t\t\t\tORDER PLACED!!!!");
                                        System.out.println("\t\t\t***********Thank you*************");
                                    }
                                    else{
                                        System.out.println("please enter the correct otp");
                                    }
                                }
                                else{
                                    System.out.println("please enter the correct bill amount");
                                }
                                break;}
                            case 2:{
                                System.out.println("Please enter the bill Amount:");
                                int bill_amount = sc.nextInt();
                                if(bill_amount==total_price){
                                    System.out.println("please wait otp will generate!!!");
                                    int sys_otp=(int)(Math.random()*9999+9999);
                                    Thread.sleep(3000);
                                    System.out.println("The otp is:"+sys_otp);
                                    System.out.println("Enter the otp: ");
                                    int user_otp = sc.nextInt();
                                    if(sys_otp==user_otp){
                                        System.out.println("\t\t\t\tORDER PLACED!!!!");
                                        System.out.println("\t\t\t***********Thank you*************");
                                    }
                                    else{
                                        System.out.println("please enter the correct otp");
                                    }
                                }
                                else{
                                    System.out.println("please enter the correct bill amount");
                                }
                                break;}
                            case 3:{
                                System.out.println("Enter the bill amount:");
                                int bill_amount = sc.nextInt();
                                if(bill_amount==total_price){
                                    System.out.println("\t\t\tORDER PLACED");
                                    System.out.println("\t\t\tPlease pay to the Delivery boy");
                                    System.out.println("\t\t\t***********Thank you*************");
                                }
                                else{
                                    System.out.println("please enter the correct bill amount");
                                }
                                break;}
                            default:{
                                System.out.println("Enter the valid input");
                            }
                        }
                        break;}
                    case 2:{
                        int dish_price = 50;
                        System.out.println("Enter the Quantity in KG:");
                        int quantity = sc.nextInt();
                        int total_price = dish_price*quantity;
                        System.out.println("total bill ="+total_price);
                        System.out.println("1.gpay\n2.phonepe\n3.cod");
                        int payment_mode = sc.nextInt();
                        switch(payment_mode){
                            case 1:{
                                System.out.println("Please enter the bill Amount:");
                                int bill_amount = sc.nextInt();
                                if(bill_amount==total_price){
                                    System.out.println("please wait otp will generate!!!");
                                    int sys_otp=(int)(Math.random()*9999+9999);
                                    Thread.sleep(3000);
                                    System.out.println("The otp is:"+sys_otp);
                                    System.out.println("Enter the otp: ");
                                    int user_otp = sc.nextInt();
                                    if(sys_otp==user_otp){
                                        System.out.println("\t\t\t\tORDER PLACED!!!!");
                                        System.out.println("\t\t\t***********Thank you*************");
                                    }
                                    else{
                                        System.out.println("please enter the correct otp");
                                    }
                                }
                                else{
                                    System.out.println("please enter the correct bill amount");
                                }
                                break;}
                            case 2:{
                                System.out.println("Please enter the bill Amount:");
                                int bill_amount = sc.nextInt();
                                if(bill_amount==total_price){
                                    System.out.println("please wait otp will generate!!!");
                                    int sys_otp=(int)(Math.random()*9999+9999);
                                    Thread.sleep(3000);
                                    System.out.println("The otp is:"+sys_otp);
                                    System.out.println("Enter the otp: ");
                                    int user_otp = sc.nextInt();
                                    if(sys_otp==user_otp){
                                        System.out.println("\t\t\t\tORDER PLACED!!!!");
                                        System.out.println("\t\t\t***********Thank you*************");
                                    }
                                    else{
                                        System.out.println("please enter the correct otp");
                                    }
                                }
                                else{
                                    System.out.println("please enter the correct bill amount");
                                }
                                break;}
                            case 3:{
                                System.out.println("Enter the bill amount:");
                                int bill_amount = sc.nextInt();
                                if(bill_amount==total_price){
                                    System.out.println("\t\t\tORDER PLACED");
                                    System.out.println("\t\t\tPlease pay to the Delivery boy");
                                    System.out.println("\t\t\t***********Thank you*************");
                                }
                                else{
                                    System.out.println("please enter the correct bill amount");
                                }
                                break;}
                            default:{
                                System.out.println("Enter the valid input");
                            }

                        }
                        break;}
                    case 3:{
                        int dish_price = 20;
                        System.out.println("Enter the Quantity in litre:");
                        int quantity = sc.nextInt();
                        int total_price = dish_price*quantity;
                        System.out.println("total bill ="+total_price);
                        System.out.println("1.gpay\n2.phonepe\n3.cod");
                        int payment_mode = sc.nextInt();
                        switch(payment_mode){
                            case 1:{
                                System.out.println("Please enter the bill Amount:");
                                int bill_amount = sc.nextInt();
                                if(bill_amount==total_price){
                                    System.out.println("please wait otp will generate!!!");
                                    int sys_otp=(int)(Math.random()*9999+9999);
                                    Thread.sleep(3000);
                                    System.out.println("The otp is:"+sys_otp);
                                    System.out.println("Enter the otp: ");
                                    int user_otp = sc.nextInt();
                                    if(sys_otp==user_otp){
                                        System.out.println("\t\t\t\tORDER PLACED!!!!");
                                        System.out.println("\t\t\t***********Thank you*************");
                                    }
                                    else{
                                        System.out.println("please enter the correct otp");
                                    }
                                }
                                else{
                                    System.out.println("please enter the correct bill amount");
                                }
                                break;}
                            case 2:{System.out.println("Please enter the bill Amount:");
                                int bill_amount = sc.nextInt();
                                if(bill_amount==total_price){
                                    System.out.println("please wait otp will generate!!!");
                                    int sys_otp=(int)(Math.random()*9999+9999);
                                    Thread.sleep(3000);
                                    System.out.println("The otp is:"+sys_otp);
                                    System.out.println("Enter the otp: ");
                                    int user_otp = sc.nextInt();
                                    if(sys_otp==user_otp){
                                        System.out.println("\t\t\t\tORDER PLACED!!!!");
                                        System.out.println("\t\t\t***********Thank you*************");
                                    }
                                    else{
                                        System.out.println("please enter the correct otp");
                                    }
                                }
                                else{
                                    System.out.println("please enter the correct bill amount");
                                }
                                break;}
                            case 3:{
                                 System.out.println("Enter the bill amount:");
                                int bill_amount = sc.nextInt();
                                if(bill_amount==total_price){
                                    System.out.println("\t\t\tORDER PLACED");
                                    System.out.println("\t\t\tPlease pay to the Delivery boy");
                                    System.out.println("\t\t\t***********Thank you*************");
                                }
                                else{
                                    System.out.println("please enter the correct bill amount");
                                }
                                break;}
                            default:{
                                System.out.println("Enter the valid input");
                            }
                        }
                        break;}
                }
                break;}
            case 4:{
                System.out.println("\t\t\t*********Thank you***************");
                break;}
                default:{
                    System.out.println("invaild input");
            }
        }
    }

public static void calculator(){
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

    public static void exit(){
        System.out.println("\t\t*****************Thank you for choosing project program*************");
    }
}


