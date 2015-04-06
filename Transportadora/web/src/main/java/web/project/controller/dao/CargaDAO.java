package web.project.controller.dao;

import java.util.List;

import web.project.model.Carga;

public class CargaDAO extends GenericDAO<Carga>{

	private static final long serialVersionUID = 1L;

	//Recebe o objeto caminhao criado no Model.
	public CargaDAO(){
		super(Carga.class);
	}

	public void createCarga(Carga carga){
		beginTransaction();
		save(carga);
		commitAndCloseTransaction();
	}
	
	public void updateCarga(Carga carga){
		beginTransaction();
		update(carga);
		commitAndCloseTransaction();
	}
	
	public void deleteCarga(Carga carga){
		beginTransaction();
		Carga cargaStoraged = find(Carga.class,carga.getId());
		delete(cargaStoraged.getId(), Carga.class);
		commitAndCloseTransaction();
	}
	
	public Carga searchCarga(Carga carga){
		beginTransaction();
		Carga cargaStoragedID = find(Carga.class,carga.getId());
		closeTransaction();
		return cargaStoragedID;	
	}
	
	public List<Carga> listAllCarga(){
		beginTransaction();
		List<Carga> result = findAll();
		closeTransaction();
		return result;
		
	}
}
