package web.project.controller.facade;

import java.util.List;

import web.project.controller.dao.CaminhaoDAO;
import web.project.model.Caminhao;

public class CaminhaoFacade{

	private CaminhaoDAO caminhaoDao = new CaminhaoDAO(Caminhao.class); 
	
	public void createCaminhao(Caminhao caminhao){
		caminhaoDao.createCaminhaoDao(caminhao);
	}
	
	public void updateCaminhao(Caminhao caminhao){
		caminhaoDao.updateCaminhaoDao(caminhao);
	}
	
	public void deleteCaminhao(Caminhao caminhao){
		caminhaoDao.deleteCaminhaoDao(caminhao);
	}
	
	public Caminhao searchCaminhao(Caminhao caminhao){
		return caminhaoDao.searchCaminhaoDao(caminhao);
	}
	
	public List<Caminhao> listAllCaminhao(){
		return caminhaoDao.listAllCaminhaoDao();

		
	}
}
