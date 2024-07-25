import java.lang.Math;

class armstrong{
    public static void main(String args[]){
        int sum=0;
        int temp,dig=0,last=0;
        int n=153;
        temp=n;

        while(temp>0){
            temp=temp/10;
            dig++;
        }
        temp=n;

        while(temp>0){
            last=temp%10;
            sum+=(Math.pow(last, dig));
            temp/=10;
        }

        if(sum==n){
            System.out.println(n);
            System.out.println("NUMBER IS PALINDROME");
        }
        else{
            System.out.println(n);
            System.out.println("number is not palendrome");
        }


    }
    
}