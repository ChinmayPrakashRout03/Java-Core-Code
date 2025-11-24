// 36. static method number operations .
class TestNumberOps {
    
    // Q9. Define a static method to perform two tasks
    // Must be static to be called directly from main()
    public static void processNumber(int num) {
        
        // --- Task 1: Reverse the number ---
        int original = num;
        int reversed = 0;
        int temp = num;
        
        while (temp != 0) {
            int lastDigit = temp % 10;
            reversed = reversed * 10 + lastDigit;
            temp = temp / 10;
        }
        System.out.println("1. Reverse of " + original + " is: " + reversed);
        
        // --- Task 2: Sum of digits ---
        int sum = 0;
        temp = original; // Reset temp to the original number
        
        while (temp != 0) {
            sum = sum + (temp % 10);
            temp = temp / 10;
        }
        System.out.println("2. Sum of digits of " + original + " is: " + sum);
    }

    public static void main(String[] args) {
        // Main block calls the static method
        System.out.println("Processing number 123...");
        processNumber(123);
        
        System.out.println("\nProcessing number 9876...");
        processNumber(9876);
    }
}
