import java.util.Scanner;

/**
 *  Algoritmo que pida dos números naturales e imprimir su cociente entero por el 
método de las restas sucesivas. 
 * @author Araceli
 *
 */
public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un numero entero (dividendo):");
		int dividendo=entrada.nextInt();
		System.out.println("Introduce otro numero entero (divisor):");
		int divisor=entrada.nextInt();
		
		int resto=dividendo;
		int cociente=0;
		
			while(resto>=divisor) {
				resto=resto-divisor;
				cociente++;
				}	
			System.out.println("El cociente entero es: "+cociente+" \ny el resto es: "+resto);
			
	
		
	}

}
