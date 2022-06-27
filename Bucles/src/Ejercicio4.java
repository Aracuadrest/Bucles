import java.util.Scanner;

/**
 *  Algoritmo que escriba los números impares comprendidos entre dos enteros 
introducidos por el usuario. 
 * @author Araceli
 *
 */
public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce un numero entero:");
		int num1=entrada.nextInt();
		System.out.println("Introduce otro numero entero:");
		int num2=entrada.nextInt();
		
		int menor = Math.min(num1, num2);
		int mayor= Math.max(num1, num2);
		
		while (menor<=mayor) {
			if (menor%2!=0) {
				System.out.println(menor);
			}
			menor++;
		}
		
		
		

	}

}
