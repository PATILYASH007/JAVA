class Circle{
    private double radius= 4.5;
    private double Area;
    private double circumference;

    public void getarea(){
        Area =  3.142*radius*radius;
         System.out.println("Area : " + Area);
        
    }

    public void getcircumference(){
        circumference = 2*3.142*radius;
        System.out.println("Circumference : "+ circumference);
        
    }

}
public class Value{
    public static void main(String[] args){
        Circle C1 = new Circle();
        C1.getarea();
        C1.getcircumference();
    }

}
