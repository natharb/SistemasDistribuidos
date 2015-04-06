package web.project.controller.dao;

import java.util.List;

import web.project.model.Motorista;

public class MotoristaDAO extends GenericDAO<Motorista> {

	private static final long serialVersionUID = 1L;

	public MotoristaDAO(){
		super(Motorista.class);
	}
	
	public void createMotorista(Motorista motorista){
		beginTransaction();
		save(motorista);
		commitAndCloseTransaction();
	}
	
	public void updateMotorista(Motorista motoristaStoraged){
		beginTransaction();
		update(motoristaStoraged);
		commitAndCloseTransaction();
	}
	
	public void deleteMotorista(Motorista motorista){
		beginTransaction();
		Motorista MotoristaStoraged = find(Motorista.class,motorista.getId());
		delete(MotoristaStoraged.getId(), Motorista.class);
		commitAndCloseTransaction();
	}
	
	public Motorista searchMotorista(Motorista motorista){
		beginTransaction();
		Motorista MotoristaStoragedID = find(Motorista.class,motorista.getId());
		closeTransaction();
		return MotoristaStoragedID;	
	}
	
	public List<Motorista> listAllMotorista(){
		beginTransaction();
		List<Motorista> result = findAll();
		closeTransaction();
		return result;
		
	}
}