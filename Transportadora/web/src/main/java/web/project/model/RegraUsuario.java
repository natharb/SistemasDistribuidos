package web.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="REGRA_USUARIO")
public class RegraUsuario {
	
	private String nome_usuario;
	private String regra_acesso;
	@Id
	@SequenceGenerator(name="IDREGRA",sequenceName="IDREGRA",allocationSize = 1, initialValue = 1)
	@GeneratedValue(strategy=GenerationType.AUTO,generator="IDREGRA")
	@Column(name="REGRA_ID")
	private int regra_id;
	
	public RegraUsuario(String nome_usuario, String regra_acesso) {
		super();
		this.nome_usuario = nome_usuario;
		this.regra_acesso = regra_acesso;
	}
	
	

	public RegraUsuario() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int getRegra_id() {
		return regra_id;
	}
	public void setRegra_id(int regra_id) {
		this.regra_id = regra_id;
	}
	@Column(name="nome_usuario")
	public String getNome_usuario() {
		return nome_usuario;
	}
	public void setNome_usuario(String nome_usuario) {
		this.nome_usuario = nome_usuario;
	}
	@Column(name="regra_acesso")
	public String getRegra_acesso() {
		return regra_acesso;
	}
	public void setRegra_acesso(String regra_acesso) {
		this.regra_acesso = regra_acesso;
	}
}
