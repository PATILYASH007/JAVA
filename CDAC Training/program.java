import java.lang.Math;
import java.util.Scanner;
class cal{
    public static int factorial(int num){
        int ans=1;
        for(int i=1; i<=num; i++){
            ans=ans*i;

        }
        return ans;
    }
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        if(n==2 || n==3){
            return true;
        }
        if(n%2==0 || n%3==0){
            return false;
        }
        for(int i=5; i<Math.sqrt(n); i+=6){
            if(n%i==0 || n%(i+2)==0){
                return false;
            }
            return true;
        }
        return true;
    }
    public static void printNegativePositive(int num){
        if(num>0){
            System.out.println("The number is Positive");
        }
        if(num<0){
            System.out.println("The number is negative");
        }
        if(num==0){
            System.out.println("the number is equal to the 0");
        }
    }

    
}

public class program{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Menu: \n1.Find Factorial\n2.Find Prime number\n3.Find It was positive Or Negative\n");
        
        System.out.println("Enter your Choice: ");
        int choice=sc.nextInt();
        while(choice!=4){
        switch(choice){
            case 1:{
                System.out.println("Enter the number: ");
                int num=sc.nextInt();
                int ans=cal.factorial(num);
                System.out.println("Output = "+ ans);
                break;
            }
            case 2:{
                System.out.println("Enter the number: ");
                int n=sc.nextInt();
                boolean ans=cal.isPrime(n);
                if(ans){
                System.out.println("Number is prime number ");
                }else{
                    System.out.println("Numnber is not prime");
                }
                break;

            }
            case 3:{
                System.out.println("Enter the number: ");
                int num=sc.nextInt();
               cal.printNegativePositive(num);
                break;
            }
        }
        System.out.println("Enter your Choice: ");
        choice=sc.nextInt();

    } 

    }
}