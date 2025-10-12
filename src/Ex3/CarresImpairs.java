package Ex3;
import java.util.Scanner;

public class CarresImpairs {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("entrer un nomber n:");
		int n =sc.nextInt();
		int[] tab=new int[n];
		 int impair = 1;
		for(int i=0;i<n;i++) {
			tab[i]=impair;
			impair += 2;
			
			
		}
		for (int i = 0; i < n; i++) {
            int carre = tab[i] * tab[i];
            System.out.println(tab[i] + " a pour carre " + carre);
        }

        sc.close();
		
		
	}

}
