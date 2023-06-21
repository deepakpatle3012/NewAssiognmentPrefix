import java.util.Scanner;

public class FifthProblem {
    public static void main(String[] args) {
         int m, n, c, d;
      Scanner in = new Scanner(System.in);
      m = in.nextInt();
      n  = in.nextInt();
 
      int array1[][] = new int[m][n];
      for (  c = 0 ; c < m ; c++ ){
         for ( d = 0 ; d < n ; d++ )
            array1[c][d] = in.nextInt();}
       int sum=0;
       for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            if (i==j) {
                sum +=array1[i][j];
            }
        }} System.out.println("OUTPUT "+sum);
    }
}
