
public class Inicio {

	public static void main(String[] args) {
		Padre p1 = new Padre();
		p1.nombre= "Pepe";
		p1.apellido="Moreno";
		p1.dni="29281281";
		p1.edad="30";
		p1.mostrar();
		Hijo h1= new Hijo();
		h1.nombre="Juan";
		System.out.println("Ahora van a salir los datos de hijo:");
		h1.mostrarnuevo();
		
	}

}
