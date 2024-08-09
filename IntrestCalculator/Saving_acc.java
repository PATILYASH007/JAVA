class Saving_acc{
    double Acc_balance;
    static double Annual_IR;

    public Saving_acc(double balance){
        Acc_balance=balance;
    }

    public void monthly_IR(){
        double monthlyIntrest = (Acc_balance * Annual_IR/12)/100;
        Acc_balance =Acc_balance + monthlyIntrest;
    }

    void display(){
        System.out.printf("Total Balance:%.2f \n",Acc_balance);
    }

    public static void modify_IR(double newRate){
        Annual_IR=newRate;
    }
}
