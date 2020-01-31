/**
 * 
 */
package com.jesusfc.test.business.model.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author jesus.fernandez
 *
 */

@Entity
@Table(name = "USERS")
public class User {

	private Integer id;
	private String nombre;
	private String apellido;
	private Integer edad;
	private Boolean soltero;
	private String dni;
	private String telefono;
	private String email;

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "NOMBRE")
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "APELLIDO")
	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	@Column(name = "EDAD")
	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	@Column(name = "SOLTERO")
	public Boolean getSoltero() {
		return soltero;
	}

	public void setSoltero(Boolean soltero) {
		this.soltero = soltero;
	}

	@Column(name = "DNI")
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	@Column(name = "TELEFONO")
	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Column(name = "EMAIL")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", " + "nombre=" + nombre + ", " + "apellido=" + apellido + ", " + "edad=" + edad
				+ ", " + "soltero=" + getSoltero() + ", " + "dni" + dni + ", " + "telefono=" + telefono + ", "
				+ "email=" + email + "]";
	}

}
