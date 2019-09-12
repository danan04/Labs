import java.util.Scanner;
public class Converttemp
{
    public static void main(String[]args)
    {
        double celsius, farhenheit;
        Scanner x=new Scanner(System.in);
        System.out.println("Enter Celsius,");
        celsius=x.nextDouble();
        farhenheit = 9.0/5.0*celsius+32.0;
        //equation for farhenheit
        System.out.println("farhenheit="+farhenheit);
    }
}