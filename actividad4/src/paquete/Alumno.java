package paquete;


/**
 * <h1> Clase Alumno</h1>
 * @version 0.01
 * @author aperbad@code.org
 * @since 04/2024
 */

public class Alumno {
	

	/**
	 * Atributos
	 */
	
	private Asignatura lengua;
	private Asignatura mates;
	private Asignatura sociales;
	private String nombre;
	private int edad;
	private String dni;
	
	
	
	/**
	 * Constructores
	 * <b>Descripcion</b> : Crean varios objetos alumnos
	 */
	
	public Alumno (Asignatura lengua, Asignatura mates, Asignatura sociales) {
		

		this.lengua = lengua;
		this.mates = mates;
		this.sociales = sociales;
	}

	public Alumno (int lengua, int  mates, int sociales) {
		
		this.lengua = new Asignatura(lengua);
		this.mates = new Asignatura(mates);
		this.sociales = new Asignatura(sociales);
	}

	
	public Alumno(String nombre, int edad, String dni,Asignatura lengua, Asignatura mates, Asignatura sociales) {
		
		  this.nombre = nombre;
	      this.edad = edad;
	      this.dni = dni;
	      this.lengua = lengua;
		  this.mates = mates;
		  this.sociales = sociales;
	}
		
		
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
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
	
	
	/**
	 * <b>Descripcion</b> : toStringAlumno
	 * <b>Parámetros</b>
	 * <ul>
	 * <li>@param :Recoge una cadena de caracteres.
	 * </ul>
	 * <b>Estado</b> : Funcional
	 */
	
	public String toStringAlumno() {
		return "Nombre: "+ nombre +" Edad: "+ edad +" DNI: "+ dni +"Clasificacion de las tres asignaturas: "+lengua.getCalificacion()+", "+sociales.getCalificacion()+", "+mates.getCalificacion()+".";
	}

}
