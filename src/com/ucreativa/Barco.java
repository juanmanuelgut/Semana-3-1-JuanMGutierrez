/**
 * 
 */
package com.ucreativa;

/**
 * @author juangutierrez
 *
 */
public class Barco {

	private Double distanciaPuerto;
	private Double velocidad;
	private String nombrebarco;
	private boolean estaMoviendose;
	private String banderaBarco;
	
	
	public Barco(Double distanciaPuerto, Double velocidad, String nombrebarco, boolean estaMoviendose,
			String banderaBarco) {
		super();
		this.distanciaPuerto = distanciaPuerto;
		this.velocidad = velocidad;
		this.nombrebarco = nombrebarco;
		this.estaMoviendose = estaMoviendose;
		this.banderaBarco = banderaBarco;
	}


	public Double getDistanciaPuerto() {
		return distanciaPuerto;
	}


	public void setDistanciaPuerto(Double distanciaPuerto) {
		this.distanciaPuerto = distanciaPuerto;
	}


	public Double getVelocidad() {
		return velocidad;
	}


	public void setVelocidad(Double velocidad) {
		this.velocidad = velocidad;
	}


	public String getNombrebarco() {
		return nombrebarco;
	}


	public void setNombrebarco(String nombrebarco) {
		this.nombrebarco = nombrebarco;
	}


	public boolean isEstaMoviendose() {
		return estaMoviendose;
	}


	public void setEstaMoviendose(boolean estaMoviendose) {
		this.estaMoviendose = estaMoviendose;
	}


	public String getBanderaBarco() {
		return banderaBarco;
	}


	public void setBanderaBarco(String banderaBarco) {
		this.banderaBarco = banderaBarco;
	}
	
	@Override
	//finalize method is called on object once
	//before garbage collecting it
	protected void finalize() throws Throwable{
		System.out.println("Garbage Collector called");
		System.out.println("Object garbage collected : " +this);
	}
	
	private void alejarsePuerto(int distancia) {
		
		//poner codigo aqui
		
	}
	
	private void acelerar() {
		
		//poner codigo aca
		
	}
	

}
