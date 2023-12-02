package com.distribuida.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FacturaDetalle {
	
	private int idFacturaDetalle;
	private int cantidad;
	private double subTotal;
	@Autowired
	private Factura factura;
	@Autowired Producto producto;
	
	
	
	public FacturaDetalle() {}


	public int getIdFacturaDetalle() {
		return idFacturaDetalle;
	}


	public void setIdFacturaDetalle(int idFacturaDetalle) {
		this.idFacturaDetalle = idFacturaDetalle;
	}


	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}


	public double getSubTotal() {
		return subTotal;
	}


	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}


	public Factura getFactura() {
		return factura;
	}

			//metodo inyector
	public void setFactura(Factura factura) {
		this.factura = factura;
	}


	


	@Override
	public String toString() {
		return "FacturaDetalle [idFacturaDetalle=" + idFacturaDetalle + ", cantidad=" + cantidad + ", subTotal="
				+ subTotal + ", factura=" + factura + ", producto="  + "]";
	}
	
	
	
	

}
