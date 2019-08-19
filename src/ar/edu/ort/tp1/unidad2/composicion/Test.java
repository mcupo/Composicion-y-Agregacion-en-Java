package ar.edu.ort.tp1.unidad2.composicion;

public class Test {

	public static void main(String[] args){
		/*
		 * Como la relación es de composición, no puedo crear un Automovil sin Motor,
		 * el motor depende del Automovil y este es su dueño.
		 * A partir de la creación del Automovil, existe una asociación fuerte.
		 * Tal es así que el objeto compuesto depende del componente para funcionar.
		 * Un Automovil sin motor, deja de ser un Automovil.
		 * Un motor solo puede estar asociado a un Automovil.
		 */
		Automovil ford = new Automovil(4,555555);

		/*
		 * Para acceder a la interfaz del Motor, como es un atributo privado, debo hacerlo
		 * mediante los métodos públicos del auto, que pueden invocar a los métodos del Motor.
		 */
		System.out.println(ford.getNroMotor());
	}
}