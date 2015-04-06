package web.project.controller.dao;

import java.util.List;

import web.project.model.RegraUsuario;

public class RegraUsuarioDAO extends GenericDAO<RegraUsuario> {
	
	private static final long serialVersionUID = 1L;

	public RegraUsuarioDAO(){
		super(RegraUsuario.class);
	}
	
	public void createRegraUsuario(RegraUsuario regraUsuario){
		beginTransaction();
		save(regraUsuario);
		commitAndCloseTransaction();
	}
	
	public void updateRegraUsuario(RegraUsuario regraUsuarioStoraged){
		beginTransaction();
		update(regraUsuarioStoraged);
		commitAndCloseTransaction();
	}
	
	public void deleteRegraUsuario(RegraUsuario regraUsuario){
		beginTransaction();
		RegraUsuario regraUsuarioStoraged = find(RegraUsuario.class,regraUsuario.getRegra_id());
		delete(regraUsuarioStoraged.getRegra_id(), RegraUsuario.class);
		commitAndCloseTransaction();
	}
	
	public RegraUsuario searchRegraUsuario(RegraUsuario regraUsuario){
		beginTransaction();
		RegraUsuario regraUsuarioStoragedID = find(RegraUsuario.class,regraUsuario.getRegra_id());
		closeTransaction();
		return regraUsuarioStoragedID;	
	}
	
	public List<RegraUsuario> listAllRegraUsuario(){
		beginTransaction();
		List<RegraUsuario> result = findAll();
		closeTransaction();
		return result;
		
	}

}
