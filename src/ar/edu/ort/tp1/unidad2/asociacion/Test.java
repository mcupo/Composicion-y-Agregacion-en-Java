package ar.edu.ort.tp1.unidad2.asociacion;

public class Test {

	public static void main(String[] args) {
		/*
		 * Como la relación es de asociación, puedo crear ambos objetos de manera separada,
		 * ninguno depende del otro para su creación. Tampoco existe un dueño.
		 */
		Profesor profesorMatematica = new Profesor("Juan", "Perez", "Matematica");
		Estudiante pedro = new Estudiante("Pedro", "Garcia", "A132");

		/*
		 * Pedro comienza a cursar matemática con el profesor Juan.
		 * A partir de este momento, pedro tiene una relación de asociación con Juan.
		 * Pero ni Juan es dueño de Pedro, ni Pedro es dueño de Juan. Es una relación débil.
		 * Además la asociación permite que muchos objetos compartan la misma relación.
		 * El profesor de mátematica va a estar relacionado con muchos estudiantes.
		 */
		pedro.agregarProfesor(profesorMatematica);
		
		/*
		 * Pedro abandona la cursada de matemática con el profesor Juan.
		 * A partir de este momento, pedro deja de tener una relación de asociación con Juan.
		 */
		pedro.eliminarProfesor(profesorMatematica);
	}
}