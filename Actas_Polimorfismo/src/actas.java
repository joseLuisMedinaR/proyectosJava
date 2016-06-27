
public abstract class actas {
	public int id;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCuatrimestre() {
		return cuatrimestre;
	}

	public void setCuatrimestre(int cuatrimestre) {
		this.cuatrimestre = cuatrimestre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public int cuatrimestre;
	public String nombre;
	public String apellido;
	public String materia;
	
	public void mostrar_acta(){
		System.out.println("Cuatrimestre: "+ cuatrimestre);
		System.out.println("Nombre: "+ nombre);
		System.out.println("Apellido: "+ apellido);
		System.out.println("Materia: "+ materia);
	}
}
