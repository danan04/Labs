import java.util.Random;
public class GenerateRandomNumber
{
    public static void main(String[]args)
    {
        Random generator = new Random();
        int number;
        number = generator.nextInt(5)+1;
        //adds plus 1
        System.out.println(""+number);
    }
}