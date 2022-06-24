import java.util.Scanner;

/**
 * . Algoritmo que imprima la tabla de multiplicar correspondiente a un número 
comprendido entre uno y diez, introducido por el usuario, usando un esquema do 
while. Nota: En los tres ejercicios anteriores, el programa ha de controlar mediante 
un esquema do-while, que el número está comprendido entre 1 y 10. 
 * @author Araceli
 *
 */
public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Tablas de multiplicar");
		System.out.println("Introduce un número del 1 al 10: ");
		int num=entrada.nextInt();
		
		while (num>10 || num<1) {
			System.out.println("El numero debe estar entre 1 y 10");
			System.out.println("Introduce un número del 1 al 10: ");
			num=entrada.nextInt();
		}
		
		int i =1;
		do {
			
				System.out.printf("%d x %d = %d\n",num,i,num*i);
					i++;
				}while (i<=10);
		
		}
	
	}

	


