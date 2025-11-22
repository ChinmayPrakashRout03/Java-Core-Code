// 13. Compare 2 strings using compareTo()
import java.util.Scanner;
class CompareStrings {
    public static void main(String args[]) {
        String s1, s2;
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first string:");
        s1 = in.nextLine();
        System.out.println("Enter the second string:");
        s2 = in.nextLine();
        
        int result = s1.compareTo(s2);
        
        if (result > 0) {
            System.out.println("First string is lexicographically greater than second.");
        } else if (result < 0) {
            System.out.println("First string is lexicographically smaller than second.");
        } else {
            System.out.println("Both strings are equal.");
        }
    }
}