package Ex4;

public class TestTableauUtil {
    public static void main(String[] args) {
        double[][] t1 = {
            {1.5, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.5, 8.5, 9.0}
        };

        double[][] t2 = {
            {1.0, 1.0, 1.0},
            {2.0, 2.0, 2.0},
            {3.0, 3.0, 3.0}
        };

        System.out.println("=== Tableau t1 ===");
        TableauUtil.affiche(t1);

        System.out.println("\nRégulier ? " + TableauUtil.regulier(t1));

        System.out.println("\n=== Sommes des lignes de t1 ===");
        double[] s = TableauUtil.sommeLignes(t1);
        for (double v : s) {
            System.out.println(v);
        }

        System.out.println("\n=== Somme de t1 et t2 ===");
        double[][] somme = TableauUtil.somme(t1, t2);
        if (somme != null)
            TableauUtil.affiche(somme);
        else
            System.out.println("Les tableaux ne sont pas compatibles.");
    }
}
