//32. Basic Math Operations
class MathOps {
    // 1. Method to add two numbers
    public int add(int a, int b) {
        return a + b;
    }
    
    // 2. Method to subtract
    public int sub(int a, int b) {
        return a - b;
    }
    
    // 3. Method to multiply
    public int mul(int a, int b) {
        return a * b;
    }
    
    // 4. Method to divide (using double for precise result)
    public double div(int a, int b) {
        return (double) a / b;
    }
}

@SuppressWarnings("unused")
class Tester {
    public static void main(String[] args) {
        MathOps calculator = new MathOps();
        
        int resultAdd = calculator.add(20, 10);
        int resultSub = calculator.sub(50, 15);
        double resultDiv = calculator.div(100, 3);
        
        System.out.println("--- Chinmay's Calculator Test ---");
        System.out.println("Addition (20 + 10): " + resultAdd);
        System.out.println("Subtraction (50 - 15): " + resultSub);
        System.out.println("Multiplication (5 * 4): " + calculator.mul(5, 4));
        System.out.println("Division (100 / 3): " + resultDiv);
    }
}