package ar.edu.ort.tp1.unidad2.agregacion;

import java.util.ArrayList;

public class Auto {
	
	private String marca;
	private String modelo;
	//La clase Auto tiene una relación de agregación con la clase Pasajero
	private ArrayList<Pasajero> pasajeros;
	
	/*
	 * Como la relación es de agregación, el o los pasajeros no son requeridos para la creación
	 * de un objeto Auto.
	 */
	public Auto(String marca, String modelo) {
		this.pasajeros = new ArrayList<Pasajero>();
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public void saludarPasajeros(){
		for(int i = 0; i < pasajeros.size(); i++)
			System.out.println("Bienvenido a bordo " + pasajeros.get(i).getNombre());
	}
	
	public void agregarPasajero(Pasajero pasajero){
		this.pasajeros.add(pasajero);
	}
	
	public void eliminarPasajero(Pasajero pasajero){
		this.pasajeros.remove(pasajero);
	}

	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
}