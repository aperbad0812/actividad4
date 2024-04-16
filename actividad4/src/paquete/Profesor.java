package paquete;

public class Profesor {
	
	
	
	
	public void ponerNotas (Alumno paco) {
		
		paco.getLengua().setCalificacion(Math.random()*10);
		paco.getMates().setCalificacion(Math.random()*10);
		paco.getSociales().setCalificacion(Math.random()*10);
		
	
		
	}
	
	/**
	 * Devuelve la nota media de un alumno
	 * @param paco Alumno a calcular media
	 * @return double con la nota media
	 */
	public double calcularMedia(Alumno paco){
		
		double lengua   = paco.getLengua().getCalificacion();
		double mates    = paco.getMates().getCalificacion();
		double sociales = paco.getSociales().getCalificacion();
	
		return (lengua + mates + sociales) / 3;

	}

}
