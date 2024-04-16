package paquete;

/**
 * <h1> Clase Asignatura</h1>
 * @version 0.01
 * @author aperbad@code.org
 * @since 04/2024
 */

public class Asignatura {
	
	/**
	 * Atributo identificador
	 */
	private int identificador;
	
	
	/**
	 * Atributo calificacion
	 */
	private double calificacion;
	
	
	
	/**
	 * Constructor 
	 * <b>Descripcion</b> : Crea el objeto Asignatura 
	 * @param identificador <i> Identificacion de la Asignatura</i>
	 * @param Calificacion <i> Calificacion de la Asignatura</i>
	 */
	
	public Asignatura(int identificador) {
		
		this.identificador = identificador;
		
	}



	/**
	 * <b>Descripcion</b> : IndentificadorGet
	 * <b>Parámetros</b>
	 * <ul>
	 * <li>@param :--
	 * </ul>
	 * <b>Estado</b> : Funcional
	 */
	public int getIdentificador() {
		return identificador;
	}


	/**
	 * <b>Descripcion</b> : CalificacionGet
	 * <b>Parámetros</b>
	 * <ul>
	 * <li>@param :--
	 * </ul>
	 * <b>Estado</b> : Funcional
	 */

	public double getCalificacion() {
		return calificacion;
	}


	/**
	 * <b>Descripcion</b> : CalificacionSet
	 * <b>Parámetros</b>
	 * <ul>
	 * <li>@param :--
	 * </ul>
	 * <b>Estado</b> : Funcional
	 */
	
	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}
	
	
	
}
