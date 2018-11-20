
public class test {

	public static void main(String[] args) {
		Numero2D uno = new Numero2D(30,26); //creo la variabile "uno" con costruttore
		Numero2D due = new Numero2D(); //creo la variabile "due" con costruttore vuoto

		due.setX(15);
		due.setY(13);
		
		System.out.println("Somma: x=" + uno.somma(due).getX() + " y=" + uno.somma(due).getY());
		System.out.println("Sottrazione: x=" + uno.sottrazione(due).getX() + " y=" + uno.sottrazione(due).getY());
		System.out.println("Moltiplicazione: x=" + Numero2D.moltiplicazione(uno, due).getX() + " y=" + Numero2D.moltiplicazione(uno, due).getY());
		System.out.println("Divisione: x=" + Numero2D.divisione(uno, due).getX() + " y=" + Numero2D.divisione(uno, due).getY());
		
		//stampa il risultato restituito dal modulo distanza() come Double
		System.out.println("\nDistanza tra i due punti nel piano cartesiano: " + uno.distanza(due));
	}

}
