package paquete;

import java.util.Random;

public class Profesor {
	
	
	
	
	public void ponerNotas (Alumno paco) {
		
		Random aleatorio = new Random();
		
		paco.getLengua().setCalificacion(aleatorio.nextDouble(0,10));
		paco.getMates().setCalificacion(aleatorio.nextDouble(0,10));
		paco.getSociales().setCalificacion(aleatorio.nextDouble(0,10));
		
	
		
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
