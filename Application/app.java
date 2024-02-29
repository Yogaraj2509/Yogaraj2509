import java.util.*;
class app{
    static Scanner sc = new Scanner(System.in);
     public static void main(String[] args) throws InterruptedException{
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
}
    

     
     