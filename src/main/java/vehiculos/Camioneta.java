package vehiculos;

public class Camioneta extends Vehiculo{
	private boolean volco;
	private static int TotalCreados;
	
	//constructores
    public Camioneta(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante, boolean volco) {
	//public Camioneta(String placa,int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante, boolean volco) {
		super( placa, puertas , 90 ,nombre,precio, peso,"4X4",fabricante);
		this.volco= volco;
		Camioneta.TotalCreados+=1;
	}
	
	
	//metodos gett

	public boolean isVolco() {
		return volco;
	}
	
	public static int getTotalCreados(){
		return TotalCreados;
	}
	
	//metodos sett

	public void setVolco(boolean volco) {
		this.volco = volco;
	}
	
	

}
