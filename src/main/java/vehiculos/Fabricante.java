package vehiculos;
//import vehiculos.Vehiculo;
import java.util.*;


public class Fabricante {
	private String nombre;
	private Pais pais;
	private int  ventas;
	private static ArrayList<Fabricante> lista = new ArrayList<>();

	//contructores 
	
	public Fabricante(String nombre, Pais pais) {
		this.nombre= nombre;
		this.pais= pais;
		lista.add(this);
	}
	
	public Fabricante() {
		lista.add(this);
		
	}

	//metodos gett
	public String getNombre() {
		return nombre;
	}

	public Pais getPais() {
		return pais;
	}
	
	public int getVentas() {
	        return ventas;
	    }
	public static ArrayList<Fabricante> getLista() {
	        return lista;
	    }
	
	//metodos sett
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	public void setVentas(int ventas) {
        this.ventas = ventas;
    }
	

	//metodos pedidos
	
	public static Fabricante fabricaMayorVentas() {
        Fabricante total = lista.get(0);
        for (Fabricante e : lista) {
            if (e.getVentas() > total.getVentas()) {
		total = e;
            }
        }
        return total;
	}
	


}


