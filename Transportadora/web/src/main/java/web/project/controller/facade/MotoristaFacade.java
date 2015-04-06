package web.project.controller.facade;

import java.util.List;

import web.project.controller.dao.MotoristaDAO;
import web.project.model.Motorista;

public class MotoristaFacade{

	private MotoristaDAO motoristaDao = new MotoristaDAO(); 
	
	public void createMotorista(Motorista motorista){
		motoristaDao.createMotorista(motorista);
	}
	
	public void updateMotorista(Motorista motorista){
		motoristaDao.updateMotorista(motorista);
	}
	
	public void deleteMotorista(Motorista motorista){
		motoristaDao.deleteMotorista(motorista);
	}
	
	public Motorista searchMotorista(Motorista motorista){
		return motoristaDao.searchMotorista(motorista);
	}
	
	public List<Motorista> listAllMotorista(){
		return motoristaDao.listAllMotorista();
		
	}
}
