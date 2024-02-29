import java.util.Scanner;

public class Features {

    /*
     * the main purpose of the features class is to provide features to user
     * such as signup,login,forgetten credentials,exit,repeat to repeat
     */
    static Scanner sc = new Scanner(System.in);
     public static void signup(){
        // confirm whether he is old user or new user
        if(credential.did_signup_done){
            //old user
            System.out.println("\t\t\tAlready Account Exits please do Login...");
        }else{
            //new user
            System.out.println("\t\tEnter the student ID");//sid
            credential.db_sid=sc.nextInt();
            System.out.println("\t\tEnter the Password");//password
            credential.db_pwd=sc.nextInt();
            System.out.println("\t\tEnter the contact");//contact
            credential.db_contact=sc.nextLong();
            System.out.println("\t\tEnter the age");//age
            credential.db_age=sc.nextInt();
            
            credential.did_signup_done=true;//it means i recived all the data d1,d2,d3,d4
            //and this is the conformation done signup
           
        }
       
     }

     public static void login()throws Exception{
       
        if(credential.did_signup_done){
            System.out.println("Enter the Sid");
            int user_entered_sid=sc.nextInt();
            System.out.println("Enter the password");
            int user_entered_pwd = sc.nextInt();

            if (user_entered_pwd==credential.db_pwd && user_entered_pwd ==credential.db_pwd ) {
               // login sucessfull bcz credentials are correct 
               boolean repeat = true;
               do {
                System.out.println("\t\t\tWelcome to Magic Master");
                System.out.println("1.number program\n2.pattern programming\n3.projects\n4.exit");
                int user_choice=sc.nextInt();
                switch (user_choice) {
                    case 1:{  
                        boolean rpt=true;
                        do {
                            System.out.println("\t\t**********Welcome to number programing*************");
                            System.out.println("1.palindrome\n2.Isprime\n3.armstrong\n4.fibonacci\n5.perfect\n6.strong\n7.xylem\n8.Exit");
                            int user_ch=sc.nextInt(); 
                            switch (user_ch) {
                                case 1:{
                                    System.out.println("Enter the number");
                                    numberprog.isPalindrome(sc.nextInt());
                                    break;}
                                case 2:{
                                    System.out.println("Enter the number");
                                    numberprog.isprime(sc.nextInt());
                                    break;}
                                case 3:{
                                    System.out.println("Enter the number");
                                    numberprog.armstrong(sc.nextInt());
                                    break;}
                                case 4:{
                                    System.out.println("Enter the number");
                                    numberprog.fibonacci(sc.nextInt());
                                    break;}
                                case 5:{
                                    System.out.println("Enter the number");
                                    numberprog.perfect(sc.nextInt());
                                    break;}
                                case 6:{
                                    System.out.println("Enter the number");
                                    numberprog.strong(sc.nextInt());
                                    break;}
                                case 7:{
                                    System.out.println("Enter the number");
                                    numberprog.xylem(sc.nextInt());
                                    break;}
                                case 8:{
                                    numberprog.exit();
                                    rpt=false;
                                    break;}
                            
                                default:{
                                    System.out.println("\t\t*************please Enter the correct input*************");
                                    break;}
                            }
                        } while (rpt);
                        break;}
                    case 2:{
                        boolean rpt = true;
                        do {
                            System.out.println("\t\t************Welcome to the pattern program**********");
                            System.out.println("1.square\n2.triangle\n3.prymid\n4.exit");
                            int user_ch=sc.nextInt();
                            if(user_ch==1){
                               System.out.println("Enter the series");
                               patternprog.square(sc.nextInt());
                            }
                            else if(user_ch==2){
                               System.out.println("Enter the number");
                               patternprog.triangle(sc.nextInt());
                            }
                            else if(user_ch==3){
                                System.out.println("Enter the number");
                                patternprog.praymid(sc.nextInt());
                            }
                            else if(user_ch==4){
                                patternprog.exit();
                                rpt =false;
                            }
                        } while (rpt);
                        break;}
                    case 3:{
                        boolean rpt=true;
                        do {
                           System.out.println("Welcome to the projects");
                           System.out.println("1.swiggy\n2.calculator\n3.exit"); 
                           int user_ch=sc.nextInt();
                           switch (user_ch) {
                            case 1:{
                                System.out.println("\t\t***********Welcome to swiggy**********");
                                project.swiggy();
                                break;}
                            case 2:{
                                project.calculator();
                                break;}
                            case 3:{
                                project.exit();
                                rpt=false;
                            }
                           
                            default:{
                                System.out.println("\t\t************please enter the correct input****************");
                                break;}
                           }
                        } while (rpt);
                        
                        break;}
                    case 4:{
                        Features.exit();
                        repeat=false;
                        break;}
                    default:{
                        System.out.println("\t\t************please enter the correct input********");
                        break;}
                }
               } while (repeat);
            }else{
                //credentials Are Worng
                if(credential.log_in_attempt>3){
                    userInterFace.repeat_my_app=false;
                    exit();
                }
                credential.log_in_attempt++;
            }
        }
     }

     public static void forgettencred(long phone)throws Exception{
         if(credential.did_signup_done){
            // he is old user
            if(verification()){
                //allow the modification for d1 and d2
                System.out.println("\t\tre-enter the new student id");
                credential.db_sid=sc.nextInt();
                System.out.println("\t\tre-enter the new password");
                credential.db_pwd=sc.nextInt();
                System.out.println("\t\t\tModification Applied Sucessfully....... ");
            }else{
                System.err.println("\t\t\tverification fails");
            }
         }else{
            //new user asking for forgotten credentials
            System.out.println("\t\tdo signup and come back");

         }
     }

     public static boolean verification() throws Exception {
       //verifaction should be based on contact
       System.out.println("\t\tEnter the contact present in the database");
       if (sc.nextLong()==credential.db_contact) {
        // matching contact
        //generate otp
        System.out.println("Enter the otp");
        Thread.sleep(3000);
        int sys_otp=genotp();
        System.out.println(sys_otp);//user is seeing the otp
        int user_enterd_otp=sc.nextInt();
        if (user_enterd_otp==sys_otp) {
            // otp is correct
            return true;
        } 
       } 
        return false;
     }

     public static int genotp(){
        
        // generate otp
        return(int)(Math.random()*9999+9999);
        // only int we are returning int 
     }

     public static void exit(){
        System.out.println("\t\t************Thank you for using our application************");
        System.out.println("\t\t**************have a nice day*************");
     }
}
