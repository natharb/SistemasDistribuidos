package web.project.controller.dao;

import java.util.List;

import web.project.model.Alocacao;


public class AlocacaoDAO extends GenericDAO<Alocacao>{

	private static final long serialVersionUID = 1L;
	
	
	
	public AlocacaoDAO(Class<Alocacao> entidade) {
		super(entidade);
	}

	public void createAlocacao(Alocacao alocacao){
		beginTransaction();
		save(alocacao);
		commitAndCloseTransaction();
	}
	
	public void updateAlocacao(Alocacao alocacao){
		beginTransaction();
		update(alocacao);
		commitAndCloseTransaction();
	}
	
	public void deleteAlocacao(Alocacao alocacao){
		beginTransaction();
		delete(alocacao.getId(), Alocacao.class);
		commitAndCloseTransaction();
	}
	
	public Alocacao searchAlocacao(Alocacao alocacao){
		beginTransaction();
		Alocacao alocacaoStoraged = find(Alocacao.class, alocacao.getId());
		closeTransaction();
		return alocacaoStoraged;	
	}
	
	public List<Alocacao> listAllAlocacao(){	
		beginTransaction();
		List<Alocacao> result = findAll();
		closeTransaction();
		return result;
		
	}
}
