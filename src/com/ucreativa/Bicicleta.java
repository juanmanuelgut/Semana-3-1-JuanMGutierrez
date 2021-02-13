/**
 * 
 */
package com.ucreativa;

/**
 * @author juangutierrez
 *
 */
public class Bicicleta {

	private String nombreDueno;
	private int marchaActual;
	private Double velocidad;
	private boolean estaMoviendose;
	
	
	public Bicicleta(String nombreDueno, int cambioActual, Double velocidad, boolean estaMoviendose) {
		this.nombreDueno = nombreDueno;
		this.marchaActual = cambioActual;
		this.velocidad = velocidad;
		this.estaMoviendose = estaMoviendose;
	}


	public String getNombreDueno() {
		return nombreDueno;
	}


	public void setNombreDueno(String nombreDueno) {
		this.nombreDueno = nombreDueno;
	}


	public int getCambioActual() {
		return marchaActual;
	}


	public void setCambioActual(int cambioActual) {
		this.marchaActual = cambioActual;
	}


	public Double getVelocidad() {
		return velocidad;
	}


	public void setVelocidad(Double velocidad) {
		this.velocidad = velocidad;
	}


	public boolean isEstaMoviendose() {
		return estaMoviendose;
	}


	public void setEstaMoviendose(boolean estaMoviendose) {
		this.estaMoviendose = estaMoviendose;
	}
	
	
	@Override
	//finalize method is called on object once
	//before garbage collecting it
	protected void finalize() throws Throwable{
		System.out.println("Garbage Collector called");
		System.out.println("Object garbage collected : " +this);
	}
	
	public void acelerar() {
		
		//Ponga codigo aca
		
	}
	
	public void hacerCambioMarcha() {
		
		//poner codigo aca
		
	}
	
}
