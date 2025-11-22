// 16. While loop using break and continue
import java.util.Scanner;
class BreakContinueWhileLoop {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        
        while (true) {
            System.out.println("Input an integer (enter 0 to stop):");
            n = input.nextInt();
            
            if (n != 0) {
                System.out.println("You entered " + n);
            } else {
                break;
            }
        }
        System.out.println("Program finished.");
    }
}