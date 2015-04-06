package web.project.controller.mb;


import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import web.project.model.Usuario;

@ManagedBean
public class UsuarioMB{
	
	private Usuario user;
	
	public Usuario getUser() {
		return user;
	}

	public void setUser(Usuario user) {
		this.user = user;
	}
	
}
