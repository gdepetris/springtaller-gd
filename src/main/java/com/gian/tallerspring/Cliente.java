package com.gian.tallerspring;

import javax.persistence.*;

@Entity
@Table(name="cliente")
public class Cliente {

	
	private Long id;
	private String nombre;
	private String primer_apellido;
	private String segundo_apellido;
	private String fecha_nacimiento;
	private String dni;
	
	
	public Cliente(Long id, String nombre, String primer_apellido, String segundo_apellido, String fecha_nacimiento,
			String dni) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.primer_apellido = primer_apellido;
		this.segundo_apellido = segundo_apellido;
		this.fecha_nacimiento = fecha_nacimiento;
		this.dni = dni;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name="Nombre")
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Column(name="Primer_apellido")
	public String getPrimer_apellido() {
		return primer_apellido;
	}
	public void setPrimer_apellido(String primer_apellido) {
		this.primer_apellido = primer_apellido;
	}
	
	@Column(name="Segundo_apellido")
	public String getSegundo_apellido() {
		return segundo_apellido;
	}
	public void setSegundo_apellido(String segundo_apellido) {
		this.segundo_apellido = segundo_apellido;
	}
	
	@Column(name="Fecha_nacimiento")
	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	
	@Column(name="Dni")
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	
	
}
