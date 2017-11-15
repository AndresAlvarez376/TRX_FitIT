package controlador;

import java.util.Date;

public class Clase {
	public int codigoClase;
	public Date horario;
	public int capacidad;
	public boolean deReserva;
	public Clase(int codigoClase, Date horario, int capacidad, boolean deReserva) {
		super();
		this.codigoClase = codigoClase;
		this.horario = horario;
		this.capacidad = capacidad;
		this.deReserva = deReserva;
	}
	public int getCodigoClase() {
		return codigoClase;
	}
	public void setCodigoClase(int codigoClase) {
		this.codigoClase = codigoClase;
	}
	public Date getHorario() {
		return horario;
	}
	public void setHorario(Date horario) {
		this.horario = horario;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	public boolean isDeReserva() {
		return deReserva;
	}
	public void setDeReserva(boolean deReserva) {
		this.deReserva = deReserva;
	}
	
	
	
}
