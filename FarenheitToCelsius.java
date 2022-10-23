import java.util.Scanner;
public class FarenheitToCelsius
{
    public static void main(String[] args)
    {
        double celsius, fahrenheit;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit:");
        fahrenheit = s.nextDouble();
        celsius = ((fahrenheit-32)*5)/9 ;
        System.out.println("Temperature in Celsius:"+celsius);
    }
}
