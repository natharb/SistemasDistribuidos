package web.project.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="ALOCACOES")
public class Alocacao {
	
	@Id
	@SequenceGenerator(name="IDALOCACAO",sequenceName="IDALOCACAO",allocationSize = 1, initialValue = 1)
	@GeneratedValue(strategy=GenerationType.AUTO,generator="IDALOCACAO")
	@Column(name="ID")
	private int id;
	private int id_caminhao;
	private int id_carga;
	private int id_motorista;
	private Date data_carregamento;
	private Date data_descarregamento;
	private String status;
	
	public Alocacao(int id, int id_caminhao, int id_carga, int id_motorista,
			Date data_carregamento, Date data_descarregamento, String status) {
		super();
		this.id = id;
		this.id_caminhao = id_caminhao;
		this.id_carga = id_carga;
		this.id_motorista = id_motorista;
		this.data_carregamento = data_carregamento;
		this.data_descarregamento = data_descarregamento;
		this.status = status;
	}
	
	
	public Alocacao() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name = "id_caminhao")
	public int getId_caminhao() {
		return id_caminhao;
	}
	
	
	public void setId_caminhao(int id_caminhao) {
		this.id_caminhao = id_caminhao;
	}
	
	@Column(name = "id_carga")
	public int getId_carga() {
		return id_carga;
	}
	
	public void setId_carga(int id_carga) {
		this.id_carga = id_carga;
	}
	
	@Column(name = "id_motorista")
	public int getId_motorista() {
		return id_motorista;
	}
	
	public void setId_motorista(int id_motorista) {
		this.id_motorista = id_motorista;
	}
	
	@Column(name = "data_carregamento")
	public Date getData_carregamento() {
		return data_carregamento;
	}
	
	public void setData_carregamento(Date data_carregamento) {
		this.data_carregamento = data_carregamento;
	}
	
	@Column(name = "data_descarregamento")
	public Date getData_descarregamento() {
		return data_descarregamento;
	}
	public void setData_descarregamento(Date data_descarregamento) {
		this.data_descarregamento = data_descarregamento;
	}
	
	@Column(name = "status")
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
