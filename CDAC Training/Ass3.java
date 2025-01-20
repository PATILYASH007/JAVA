import java.lang.*;
import java.util.Scanner;

public class Ass3{
    public static void main(String[] args){

        Scanner Sc = new Scanner(System.in);
        double num1,num2;

        System.out.println("Enter the First Number: ");
        num1 = Sc.nextDouble();

        System.out.println("Enter the second Number: ");
        num2 = Sc.nextDouble();

        double compare = Double.max(num1,num2);
        System.out.println("Maximum number is : "+ compare);


    }
}