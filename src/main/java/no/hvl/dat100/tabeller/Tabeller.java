package no.hvl.dat100.tabeller;


import java.util.Arrays;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		for (int tall : tabell) {
            System.out.println(tall);
        }

	}

	// b)
	public static String tilStreng(int[] tabell) {
        String tabellstreng = Arrays.toString(tabell);
        return tabellstreng.replaceAll("\\s","");
	}

	// c)
	public static int summer(int[] tabell) {
        int sum = 0;
		for (int tall : tabell) {
            sum += tall;
        }
        return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		for (int n : tabell) {
            if  (n == tall) {
                return true;
            }
        }
        return false;

	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		for  (int i  = 0; i < tabell.length; i++) {
            if (tabell[i] == tall) {
                return i;
            }
        }
        return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {
        int[] reversert = new int[tabell.length];
        int k = 0;
        for(int i = tabell.length - 1; i >= 0; i--) {
            reversert[i] = tabell[k];
            k++;
        }
        return reversert;
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		int[] sortertTabell = Arrays.copyOf(tabell,  tabell.length);
        Arrays.sort(sortertTabell);
        return Arrays.equals(sortertTabell, tabell);
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int[] tabellKombo = new int[tabell1.length + tabell2.length];
        System.arraycopy(tabell1, 0, tabellKombo, 0, tabell1.length);
        System.arraycopy(tabell2, 0, tabellKombo, tabell1.length, tabell2.length);
        return tabellKombo;
	}
}
