
public class actas_parcial extends actas{
	public int nota_parcial1;
	public int nota_parcial2;
	public void mostrar_parcial(){
		this.mostrar_acta();
		System.out.println("Nota Parcial 1: "+this.nota_parcial1);
		System.out.println("Nota Parcial 2: "+this.nota_parcial2);
	}

}
