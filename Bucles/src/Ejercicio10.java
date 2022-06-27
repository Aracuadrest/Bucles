import java.util.Scanner;

/**
 *  Algoritmo que escriba la tabla de multiplicar usando esquemas while. 
 * @author Araceli
 *
 */
public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce un numero entero:");
		int num1=entrada.nextInt();
		int i=1;
		
		while (i<=10) {
			System.out.printf("%d x %d = %d\n",num1,i,num1*i);
			i++;
		}
		
		

	}

}
