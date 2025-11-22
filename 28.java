// 28. Binary Search (
import java.util.Scanner;
class BinarySearch {
    public static void main(String args[]) {
        int i, first, last, middle, n, search, array[];
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter number of elements (must be sorted):");
        n = in.nextInt();
        array = new int[n];
        
        System.out.println("Enter " + n + " sorted integers:");
        for (i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        
        System.out.println("Enter value to find:");
        search = in.nextInt();
        
        first = 0;
        last = n - 1;
        
        while (first <= last) { 
            middle = (first + last) / 2;
            
            if (array[middle] < search) {
                first = middle + 1; // Search in the right half
            } else if (array[middle] == search) {
                System.out.println(search + " found at location " + (middle + 1) + ".");
                break;
            } else {
                last = middle - 1; // Search in the left half
            }
        }
        
        if (first > last) {
            System.out.println(search + " is not present in the list.");
        }
    }
}