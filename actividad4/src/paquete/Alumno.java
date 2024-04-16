package paquete;

public class Alumno {
	
	
	private Asignatura lengua;
	private Asignatura mates;
	private Asignatura sociales;
	
	
	
	
	
	public Alumno(Asignatura lengua, Asignatura mates, Asignatura sociales) {
		
		this.lengua = lengua;
		this.mates = mates;
		this.sociales = sociales;
	}

	public Alumno(int lengua, int  mates, int sociales) {
		
		this.lengua = new Asignatura(lengua);
		this.mates = new Asignatura(mates);
		this.sociales = new Asignatura(sociales);
	}





	public Asignatura getLengua() {
		return lengua;
	}





	public Asignatura getMates() {
		return mates;
	}





	public Asignatura getSociales() {
		return sociales;
	}
	
	
	
	

}
