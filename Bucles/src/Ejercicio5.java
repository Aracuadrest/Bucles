import java.util.Scanner;

/**
 *  Algoritmo que sume los n primeros n�meros enteros, siendo n un n�mero 
introducido por el usuario. 
 * @author Araceli
 *
 */
public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce un numero entero:");
		int num1=entrada.nextInt();
		int suma=0;
		
		for(int i=1;i<=num1;i++) {
			suma=suma+i;
		}
		System.out.println(suma);

	}

}
