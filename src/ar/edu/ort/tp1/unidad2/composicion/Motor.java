package ar.edu.ort.tp1.unidad2.composicion;

public class Motor {
	
	private int nroMotor;
	
	public Motor(){
		nroMotor = 0;
	}
	
	public void setNroMotor(int nroMotor){ 
		this.nroMotor=nroMotor;
	}  
	
	public int getNroMotor(){ 
		return nroMotor;
	}
}