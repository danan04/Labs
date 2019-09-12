import java.util.Scanner;
public class Quadratics
{
    public static void main()
    {
        Scanner first = new Scanner(System.in);
        System.out.println("insert value for a:");
        double a = first.nextDouble();
        
        Scanner second = new Scanner(System.in);
        System.out.println("insert value for b:");
        double b = second.nextDouble();

        Scanner third = new Scanner(System.in);
        System.out.println("insert value for c:");
        double c = third.nextDouble();

        double answer1;
        double answer2;
        answer1 = (-b + Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2*a);
        answer2 = (-b - Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2*a);
        System.out.println("The x value is: " + answer1 +" , " + answer2);
    }
}
        