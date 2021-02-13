/**
 * 
 */
package com.ucreativa;

/**
 * @author juangutierrez
 *
 */
public class Main {

	/**
	 * 
	 */
	public Main() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Bicicleta shimano = new Bicicleta("Juan", 1, 25.5,true);
		Barco calipso = new Barco(22.5,60.0,"Calipso",true,"Costa Rica");
		Avion cesna = new Avion(10000.00, 100.00,"Halcon Milenario",5,1);
		
		shimano = null;
		System.gc();
		
		calipso = null;
		System.gc();
		
		cesna = null;
		Runtime.getRuntime().gc();


	}

}
