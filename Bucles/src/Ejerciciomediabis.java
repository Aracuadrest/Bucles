import java.util.Scanner;

public class Ejerciciomediabis {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Cuantos numeros quieres?: ");
		int numeros = entrada.nextInt();
		int suma=0;
		
		for(int i=1;i<=numeros;i++) {
			System.out.printf("Introduce el numero %d: ",i);
			int num=entrada.nextInt();
			suma=suma+num;
		}
		float media = (float) suma/numeros;
		System.out.println("La media es: "+media);

	}

}
