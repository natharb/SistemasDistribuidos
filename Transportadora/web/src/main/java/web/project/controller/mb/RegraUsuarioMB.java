package web.project.controller.mb;

import java.io.Serializable;

import web.project.model.RegraUsuario;

public class RegraUsuarioMB implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private RegraUsuario regra;

	public RegraUsuario getRegra() {
		return regra;
	}

	public void setRegra(RegraUsuario regra) {
		this.regra = regra;
	}
	
	
}
