// 38. range divisibility check .
import java.util.Scanner;

class DivisibilityChecker {
    public static void main(String[] args) {
        // Q3. Find numbers in a range divisible by 3, 4, or 5
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter start range (srange):");
        int srange = input.nextInt();
        
        System.out.println("Enter end range (erange):");
        int erange = input.nextInt();
        
        System.out.println("\nChecking numbers from " + srange + " to " + erange + ":");

        for (int num = srange; num <= erange; num++) {
            boolean divBy3 = num % 3 == 0;
            boolean divBy4 = num % 4 == 0;
            boolean divBy5 = num % 5 == 0;
            
            // Only print if it's divisible by at least one of them
            if (divBy3 || divBy4 || divBy5) {
                System.out.print("Number " + num + ": ");
                
                if (divBy3) System.out.print("Divisible by 3 ");
                if (divBy4) System.out.print("Divisible by 4 ");
                if (divBy5) System.out.print("Divisible by 5 ");
                
                System.out.println();
            }
        }
    }
}