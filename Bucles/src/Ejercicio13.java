import java.util.Scanner;
/**
 * Algoritmo que pida un número natural y determine si es primo o no
 * @author Araceli
 *
 */
public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un numero entero:");
		int num=entrada.nextInt();
		int i =2;
		boolean primo=true;
		
		for (i=2;i<num;i++) {
			if  (num%i==0) {
			primo=false;
			}
		}		
		if ((primo==true)|| (num==1)) {
			System.out.println("Es primo");
		}else {
			System.out.println("NO es primo");
		}
		


}
}