package Ex4;

public class TableauUtil {
    public static void affiche(double[][] t) {
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean regulier(double[][] t) {
        int longueur = t[0].length;
        for (int i = 1; i < t.length; i++) {
            if (t[i].length != longueur) return false;
        }
        return true;
    }

    public static double[] sommeLignes(double[][] t) {
        double[] s = new double[t.length];
        for (int i = 0; i < t.length; i++) {
            double somme = 0;
            for (int j = 0; j < t[i].length; j++) {
                somme += t[i][j];
            }
            s[i] = somme;
        }
        return s;
    }

    public static double[][] somme(double[][] t1, double[][] t2) {
        if (!regulier(t1) || !regulier(t2)) return null;
        if (t1.length != t2.length || t1[0].length != t2[0].length) return null;

        double[][] res = new double[t1.length][t1[0].length];
        for (int i = 0; i < t1.length; i++) {
            for (int j = 0; j < t1[i].length; j++) {
                res[i][j] = t1[i][j] + t2[i][j];
            }
        }
        return res;
    }
}
