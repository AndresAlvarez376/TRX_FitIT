package controlador;

public class Empresa {
	String nombre;
	String numeroCuenta;
	public Empresa(String nombre, String numeroCuenta) {
		super();
		this.nombre = nombre;
		this.numeroCuenta = numeroCuenta;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
}
	
