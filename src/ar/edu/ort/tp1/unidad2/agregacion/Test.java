package ar.edu.ort.tp1.unidad2.agregacion;

public class Test {

	public static void main(String[] args) {
		/*
		 * Como la relación es de agregación, puedo crear ambos objetos de manera separada,
		 * ninguno depende del otro para su creación. Pero a diferencia de la asociación,
		 * existe un dueño temporal, en este caso el Auto.
		 */
		Pasajero jose = new Pasajero("Jose", "Perez");
		Auto fordFiesta = new Auto("Ford", "Fiesta");

		/*
		 * Jose se sube al Auto fordFiesta.
		 * A partir de este momento, Jose tiene una agregación con el Auto.
		 * Mientras dure esta relación, el Auto es dueño de Jose. Es una relación más fuerte que la asociación.
		 * Si bien en este caso no sería posible, la agregación permite que muchos objetos compartan la misma 
		 * relación. Por ejemplo una misma mascota puede tener varios Dueños.
		 */
		fordFiesta.agregarPasajero(jose);
		fordFiesta.saludarPasajeros();
		
		/*
		 * Jose se baja del Auto.
		 * A partir de este momento, Jose deja de tener una relación de agregación con el Auto.
		 * El auto ya no es más "Dueño" de Jose.
		 */
		fordFiesta.eliminarPasajero(jose);
	}
}