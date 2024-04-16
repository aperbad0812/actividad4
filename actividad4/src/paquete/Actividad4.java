package paquete;

public class Actividad4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Asignatura nombreL = new Asignatura(1);
		Asignatura nombreM = new Asignatura(2);
		Asignatura nombreS = new Asignatura(3);
		
		Alumno paco = new Alumno(nombreL,nombreM,nombreS);
		
		
		Profesor javi = new Profesor();
		
		javi.ponerNotas(paco);
		
		System.out.println( "La Nota media:" + javi.calcularMedia(paco));
		System.out.println( "La Nota de lengua:" + paco.getLengua().getCalificacion());
	}

}
