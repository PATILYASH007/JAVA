class SavingAccount{
    static int annualInterestRate=4;
    float savingsBalance;
    float MonthlyInterest;

    SavingAccount(float SB){
        savingsBalance=SB;
    }
    void CalculateMonthlyInterest (){
        float x= (float) annualInterestRate / 12;
        MonthlyInterest =  savingsBalance*((float) (x) /100);

    }

    void PrintBalanceAfterInterest(){
        System.out.printf("Monthly Interest Amount (as per %d): %f",annualInterestRate, MonthlyInterest);
        System.out.println();
        System.out.println("Saving Account balance after including interest:  "+ (MonthlyInterest+savingsBalance));
        System.out.println("******************************************************************************************");
    }
}


public class Static_Saving {
    public static void main(String[] args) {
        SavingAccount s1=new SavingAccount(2000.0F);
        SavingAccount s2=new SavingAccount(3000.0F);
        System.out.println("SAVER S1 DATA");
        s1.CalculateMonthlyInterest();
        s1.PrintBalanceAfterInterest();
        SavingAccount.annualInterestRate=5;
        System.out.println("SAVER S1 DATA");
        s1.CalculateMonthlyInterest();
        s1.PrintBalanceAfterInterest();


    }
}