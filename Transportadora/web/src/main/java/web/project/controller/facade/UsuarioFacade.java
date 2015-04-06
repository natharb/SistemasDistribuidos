package web.project.controller.facade;
import web.project.controller.dao.UsuarioDAO;

import java.util.List;
import web.project.model.Usuario;

public class UsuarioFacade {
	
	
	private UsuarioDAO usuarioDao = new UsuarioDAO(Usuario.class); 
	
	
	public void createUsuario(Usuario usuario){
		usuarioDao.createUsuario(usuario);
	}
	
	public void updateUsuario(Usuario usuario){
		usuarioDao.updateUsuario(usuario);
	}
	
	public void deleteUsuario(Usuario usuario){
		usuarioDao.deleteUsuario(usuario);
	}
	
	public Usuario searchUsuario(Usuario usuario){
		return usuarioDao.findUsuario(usuario);
			
	}
	
	public List<Usuario> listAll(){
		return usuarioDao.listaUsuarios();
		
	}
	
	public boolean logar(Usuario usuario){
		return usuarioDao.logar(usuario);
	}
	
	public static void main(String[] args) {
		Usuario user = new Usuario();
		UsuarioFacade userFacade = new UsuarioFacade();
		user.setId(14);
		user.setNome("nathalia");
		user.setSenha("21");
		userFacade.createUsuario(user);
		//Usuario storaged = userFacade.searchUsuario(user);
		
		//userFacade.deleteUsuario(storaged);
	}
	
}
