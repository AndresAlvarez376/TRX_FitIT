package controlador;

import java.util.Date;

public class Usuario extends Persona {

	public int codigoMembresia;
	public boolean miembroActivo;
	
	public Usuario(String nombre, String identificacion, String telefono, String direccion, String eMail,
			Date fechaNacimiento, int codigoMembresia, boolean miembroActivo) {
		super(nombre, identificacion, telefono, direccion, eMail, fechaNacimiento);
		this.codigoMembresia = codigoMembresia;
		this.miembroActivo = miembroActivo;
	}

	public int getCodigoMembresia() {
		return codigoMembresia;
	}

	public void setCodigoMembresia(int codigoMembresia) {
		this.codigoMembresia = codigoMembresia;
	}

	public boolean isMiembroActivo() {
		return miembroActivo;
	}

	public void setMiembroActivo(boolean miembroActivo) {
		this.miembroActivo = miembroActivo;
	}
	
	
}
