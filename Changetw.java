import java.util.Scanner;
public class Changetw
{

    public static void main(String[] args)
    {
        double purchaseAmount, cashPaid, temp;
        int change;
        Scanner x = new Scanner(System.in);
        
        System.out.println("Enter amount of purchase");
        purchaseAmount = x.nextDouble();
        
        System.out.println("Enter amount of cash tendered: ");
        cashPaid = x.nextDouble();
        
        temp = cashPaid - purchaseAmount;
        temp = temp - (int)temp + 0.00001;
        change = (int)(temp * 100);
        System.out.println("Number of quarters = " + (change/25));
        change = change - (change/25)*25;
        
        System.out.println("Number of dimes = " + (change/10));
        change = change - (change/10)*10;
      
        System.out.println("Number of nickels = " + (change/5));
        change = change - (change/5)*5;
        
        System.out.println("Number of pennies = " + change);
    }
}
