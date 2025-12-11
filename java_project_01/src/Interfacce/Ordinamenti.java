package Interfacce;

import java.util.ArrayList;
import java.util.Collections;

public class Ordinamenti {

	public static void main(String[] args) {
		// Ordino lista di stringhe

		ArrayList<String> nomi = new ArrayList<>();

		nomi.add("romina");
		nomi.add("giulia");
		nomi.add("mario");
		nomi.add("aldo");

		Collections.sort(nomi);

		for (String string : nomi) {
			System.out.println(string);
		}

	}

}
