import java.util.Scanner;

public class PrinHabitacion {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num, noches;
		
		System.out.println("Elige una habitacion");
		System.out.println("1. Habitacion Normal");
		System.out.println("2. Habitacion Suite");
		int opcion = teclado.nextInt();
		
		if(opcion == 1) {
			System.out.println("Elige numero de habitacion");
			num = teclado.nextInt();
			Habitacion habitacion = new Habitacion(num);
			System.out.println("Digita numero de noches");
			noches = teclado.nextInt();
			System.out.println("Total:");
			System.out.println(habitacion.getTarifa()*noches);
		}
		else if( opcion == 2) {
			System.out.println("Elige numero de habitacion");
			num = teclado.nextInt();
			Suite suite = new Suite(num);
			System.out.println("Digita numero de noches");
			noches = teclado.nextInt();
			System.out.println("Total:");
			System.out.println(suite.getTarifa()*noches);
			
		}
		else {
			System.out.println("Opcion no valida");
		}
	}

}
