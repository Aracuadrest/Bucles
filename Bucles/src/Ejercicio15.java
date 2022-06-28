import java.util.Scanner;

/**
 *   Implementar el ejercicio 7 de la práctica 2, introduciendo un esquema do-while, de 
forma que el usuario decida cuando quiere salir del programa.
 * @author Araceli
 *
 */
public class Ejercicio15 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int seguir;
		
	do {
		System.out.println("Introduce el sueldo bruto: ");
		float sueldo=entrada.nextFloat();
		
		System.out.println("Introduce numeros de hijos: ");
		int hijos=entrada.nextInt();
		float impuesto=0;
		float descuento=0;
		
		
		if (sueldo>1000 && sueldo<1600) {
			impuesto=0.05f;
			descuento=0.01f*hijos;
				if(descuento>0.1f) {
					descuento=0.1f;
				}
			
		}else if(sueldo>=1600 && sueldo<3000) {
			impuesto=0.1f;
			descuento=Math.min(0.1f, 0.01f*hijos);
		}else if(sueldo>=3000 && sueldo<4600) {
			impuesto=0.15f;
			descuento=Math.min(0.1f, 0.01f*hijos);
		}else if(sueldo>=4600) {
			impuesto=0.2f;
			descuento=Math.min(0.15f, 0.015f*hijos);
		}
		float impuestosTotales=sueldo*impuesto;
		
		impuestosTotales= impuestosTotales-impuestosTotales*descuento;
		
		System.out.println("Los impuestos a pagar son: "+impuestosTotales);
		System.out.println("Quiere salir? 1.si 2.no");
			seguir=entrada.nextInt();
			
	}while(seguir!=1);
		
			
			
			
		}

		
	}


