import java.util.Scanner;
/**
 * Algoritmo que pida un número natural y determine si es primo o no
 * @author Araceli
 *
 */
public class Ejercicio13bis {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un numero entero:");
		int num=entrada.nextInt();
		int i =2;
		int divisores=0;
		
		for (i=2;i<num&&divisores==0;i++) {
			if  (num%i==0) {
				divisores++;
			}
		}		
		if (divisores>0) {
			System.out.println("El numero es compuesto");
		}else {
			System.out.println("El numero es primo");
		}
		


}
}