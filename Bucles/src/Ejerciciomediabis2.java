import java.util.Scanner;

public class Ejerciciomediabis2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int suma=0;
		int numeros=0;
		
		int opcion=0;
		do {
			System.out.printf("Introduce el numero %d: ",numeros);
			int num=entrada.nextInt();
			suma=suma+num;
			numeros++;
			System.out.println("Quieres más numeros (1-Si, 0-No)?:");
			opcion=entrada.nextInt();
			}while (opcion==1);
		float media = (float) suma/numeros;
		System.out.println("La suma es: "+suma);
		System.out.println("La media es: "+media);

	}

}
