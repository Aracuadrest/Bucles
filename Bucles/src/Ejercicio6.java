import java.util.Scanner;

/**
 * Algoritmo que calcule el factorial de un número entero introducido por el usuario. 
 * @author Araceli
 *
 */
public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce un numero entero:");
		int num1=entrada.nextInt();
		int factorial=1;
		
		for(int i=1;i<=num1;i++) {
			factorial= factorial*i;
		}
		System.out.println(factorial);
	}

}
