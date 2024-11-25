import java.time.LocalDate;
import java.util.Scanner;
import java.time.Period;



class Person{
    Scanner sc= new Scanner(System.in);
    String name;
    int day;
    int month;
    int year;
    int Height;
    int weight;
    String address;



    void setdata(){
        System.out.println("Enter your full name: ");
        name= sc.nextLine();
        System.out.println("Enter your Height: ");
        Height=sc.nextInt();
        System.out.println("Enter your weight: ");
        weight=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your full address: ");
        address=sc.nextLine();

    }


    void CalculateAge(){
        System.out.println("Enter your Year of Birth: ");
        year=sc.nextInt();
        System.out.println("Enter your Month of Birth: ");
        month=sc.nextInt();
        System.out.println("Enter your Day of Birth: ");
        day=sc.nextInt();



    }
    void DisplayAge(){
        LocalDate currentdate= LocalDate.now();

        LocalDate birthdate= LocalDate.of(year,month,day);
        if(birthdate.isAfter(currentdate)){
            System.out.println("Enter valid data!");
        }
        else{
            Period age = Period.between(currentdate,birthdate);
            System.out.println("Your age is: "+age.getYears()+" Years"+age.getMonths()+" Months"+age.getDays()+" Days");
            System.out.println("******************************************");
        }
    }


}

class Student extends Person{
    int rollno;
    int marks;
    float AM;

    int total_sum=0;
    void averagemarks(){
        System.out.println("Enter your roll no.: ");
        rollno=sc.nextInt();
        System.out.println("Enter total number of subjects: ");
        int total_subjects=sc.nextInt();
        System.out.println("Enter max marks per subject: ");
        int max_marls=sc.nextInt();
        int[] arr= new int[total_subjects];
        System.out.println("Enter subject marks: ");
        for(int i=0;i<total_subjects;i++){
            arr[i] = sc.nextInt();
            total_sum = total_sum  +arr[i];
        }
        AM= ((float) total_sum /(total_subjects*max_marls))*100;
    }

    void DisplayStudent(){
        System.out.println("******************************************");
        System.out.println("Name: "+name);
        System.out.println("Roll No.: "+rollno);
        System.out.println("Average Marks: "+AM);
        System.out.println("Height: "+Height);
        System.out.println("Weight: "+weight);
        System.out.println("Address: "+address);

    }
}

class Employee extends Person{
    int empid;
    int salary;
    int tax_percent;
    float tax;

    void calculateTax(){
        System.out.println("Enter empid: ");
        empid=sc.nextInt();
        System.out.println("Enter your salary: ");
        salary=sc.nextInt();
        System.out.println("Enter tax percent: ");
        tax_percent= sc.nextInt();
        tax= (float) (salary*(tax_percent/100));
        System.out.println("Your tax is: "+ tax+ "Salry after tax deduction: "+(salary-tax));
    }

    void DisplayEmployee(){
        System.out.println("******************************************");
        System.out.println("Name: "+name);
        System.out.println("Emp No.: "+empid);
        System.out.println("Height: "+Height);
        System.out.println("Weight"+weight);
        System.out.println("Address: "+address);

    }
}
public class Single_Inheritance {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        Student s1 =new Student();
        Employee e1=new Employee();
        int choice;

        do{
            System.out.println("1.Student");
            System.out.println("2.Employee");
            System.out.println("3.Exit");
            System.out.println("Enter your choice: ");
            choice= sc.nextInt();
            if(choice==1){
                s1.setdata();
                s1.CalculateAge();
                s1.averagemarks();
                s1.DisplayStudent();
                s1.DisplayAge();

            }
            else if(choice==2){
                e1.setdata();
                e1.CalculateAge();
                e1.calculateTax();
                e1.DisplayEmployee();
                e1.DisplayAge();

            }
            else if(choice==3){
                System.out.println("Exiting...");
            }
            else{
                System.out.println("Enter valid choice!");
            }

        }while (choice !=3);
    }
}