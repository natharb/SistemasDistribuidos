package web.project.controller.facade;

import java.util.List;

import web.project.controller.dao.AlocacaoDAO;
import web.project.model.Alocacao;

public class AlocacaoFacade {

	private AlocacaoDAO alocacaoDao = new AlocacaoDAO(Alocacao.class);
	
	public void createAlocacao(Alocacao alocacao){
		alocacaoDao.createAlocacao(alocacao);
	}
	
	public void updateAlocacao(Alocacao alocacao){
		alocacaoDao.updateAlocacao(alocacao);
	}
	
	public void deleteAlocacao(Alocacao alocacao){
		alocacaoDao.deleteAlocacao(alocacao);
		
	}
	
	public Alocacao searchAlocacao(Alocacao alocacao){
		return alocacaoDao.searchAlocacao(alocacao);
	}
	
	public List<Alocacao> listAll(){
		return alocacaoDao.listAllAlocacao();
		
	}
}
