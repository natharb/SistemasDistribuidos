package web.project.controller.facade;

import java.util.List;

import web.project.controller.dao.CargaDAO;
import web.project.model.Carga;

public class CargaFacade {
	
	private CargaDAO cargaDao = new CargaDAO(); 
	
	public void createCarga(Carga carga){
		cargaDao.createCarga(carga);
	}
	
	public void updateCarga(Carga carga){
		cargaDao.updateCarga(carga);
	}
	
	public void deleteCarga(Carga carga){
		cargaDao.deleteCarga(carga);
	}
	
	public Carga searchCarga(Carga carga){
		return cargaDao.searchCarga(carga);	
	}
	
	public List<Carga> listAllCarga(){
		return cargaDao.listAllCarga();
	}

}
