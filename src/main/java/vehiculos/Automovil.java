package vehiculos;

public class Automovil extends Vehiculo{
	private int puestos;
	private static int TotalCreados;
	
	//contructores
    public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante,int puestos) {
		super( placa, 4 , 100 ,nombre,precio, peso, "FWD",fabricante);
		this.puestos=puestos;
		Automovil.TotalCreados+=1;
		
	}
	

	//metodo get
	
	public int getPuestos() {
		return puestos;
	}
	
	public static int getTotalCreados(){
		return TotalCreados;
	}
	
	//metodos sett

	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}
	
	
	

}
