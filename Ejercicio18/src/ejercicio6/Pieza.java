package ejercicio6;

public class Pieza {
	private int codigo;
	private static int counter = 0;
	private String nombre;
	
	
	public Pieza(String nombre) {
		counter++;
		this.codigo = counter;
		this.nombre = nombre;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
