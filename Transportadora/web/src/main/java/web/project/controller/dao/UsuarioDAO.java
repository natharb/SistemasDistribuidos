package web.project.controller.dao;

import java.util.List;

import web.project.model.Usuario;

public class UsuarioDAO extends GenericDAO<Usuario>{
	
	
	private static final long serialVersionUID = 1L;
			

	public UsuarioDAO(Class<Usuario> entidade) {
		super(entidade);
	}

	public void createUsuario(Usuario usuario){
		beginTransaction();
		save(usuario);
		commitAndCloseTransaction();		
	}
	
	public void updateUsuario(Usuario usuario){
		beginTransaction();
		update(usuario);
		commitAndCloseTransaction();
	}
			
	public void deleteUsuario(Usuario usuario){
		beginTransaction();
		Usuario user = find(Usuario.class, usuario.getId());
		delete(user.getId(), Usuario.class);
		commitAndCloseTransaction();
	}
	
	public List<Usuario> listaUsuarios(){
		beginTransaction();
		List<Usuario> listaUsuarios = findAll();
		closeTransaction();
		return listaUsuarios;		
	}

	public Usuario findUsuario(Usuario usuario){
		beginTransaction();
		Usuario usuarioInstance = find(Usuario.class, usuario.getId());
		closeTransaction();
		return usuarioInstance;
	}
	
	public boolean logar(Usuario usuario){
		Usuario user = find(Usuario.class, usuario.getId());
		if(user == null){
			return false;
		} else {
			return true;
		}
	}
}
