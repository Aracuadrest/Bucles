import java.util.Scanner;

/**
 * Pedir 10 numeros por teclado y calcular su media
 * @author Araceli
 *
 */
public class EjercicioMedia {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int suma=0;
		
		for(int i=1;i<=10;i++) {
			System.out.printf("Introduce el numero %d: ",i);
			int num=entrada.nextInt();
			suma=suma+num;
		}
		float media = suma/10.0f;
		System.out.println("La media es: "+media);
	}

}
