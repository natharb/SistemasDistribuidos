package web.project.controller.dao;

import java.util.List;

import web.project.model.Caminhao;

public class CaminhaoDAO extends GenericDAO<Caminhao>{
	
	private static final long serialVersionUID = 1L;
	
	public CaminhaoDAO(Class<Caminhao> entidade) {
		super(entidade);
	}

	public void createCaminhaoDao(Caminhao caminhao){
		beginTransaction();
		save(caminhao);
		commitAndCloseTransaction();
	}

	public void updateCaminhaoDao(Caminhao caminhao){
		beginTransaction();
		update(caminhao);
		commitAndCloseTransaction();
	}
	
	public void deleteCaminhaoDao(Caminhao caminhao){
		beginTransaction();
		Caminhao caminhaoStoraged = find(Caminhao.class,caminhao.getId());
		delete(caminhaoStoraged.getId(), Caminhao.class);
		commitAndCloseTransaction();
	}
	
	public Caminhao searchCaminhaoDao(Caminhao caminhao){
		beginTransaction();
		Caminhao caminhaoStoraged = find(Caminhao.class,caminhao.getId());
		closeTransaction();
		return caminhaoStoraged;	
	}
	
	public List<Caminhao> listAllCaminhaoDao(){
		beginTransaction();
		List<Caminhao> result = findAll();
		closeTransaction();
		return result;
		
	}
	
}