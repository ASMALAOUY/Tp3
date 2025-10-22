package Ex5;
import java.util.Scanner;

public class RotationMatrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long[][] A = new long[N][N] ;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = sc.nextLong(); 
            }
        }

        rotate90ClockwiseInPlace(A);

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }

    public static void rotate90ClockwiseInPlace(long[][] A) { // ✅ long[][]
        int N = A.length;

        // Transposition
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                long temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }

        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N / 2; j++) {
                long temp = A[i][j];
                A[i][j] = A[i][N - 1 - j];
                A[i][N - 1 - j] = temp;
            }
        }
    }
}
