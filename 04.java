// 4. Convert Fahrenheit to Celsius
import java.util.Scanner;
class FahrenheitToCelsius {
    public static void main(String[] args) {
        float fahrenheit;
        float celsius;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter temperature in Fahrenheit:");
        fahrenheit = in.nextInt();
        
        // Formula: C = (F - 32) * 5 / 9
        celsius = ((fahrenheit - 32) * 5) / 9;
        
        System.out.println("Temperature in Celsius = " + celsius);
    }
}