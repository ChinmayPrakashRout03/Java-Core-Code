// 35. constructor with array parameter
class ArrayProcessor {
    // Q5. Constructor with array parameter
    public ArrayProcessor(int[] dataArray) {
        System.out.println("Constructor called with an array!");
        System.out.println("Array size passed: " + dataArray.length);
        
        // Quickly print the contents of the array
        System.out.print("Array contents: [");
        for (int i = 0; i < dataArray.length; i++) {
            System.out.print(dataArray[i] + (i < dataArray.length - 1 ? ", " : ""));
        }
        System.out.println("]");
    }
}

@SuppressWarnings("unused")
class MainClass {
    public static void main(String[] args) {
        int x[] = {10, 20, 30, 40, 50};
        
        // Create an object and pass the array 'x' to the constructor
        new ArrayProcessor(x); 
        
        System.out.println("Object created successfully by Chinmay.");
    }
}
