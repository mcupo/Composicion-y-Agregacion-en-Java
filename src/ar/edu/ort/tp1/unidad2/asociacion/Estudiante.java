package ar.edu.ort.tp1.unidad2.asociacion;

import java.util.ArrayList;

public class Estudiante {
	
	/*
	 * La clase Estudiante tiene una relación de asociación con la clase Profesor
	 */
	private ArrayList<Profesor> profesores;
	private String nombre;
	private String apellido;
	private String legajo;
	
	/*
	 * Como la relación es de asociación, el o los profesores no son requeridos para la creación
	 * de un objeto estudiante.
	 */
	public Estudiante(String nombre, String apellido, String legajo) {
		this.profesores = new ArrayList<Profesor>();
		this.nombre 	= nombre;
		this.apellido 	= apellido;
		this.legajo 	= legajo;
	}
	
	public void agregarProfesor(Profesor profesor){
		this.profesores.add(profesor);
	}
	
	public void eliminarProfesor(Profesor profesor){
		this.profesores.remove(profesor);
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String getMateria() {
		return legajo;
	}
	
	public void setMateria(String legajo) {
		this.legajo = legajo;
	}
}