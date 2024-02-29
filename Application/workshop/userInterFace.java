import java.util.*;

public class userInterFace {
    static Scanner sc= new Scanner(System.in);
    static boolean repeat_my_app=true;

    public static void main(String[] args)throws Exception {
           try{
            
           }catch(Exception e){

           } 
        do {
            System.out.println("\t\t**********Magic master******************");
            System.out.println("1.sign up\n2.login\n3.forgetten credentials\n4.exit");
            int user_input = sc.nextInt();
        switch (user_input) {
            case 1:{//signup
                System.out.println("\t\t****************Welcome to the Magic master***********");
                Features.signup();
                System.out.println("\t\t********Signup Done sucessfully*********");
                break;}
            case 2:{//login
                  System.out.println("\t\t********please do login after signup**********");
                  Features.login();
                break;}
            case 3:{//forgetten credentials
                System.out.println("\t\t***********please enter the details********");
                System.out.println("enter the phone number in the database");
                Features.forgettencred(sc.nextInt());
                break;}
            case 4:{//exit
                Features.exit();
                repeat_my_app=false;
                break;}
        
            default:{//invalid input
                System.out.println("\t\t***********please enter the correct input*******");
                break;}
        }
        } while (repeat_my_app);
    }
}
