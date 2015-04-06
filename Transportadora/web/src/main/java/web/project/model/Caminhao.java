package web.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;



@Entity
@Table(name="CAMINHAO")
public class Caminhao {
	
	@Id
	@SequenceGenerator(name="IDCAMINHAO",sequenceName="IDCAMINHAO",allocationSize = 1, initialValue = 1)
	@GeneratedValue(strategy=GenerationType.AUTO,generator="IDCAMINHAO")
	@Column(name="ID")
	private int id;
	private String placa;
	private String chassis;
	private String marca;
	private String modelo;
	
	public Caminhao(int id, String placa, String chassis, String marca,
			String modelo) {
		super();
		this.id = id;
		this.placa = placa;
		this.chassis = chassis;
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public Caminhao() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@Column(name="placa")
	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}
	@Column(name="chassis")
	public String getChassis() {
		return chassis;
	}

	public void setChassis(String chassis) {
		this.chassis = chassis;
	}
	@Column(name="marca")
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	@Column(name="modelo")
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	

}
