import java.util.Scanner;

/**
 *  Algoritmo que imprima la tabla de multiplicar correspondiente a un número 
comprendido entre uno y diez, introducido por el usuario, usando un esquema 
while.
 * @author Araceli
 *
 */
public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Tablas de multiplicar");
		System.out.println("Introduce un número del 1 al 10: ");
		int num=entrada.nextInt();
		int i =1;
		while (i<=10) {
			System.out.printf("%d x %d = %d\n",num,i,num*i);
			i++;
		}

	}

}
