package controlador;

import java.util.Date;

public class Instructor extends Persona{
 public float salarioPorHora;
 public String numeroCuenta;
public Instructor(String nombre, String identificacion, String telefono, String direccion, String eMail,
		Date fechaNacimiento, float salarioPorHora, String numeroCuenta) {
	super(nombre, identificacion, telefono, direccion, eMail, fechaNacimiento);
	this.salarioPorHora = salarioPorHora;
	this.numeroCuenta = numeroCuenta;
}
public float getSalarioPorHora() {
	return salarioPorHora;
}
public void setSalarioPorHora(float salarioPorHora) {
	this.salarioPorHora = salarioPorHora;
}
public String getNumeroCuenta() {
	return numeroCuenta;
}
public void setNumeroCuenta(String numeroCuenta) {
	this.numeroCuenta = numeroCuenta;
}
 
 
}
