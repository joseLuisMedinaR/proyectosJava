import java.util.Scanner;

public class estacionamientoDelCentro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Escriba el nombre de la cochera: ");
		Scanner sc = new Scanner (System.in);
		cochera co = new cochera();
		auto a = new auto();
		co.nombre = sc.nextLine();
		System.out.println("Escriba la patente del vehículo: ");
		a.patente = sc.next();
		System.out.println("Escriba la marca del vehículo: ");
		a.marca = sc.next();
		co.au=a;
		co.mostrar();
		sc.close();
		
		}

}
