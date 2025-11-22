// 14. While loop (Reads input until 0 is entered)
import java.util.Scanner;
class WhileLoop {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Input an integer (enter 0 to stop):");
        
        // Loop runs as long as the input is not 0
        while ((n = input.nextInt()) != 0) {
            System.out.println("You entered " + n);
            System.out.println("Input another integer (enter 0 to stop):");
        }
        System.out.println("Out of loop");
    }
}