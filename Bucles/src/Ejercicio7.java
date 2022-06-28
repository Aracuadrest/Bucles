import java.util.Scanner;

/**
 *  Algoritmo que cuente cuántos múltiplos de 7 hay entre dos enteros dados por el 
usuario.
 * @author Araceli
 *
 */
public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce un numero:");
		int num1 = entrada.nextInt();
		System.out.println("Introduce otro numero:");
		int num2 = entrada.nextInt();
		int contador=0;
		
		for (int i=num1;i<=num2; i++) {
			if (i%7==0) {
				contador++;
			}
		}
		System.out.printf("Hay %d divisores de 7 entre %d y %d",contador,num1,num2);
		
		
		
	}

}
