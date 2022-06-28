import java.util.Scanner;

/**
 *  Algoritmo que escriba la tabla de multiplicar usando esquemas do while
 * @author Araceli
 *
 */
public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Tablas de multiplicar");
		int tabla=1;
		int i=1;
	
		do {
				i=1;
				do {
				System.out.printf("%d x %d = %d\n",tabla,i,tabla*i);
				i++;
				
				}while (i<=10);
			System.out.println("\n");
			tabla++;
	}while (tabla<=10);
	}
}
