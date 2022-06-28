import java.util.Scanner;

/**
 * . Algoritmo que escriba las tablas de multiplicar del 1 al 10 usando esquemas for
 * @author Araceli
 *
 */
public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Tablas de multiplicar:");
			
		for (int tabla=1;tabla<=10;tabla++) {
		
		for (int i=1;i<=10;i++) {
			System.out.printf("%d x %d = %d\n",tabla,i,tabla*i);
			}
		System.out.println("\n");
		}
	}

}
