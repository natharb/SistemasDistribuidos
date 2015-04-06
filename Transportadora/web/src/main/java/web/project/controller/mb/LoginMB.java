package web.project.controller.mb;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;

import org.hibernate.bytecode.buildtime.spi.ExecutionException;

import web.project.controller.facade.UsuarioFacade;
import web.project.model.Usuario;

@ManagedBean(name="loginMB", eager=true)
@RequestScoped
public class LoginMB {
	
	@Inject
	public Usuario novoUsuario;
	@Inject
	public UsuarioFacade usuarioFacade;
	
	public boolean logar() {
		try {
			usuarioFacade.updateUsuario(novoUsuario);
		} catch (Exception msg) {
			throw new ExecutionException(msg);
		}
		return usuarioFacade.logar(novoUsuario);
	}
}
 