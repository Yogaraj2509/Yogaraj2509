public class patternprog {
    
    public static void square(int a){
       for (int i = 0; i <a; i++) {
        for (int j = 0; j <a; j++) {
            if (i==0||j==0||i==a-1||j==a) {
                System.out.print("* ");
            } else {
                System.out.print(" ");
            }  
         }
         System.out.println();
       }
    }

    public static void triangle(int a){
        for (int i = 0; i <a; i++) {
        for (int j = 0; j <a; j++) {
            if (i>=j) {
                System.out.print("* ");
            } else {
                System.out.print(" ");
            }  
         }
         System.out.println();
       }
    }

    public static void praymid(int a){
        for (int i = 0; i <a; i++) {
        for (int j = 0; j <a; j++) {
            if (i+j>=a-1&&i>=j) {
                System.out.print("* ");
            } else {
                System.out.print(" ");
            }  
         }
         System.out.println();
       }
    }

    public static void exit(){
        System.out.println("Thanks for using pattern program");
    }
}
