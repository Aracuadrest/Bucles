import java.util.Scanner;

/** Algoritmo que imprima la tabla de multiplicar correspondiente a un número 
comprendido entre uno y diez, introducido por el usuario, usando un esquema for. 
 * 
 * @author Araceli
 *
 */
public class Ejercicio1bis2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Tablas de multiplicar");
		System.out.println("Introduce un número del 1 al 10: ");
		int num=entrada.nextInt();
		
		
		while (num<1 || num>10) {
			System.out.println("Zoquete, introduce un número del 1 al 10:");
			num= entrada.nextInt();
		}
		for (int i=1;i<=10;i++) {
				System.out.printf("%d x %d = %d\n",num,i,num*i);
			}
		
		
		
				

	}

}
