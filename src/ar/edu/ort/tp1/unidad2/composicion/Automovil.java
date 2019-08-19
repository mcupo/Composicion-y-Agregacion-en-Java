package ar.edu.ort.tp1.unidad2.composicion;

public class Automovil {
	
	//La clase Automovil tiene una relación de composicion con la clase Motor
	private Motor m;
	private int cantRuedas;
	
	/*
	 * Como la relación es de composición, el Motor es requeridos para la creación
	 * de un objeto Automovil.
	 * Por lo tanto si no recibe por parámetro los datos del motor, le asigna un motor por defecto.
	 */
	public Automovil(){
		m = new Motor();
		cantRuedas = 0;
	}  
	
	public Automovil(int cantRuedas, int nroMotor){
		m = new Motor();
		this.cantRuedas = cantRuedas;
		m.setNroMotor(nroMotor); 
	}
	
	//Debo acceder a la interfaz del Motor a través de sus métodos publicos
	public int getNroMotor(){ 
		return m.getNroMotor();
	}
	
	void setAutomovil(int cantRuedas, int nroMotor){
		this.cantRuedas = cantRuedas;
		m.setNroMotor(nroMotor);
	}

	public int getCantRuedas() {
		return cantRuedas;
	}

	public void setCantRuedas(int cantRuedas) {
		this.cantRuedas = cantRuedas;
	}
}