
public class inicio {

	public static void main(String[] args) {
		actas actas01 = new actas_parcial();
		actas actas02 = new actas_parcial();
		actas actas_fin01 = new actas_final();
		actas_parcial ac01 = (actas_parcial) actas01;
		actas_parcial ac02 = (actas_parcial) actas02;
		actas_final fin01 = (actas_final) actas_fin01;
		actas01.id=1;
		actas01.nombre= "José";
		actas01.apellido= "Medina R.";
		actas01.cuatrimestre= 1;
		actas01.materia= "Sistema Operativo";
		ac01.nota_parcial1= 9;
		ac01.nota_parcial2= 8;
		actas02.cuatrimestre=2;
		actas02.id=ac01.id;
		actas02.nombre=ac01.nombre;
		actas02.apellido=ac01.apellido;
		actas02.materia=ac01.materia;
		ac02.nota_parcial1= 8;
		ac02.nota_parcial2= 7;
		fin01.nombre=ac01.nombre;
		fin01.apellido=ac01.apellido;
		fin01.materia= ac01.materia;
		fin01.nota_final = (ac01.nota_parcial1+ac01.nota_parcial2+ac02.nota_parcial1+ac02.nota_parcial2)/4;
		
		ac01.mostrar_parcial();
		System.out.println("----------------------------");
		ac02.mostrar_parcial();
		System.out.println("----------------------------");
		fin01.mostrar_final();
	}

}
