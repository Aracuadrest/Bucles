import java.util.Scanner;

/**
 *  Algoritmo que escriba la tabla de multiplicar usando esquemas while. 
 * @author Araceli
 *
 */
public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Tablas de multiplicar");
		int tabla=1;
		int i=1;
		
		while (tabla<=10) {
			i=1;
			while (i<=10) {
			System.out.printf("%d x %d = %d\n",tabla,i,tabla*i);
			i++;
			
			}
		System.out.println("\n");
		tabla++;
		
		}

	}

}
