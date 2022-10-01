package vehiculos;

public class Pais {
	private String nombre;
	
	//contructores 
	public Pais (String nombre){
		this.nombre= nombre;
	}
	
	public Pais() {
		
	}
	
	//metodos 
	
	public static Pais paisMasVendedor() {
	       Fabricante total = Fabricante.fabricaMayorVentas();
	       return total.getPais();
	    }

	//metodos Gett
	public String getNombre() {
		return nombre;
	}
	
	//metodos Sett

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

	
}
