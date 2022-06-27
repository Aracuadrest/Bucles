import java.util.Scanner;

/**
 *. Algoritmo que determine si un número entero dado es perfecto o no. Se dice que 
un número es perfecto cuando es igual a la suma de sus divisores, excluido él mismo. 
Por ejemplo 6 es perfecto, ya que 6 = 1 + 2 + 3.
 * @author Araceli
 *
 */
public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un numero entero:");
		int num=entrada.nextInt();
		int suma=0;
		for(int i=1;i<num;i++) {
			if (num%i==0) {
				suma = suma+i;
			}
		}
		if (suma==num) {
		System.out.println("Numero perfecto");
			}else {
				System.out.println("Numero NO perfecto");
					}
			}
	
			
	}

