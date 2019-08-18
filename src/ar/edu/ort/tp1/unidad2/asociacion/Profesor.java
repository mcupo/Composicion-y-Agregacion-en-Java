package ar.edu.ort.tp1.unidad2.asociacion;

public class Profesor {

	private String nombre;
	private String apellido;
	private String materia;
	
	public Profesor(String nombre, String apellido, String materia) {
		this.nombre 	= nombre;
		this.apellido 	= apellido;
		this.materia 	= materia;
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
		return materia;
	}
	
	public void setMateria(String materia) {
		this.materia = materia;
	}
}