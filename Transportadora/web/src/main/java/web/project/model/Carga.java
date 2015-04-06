package web.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name="CARGA")
public class Carga {
	@Id
	@SequenceGenerator(name="IDCARGA",sequenceName="IDCARGA",allocationSize = 1, initialValue = 1)
	@GeneratedValue(strategy=GenerationType.AUTO,generator="IDCARGA")
	@Column(name="ID")
	private int id;
	private float peso;
	private String nome;
	private String tipo;
	private int quantidade;
	private String origem;
	private String destino;
	
	public Carga(int id, float peso, String nome, String tipo, int quantidade,String origem,
			String destino) {
		super();
		this.id = id;
		this.peso = peso;
		this.nome = nome;
		this.tipo = tipo;
		this.quantidade = quantidade;
		this.origem = origem;
		this.destino = destino;
	}
	

	public Carga() {
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@Column(name="peso")
	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}
	@Column(name="nome")
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	@Column(name="tipo")
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	@Column(name="quantidade")
	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	@Column(name="origem")
	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}
	@Column(name="destino")
	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	
}
