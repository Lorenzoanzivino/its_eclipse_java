import java.util.Scanner; // Importiamo lo strumento per leggere da tastiera

public class Main {

	public static void main(String[] args) {

		// 1. Prepariamo lo Scanner per leggere l'input dell'utente
		Scanner scanner = new Scanner(System.in);

		// 2. Chiediamo e leggiamo la base (n)
		System.out.print("Inserisci la base (n): ");
		int n = scanner.nextInt();

		// 3. Chiediamo e leggiamo l'esponente (k)
		System.out.print("Inserisci l'esponente (k): ");
		int k = scanner.nextInt();

		// 4. Calcoliamo la potenza
		// Math.pow restituisce un double (numero con virgola), quindi facciamo il
		// "cast" (int)
		// per forzarlo a diventare un numero intero come richiesto.
		int risultato = (int) Math.pow(n, k);

		// 5. Stampiamo il risultato
		System.out.println("Il risultato di " + n + " elevato alla " + k + " è: " + risultato);

		// 6. Chiudiamo lo scanner (buona norma per liberare memoria)
		scanner.close();
	}
}