package web.project.controller.facade;

import java.util.List;

import web.project.controller.dao.RegraUsuarioDAO;
import web.project.model.RegraUsuario;

public class RegraUsuarioFacade {

	private RegraUsuarioDAO regraUsuarioDao = new RegraUsuarioDAO(); 
	
	public void createRegraUsuario(RegraUsuario regraUsuario){
		regraUsuarioDao.createRegraUsuario(regraUsuario);
	}
	
	public void updateRegraUsuario(RegraUsuario regraUsuario){
		regraUsuarioDao.updateRegraUsuario(regraUsuario);
	}
	
	public void deleteRegraUsuario(RegraUsuario regraUsuario){
		regraUsuarioDao.deleteRegraUsuario(regraUsuario);
	}
	
	public RegraUsuario searchRegraUsuario(RegraUsuario regraUsuario){
		return regraUsuarioDao.searchRegraUsuario(regraUsuario);
	}
	
	public List<RegraUsuario> listAll(){
		return regraUsuarioDao.listAllRegraUsuario();
	}
}
