package paquete;

import java.util.Random;

/**
 * <h1> Clase Profesor</h1>
 * @version 0.01
 * @author aperbad@code.org
 * @since 04/2024
 */
public class Profesor {
	
	/**
	 * Devuelve la notas aleatorias
	 * @param Con la clase ramdon obtiene una nota aleatoria del 0 al 10.
	 * @return deveulve una nota del 0 al 10 double.
	 */
	
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
