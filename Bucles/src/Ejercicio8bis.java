import java.util.Scanner;

/**
 * Algoritmo que escriba todos los divisores de un número entero introducido por el 
usuario
 * @author Araceli
 *
 */
public class Ejercicio8bis {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce un numero entero:");
		int num1=entrada.nextInt();
		
		for(int i=1;i<=num1/i;i++) {
			if (num1%i==0) {
				System.out.println(i);
				System.out.println(num1/i);
			}
		}

	}

}
