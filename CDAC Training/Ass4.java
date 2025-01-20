class Complex {
    private double real,imag;

    public void init(double r, double i){
        real=r;
        imag=i;

    }
    public void Display(){
        System.out.println("Real : " + real);
        System.out.println("Imaginary : "+ imag);
    }
}
public class Ass4{
    public static void main(String[] args){
        double r,i;
        Complex com =new Complex();
        r=Double.parseDouble(args[0]);
        i=Double.parseDouble(args[1]);

        com.init(r,i);
        com.Display();

    }
}