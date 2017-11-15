package controlador;

import java.util.Date;

public class Sede {
	public String direccion;
	public Date horaApertura;
	public Date horaCierre;
	public float ingresos;
	public float gastos;
	public Sede(String direccion, Date horaApertura, Date horaCierre, float ingresos, float gastos) {
		super();
		this.direccion = direccion;
		this.horaApertura = horaApertura;
		this.horaCierre = horaCierre;
		this.ingresos = ingresos;
		this.gastos = gastos;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Date getHoraApertura() {
		return horaApertura;
	}
	public void setHoraApertura(Date horaApertura) {
		this.horaApertura = horaApertura;
	}
	public Date getHoraCierre() {
		return horaCierre;
	}
	public void setHoraCierre(Date horaCierre) {
		this.horaCierre = horaCierre;
	}
	public float getIngresos() {
		return ingresos;
	}
	public void setIngresos(float ingresos) {
		this.ingresos = ingresos;
	}
	public float getGastos() {
		return gastos;
	}
	public void setGastos(float gastos) {
		this.gastos = gastos;
	}
	
	
	
}
