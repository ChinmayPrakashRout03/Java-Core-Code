// 19. Check if number is Armstrong
import java.util.Scanner;
class ArmstrongNumber {
    
    // Helper method to calculate power
    static int power(int base, int exp) {
        int result = 1;
        for (int i = 1; i <= exp; i++) {
            result = result * base;
        }
        return result;
    }

    public static void main(String args[]) {
        int n, sum = 0, temp, remainder, digits = 0;
        
        Scanner in = new Scanner(System.in);
        System.out.println("Input a number to check if it is an Armstrong number:");
        n = in.nextInt();
        
        temp = n;
        
        // Count number of digits
        while (temp != 0) {
            digits++;
            temp = temp / 10;
        }
        
        temp = n;
        
        while (temp != 0) {
            remainder = temp % 10;
            sum = sum + power(remainder, digits);
            temp = temp / 10;
        }
        
        if (n == sum) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }
    }
}