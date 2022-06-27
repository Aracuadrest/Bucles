import java.util.Scanner;

/**
 * . Algoritmo que escriba la tabla de multiplicar usando esquemas for
 * @author Araceli
 *
 */
public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce un numero entero:");
		int num1=entrada.nextInt();
		
		for (int i=1;i<=10;i++) {
			System.out.printf("%d x %d = %d\n",num1,i,num1*i);
		}
		
	}

}
