public class numberprog {
    /*
     * to create  a number prog
     * palinrdrome,is prime,armstrong.....exit
     */

     public static void isPalindrome(int num){
        int temp = num;
        int rev = 0;
        while (num>0) {
            rev=rev*10+num%10;
            num/=10;
        }
        String result =(temp==rev)?"palindrome":"Not a palindrome";
        System.out.println(result);
     }

     public static void isprime(int a){
        String result = "not prime";
		if(a==0||a==1){
			System.out.println("NPNC");
		}
		else{
			for(int i = 2;i<a;i++){
				if(a%i==0){
					result = "prime";
					break;
				}
			}
		}
		System.out.println(result);
	}
     
    public static void armstrong(int a){
        int temp = a,count =0,last= 0,product = 1,sum = 0;
        while (a>0) {
            a/=10;
            count++;  
        }
        a = temp;
        while (a>0) {
            last=a%10;
           for (int i = 1; i <=count; i++) {
            product*=last;
        } 
        sum =sum+product;
        a/=10;
        product=1;
        }
        String result= (temp == sum)?"armstrong":"not armstrong";
        System.out.println(result);
    }

    public static void fibonacci(int a){
        int n1=0,n2=1,n3;
		for(int i =1;i<=a-2;i++){
			n3=n1+n2;
			System.out.println(n3+" ");
			n1=n2;
			n2=n3;
    }
}

    public static void perfect(int num){
        System.out.println("Enter the number: ");
        int sum = 0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum=sum+i;
            }
        }
        String result = (num==sum)?"perfect":"not perfect";
        System.out.println(result);
     }

    public static void strong(int num){
        int last = 0,fact = 1,sum=0,temp = num;
        while (num>0) {
            last = num%10;
            for (int i = 1; i <=last; i++) {
                fact*=i; 
            }
            sum+=fact;
            fact = 1;
            num/=10;    
        }
        String  res = (temp == sum)?"strong":"Not strong";
        System.out.println(res);
    }

    public static void xylem(int num){
        int last_digit=num%10,ms = 0;
        num=num/10;
        int b = num%10;
        while (num>9) {
            ms=num%10;
            num=num/10;
        }
        String res =((num+last_digit)==(ms+b))?"xylem":"pholem";
        System.out.println(res);
    }
public static void exit(){
    System.out.println("\t\t*******************Thank you for using number program**************");
}
}
