package no.hvl.dat100.matriser;

import java.util.Arrays;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		for  (int i = 0; i < matrise.length; i++) {
            for (int j = 0; j < matrise[i].length; j++) {
                System.out.print(matrise[i][j] + " ");
            }
        }
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		//String tabellString = Arrays.deepToString(matrise);
        String tabellString = "";
        for (int i = 0; i < matrise.length; i++) {
            for (int j = 0; j < matrise[i].length; j++) {
                tabellString += matrise[i][j] + " ";
            }
            if (i < matrise.length - 1 ) {
                tabellString += "\n";
            }
        }
        tabellString += "\n";
        // Enhetstesten ville ha new line etter
        return tabellString;
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		int[][] skalertMatrise = new int[matrise.length][matrise[0].length];
        for(int i = 0; i < matrise.length; i++) {
            for(int j = 0; j < matrise[i].length; j++) {
                skalertMatrise[i][j] = matrise[i][j] *  tall;
            }
        }
        return skalertMatrise;
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		return Arrays.equals(a, b);

		
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

        int rader = matrise.length;
        int kolonner = matrise[0].length;
        int[][] resultat = new int[kolonner][rader];

        for (int i = 0; i < rader; i++) {
            for (int j = 0; j < kolonner; j++) {
                resultat[j][i] = matrise[i][j];
            }
        }
        return resultat;

	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

        int[][] resultat = new int[a.length][b[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < a[0].length; k++) {
                    resultat[i][j] += a[i][k] * b[k][j];
                }
            }
        }
		return resultat;
	
	}
}
