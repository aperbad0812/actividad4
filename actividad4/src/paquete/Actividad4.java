package paquete;

public class Actividad4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Asignatura nombreL = new Asignatura(1);
		Asignatura nombreM = new Asignatura(2);
		Asignatura nombreS = new Asignatura(3);
		
		
		
	/*
	 * Comprobación del primer constructor
	 */
	
		Alumno paco = new Alumno(nombreL,nombreM,nombreS); 
		Profesor javi = new Profesor();
		javi.ponerNotas(paco);
		
		
		
		/*
		 * Comprobación del tercer constructor
		 */

		Alumno alex = new Alumno("Juan", 30, "12345678Z",nombreL,nombreM,nombreS);
		javi.ponerNotas(alex);
		System.out.println(alex.toStringAlumno());
   
		
		
		
		
		
		
		System.out.println(String.format("La Nota media: %.2f", javi.calcularMedia(paco)));
		
		
		/*
		 * Prueba de para obtener una sola asignatura:
		 * System.out.println( "La Nota de lengua:" + paco.getLengua().getCalificacion());
		 */
		
		
	
		
		
	
	
	
	}

}
