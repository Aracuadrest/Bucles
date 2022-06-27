import java.util.Scanner;

/**
 *  Algoritmo que escriba la tabla de multiplicar usando esquemas do while
 * @author Araceli
 *
 */
public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un numero entero:");
		int num=entrada.nextInt();
		int i=1;
	
		do {
			
				System.out.printf("%d x %d = %d\n",num,i,num*i);
					i++;
				}while (i<=10);
		

	}

}
