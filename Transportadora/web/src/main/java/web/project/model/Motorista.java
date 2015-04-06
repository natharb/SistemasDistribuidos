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
@Table(name="MOTORISTA")
public class Motorista {
	
	@Id
	@SequenceGenerator(name="IDMOTORISTA",sequenceName="IDMOTORISTA",allocationSize = 1, initialValue = 1)
	@GeneratedValue(strategy=GenerationType.AUTO,generator="IDMOTORISTA")
	@Column(name="ID")
	private int id;
	private String nome;
	private String cpf;
	private Date dataDeNascimento;
	
	public Motorista(int id, String nome, String cpf, Date dataDeNascimento) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.dataDeNascimento = dataDeNascimento;
	}
	

	public Motorista() {
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@Column(name="nome")
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	@Column(name="cpf")
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	@Column(name="data_de_nascimento")
	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(Date dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
}
