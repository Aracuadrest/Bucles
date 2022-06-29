import java.util.Scanner;

/**
 * . Algoritmo que determine si un número entero dado es perfecto o no. Se dice
 * que un número es perfecto cuando es igual a la suma de sus divisores,
 * excluido él mismo. Por ejemplo 6 es perfecto, ya que 6 = 1 + 2 + 3.
 * 
 * @author Araceli
 *
 */
public class Ejercicio12bis {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Los numeros perfectos comprendidos");
		System.out.println("Introduce un numero máximo a comprobar:");
		int num = entrada.nextInt();
		
		
		for(int perfecto=1; perfecto<=num;perfecto++) {
			int suma = 1;
			for (int i = 1; i < perfecto; i++) {
				if (perfecto % i == 0) {
				suma = suma + i;
				}
			}
			if (suma == num) {
			System.out.println(perfecto);
			
			}
		}
	}

}
