package web.project.controller.mb;

import java.io.Serializable;


import web.project.model.Motorista;

public class MotoristaMB implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Motorista motorista;

	public Motorista getMotorista() {
		return motorista;
	}

	public void setMotorista(Motorista motorista) {
		this.motorista = motorista;
	}
	
	

}
