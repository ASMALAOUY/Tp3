package Ex2;
import java.util.Scanner;

public class TriangleEtoiles {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Entrez la hauteur du triangle : ");
	        int n=sc.nextInt();
	        for(int i=1;i<=n;i++) {
	        	int nbEtoiles=2*i-1;
	        
	        for(int j=1;j<=nbEtoiles;j++) {
	        	System.out.print("*");
	        }
	        System.out.println();
	        
	        }
	        sc.close();
	        }
}
