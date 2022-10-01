package vehiculos;

public class Vehiculo {
	protected String placa;
	protected int puertas;
	protected int velocidadMaxima;
	protected String nombre;
	protected int precio;
	protected int peso;
	protected String traccion;
	protected Fabricante fabricante;
	private static int CantidadVehiculos= 0;
	
	//contructores 
	
	public Vehiculo(String placa,int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante){
		this.placa= placa;
		this.puertas= puertas;
		this.velocidadMaxima= velocidadMaxima;
		this.nombre= nombre;
		this.precio= precio;
		this.precio= precio;
		this.peso= peso;
		this.traccion= traccion;
		this.fabricante= fabricante;
		fabricante.setVentas(fabricante.getVentas()+1);
		CantidadVehiculos+=1;
		
	}
	
	/*public Vehiculo() {
		
	}*/
	
	//metodos gett

	public String getPlaca() {
		return placa;
	}

	public int getPuertas() {
		return puertas;
	}

	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public String getNombre() {
		return nombre;
	}

	public int getPrecio() {
		return precio;
	}
	public int getPeso() {
		return peso;
	}

	public String getTraccion() {
		return traccion;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public static int getCantidadVehiculos() {
		return CantidadVehiculos;
	}
	
	// metodos sett
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	
	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}
	
	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	
	public static void setCantidadVehiculos(int cantidadVehiculos) {
		CantidadVehiculos = cantidadVehiculos;
	}
	
	//metodos pedidos 
	
	public static String vehiculosPorTipo() {
		return "Automoviles: "+ Automovil.getTotalCreados()+
				"\nCamionetas: "+ Camioneta.getTotalCreados()+
				"\nCamiones: " + Camion.getTotalCreados();
	}
	
	
	
	
}


	
