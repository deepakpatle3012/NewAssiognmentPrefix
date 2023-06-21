import java.util.Scanner;

public class ThirdArray {
    public static void main(String[] args) {
        int m,n ;
        Scanner in = new Scanner(System.in);
        int i;
        int j;
      System.out.println("Input number of rows of matrix");
      m = in.nextInt();
      System.out.println("Input number of columns of matrix");
      n  = in.nextInt();
 
      int array1[][] = new int[m][n];
      System.out.println("Input elements of first matrix");
 
      for ( i = 0 ; i< m ; i++ ){
         for (j = 0 ; j< n ; j++ )
            array1[i][j] = in.nextInt();}
        
        int k,l, sum = 0;
 
        System.out.print(
            "\nFinding Sum of each column:\n\n");
 
        // finding the column sum
        for (i = 0; i < m; ++i) {
            for (j = 0; j < n; ++j) {
 
                // Add the element
                sum = sum + array1[j][i];
            }
 
            // Print the column sum
            System.out.println("Sum of the column " + i
                               + " = " + sum);
 
            // Reset the sum
            sum = 0;
        }
    }
 
        
        }
        
    

