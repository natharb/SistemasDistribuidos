package web.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name = "USUARIO")
public class Usuario {	 
	 @Id
	 @SequenceGenerator(name="IDSEQ",sequenceName="IDSEQ",allocationSize = 1, initialValue = 1)
	 @GeneratedValue(strategy=GenerationType.AUTO,generator="IDSEQ")
	 @Column(name="ID")
	private int id;
	private String senha;
	private String nome;

	public Usuario() {
	}

	public Usuario(String nome, String senha) {
		this.nome= nome;
		this.senha = senha;
	}
	
	@Column(name = "nome")
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "senha")
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public int hashCode() {
		return getId();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Usuario) {
			Usuario user = (Usuario) obj;
			return user.getId() == id;
		}

		return false;
	}

}
