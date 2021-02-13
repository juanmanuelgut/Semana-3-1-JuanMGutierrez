/**
 * 
 */
package com.ucreativa;

/**
 * @author juangutierrez
 *
 */
public class Avion {

	private Double alturaActual;
	private Double nivelCombustible;
	private String nombre;
	private int numeroPasajeros;
	private int numeroTripulantes;
	
	public Avion(Double alturaActual, Double nivelCombustible, String nombre, int numeroPasajeros,int numeroTripulantes) {
		this.alturaActual = alturaActual;
		this.nivelCombustible = nivelCombustible;
		this.nombre = nombre;
		this.numeroPasajeros = numeroPasajeros;
		this.numeroTripulantes = numeroTripulantes;
	}

	public Double getAlturaActual() {
		return alturaActual;
	}

	public void setAlturaActual(Double alturaActual) {
		this.alturaActual = alturaActual;
	}

	public Double getNivelCombustible() {
		return nivelCombustible;
	}

	public void setNivelCombustible(Double nivelCombustible) {
		this.nivelCombustible = nivelCombustible;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumeroPasajeros() {
		return numeroPasajeros;
	}

	public void setNumeroPasajeros(int numeroPasajeros) {
		this.numeroPasajeros = numeroPasajeros;
	}

	public int getNumeroTripulantes() {
		return numeroTripulantes;
	}

	public void setNumeroTripulantes(int numeroTripulantes) {
		this.numeroTripulantes = numeroTripulantes;
	}
	
	@Override
	//finalize method is called on object once
	//before garbage collecting it
	protected void finalize() throws Throwable{
		System.out.println("Garbage Collector called");
		System.out.println("Object garbage collected : " +this);
	}
	
	private void subir() {
		
		//put code here
		
	}
	private void bajar() {
		
		//put code here
		
	}
	

}
