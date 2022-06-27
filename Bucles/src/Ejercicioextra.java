import java.util.Random;
import java.util.Scanner;

/**
 * Programa que pide un numero del 1 al 10 hasta que el usuario
 *  acierte el numero definido en el programa
 * @author Araceli
 *
 */
public class Ejercicioextra {

	public static void main(String[] args) {
		Random aleatorio=new Random();
		final int acierto=aleatorio.nextInt(10)+1;
		
		Scanner entrada=new Scanner(System.in);
		int num;
		
		do {
			System.out.println("Acierta el número ( del 1 al 10):");
			num=entrada.nextInt();
			if (num==acierto) {
				System.out.println("¡Enhorabuena!, has acertado.");
			}else {
				System.out.println("Has fallado. Vuelve a intentarlo.");
			}
		}while (num!=acierto);
		

	}

}
