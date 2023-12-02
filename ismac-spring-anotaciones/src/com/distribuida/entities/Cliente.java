package com.distribuida.entities;

import java.util.Date;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;


@Component
public class Cliente {
	
	private int idCliente;
	private String cedula;
	private String nombre;
	private String apellido;
	private int edad;	
	private Date fechaNacimiento;
	private String telefono;
	private String direccion;
	private String correo;
	
	public Cliente() {}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("Se ejecutaran tareas despues de la construccion del Bean ");
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println("Se ejecutaran tareas antes de la destruccion del Bean ");
	}

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", Cedula=" + cedula + ", Nombre=" + nombre + ", Apellido="
				+ apellido + ", Edad=" + edad + ", FechaNacimiento=" + fechaNacimiento + ", Telefono=" + telefono
				+ ", Direccion=" + direccion + ", correo=" + correo + "]";
	}
	
		
	

}
