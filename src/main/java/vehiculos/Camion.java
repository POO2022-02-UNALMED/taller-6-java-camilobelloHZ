package vehiculos;

public class Camion extends Vehiculo {
	private int ejes;
	private static int TotalCreados;
	
	public Camion(String placa,String nombre, int precio, int peso, Fabricante fabricante, int ejes) {
		super( placa, 2 , 80 ,nombre,precio, peso,"4X2",fabricante);
		this.ejes= ejes;
		Camion.TotalCreados+=1;
	}
	

	//metodos gett
	public int getEjes() {
		return ejes;
	}
	
	public static int getTotalCreados(){
		return TotalCreados;
	}
	
	//metodos sett

	public void setEjes(int ejes) {
		this.ejes = ejes;
	}
	
	
		
	
}
