// 15. Print Reverse number
import java.util.Scanner;
class ReverseNumber {
    public static void main(String args[]) {
        int n, reverse = 0;
        System.out.println("Enter the number to reverse:");
        
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        
        int tempN = n; // Store original number
        
        while (tempN != 0) {
            int remainder = tempN % 10;
            reverse = reverse * 10 + remainder;
            tempN = tempN / 10;
        }
        
        System.out.println("Reverse of entered number is " + reverse);
    }
}