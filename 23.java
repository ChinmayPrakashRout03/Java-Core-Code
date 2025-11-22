// 23. Multiply two matrices
import java.util.Scanner;
class MatrixMultiplication {
    public static void main(String args[]) {
        int m, n, p, q, i, j, k, sum = 0;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter rows(m) and columns(n) of first matrix:");
        m = in.nextInt();
        n = in.nextInt();
        int first[][] = new int[m][n];
        
        System.out.println("Enter elements of first matrix:");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                first[i][j] = in.nextInt();
            }
        }
        
        System.out.println("Enter rows(p) and columns(q) of second matrix:");
        p = in.nextInt();
        q = in.nextInt();
        
        if (n != p) {
            System.out.println("Matrices can't be multiplied (n != p).");
        } else {
            int second[][] = new int[p][q];
            int multiply[][] = new int[m][q];
            
            System.out.println("Enter elements of second matrix:");
            for (i = 0; i < p; i++) {
                for (j = 0; j < q; j++) {
                    second[i][j] = in.nextInt();
                }
            }
            
            for (i = 0; i < m; i++) {
                for (j = 0; j < q; j++) {
                    sum = 0;
                    for (k = 0; k < n; k++) { 
                        sum = sum + first[i][k] * second[k][j];
                    }
                    multiply[i][j] = sum;
                }
            }
            
            System.out.println("Product of entered matrices:");
            for (i = 0; i < m; i++) {
                for (j = 0; j < q; j++) {
                    System.out.print(multiply[i][j] + "\t");
                }
                System.out.print("\n");
            }
        }
    }
}