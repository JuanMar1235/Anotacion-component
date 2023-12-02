package com.distribuida.entities;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Factura {
	
	private int idfactura;
	private String numFactura;
	private Date fecha;
	private double totalNeto;
	private double iva;
	private double total;
	@Autowired
	private Cliente cliente;
	
	
	public Factura(Cliente cliente) {
		this.cliente=cliente;
	}
	public Factura() {
		
		
	}
	public int getIdfactura() {
		return idfactura;
	}

	public void setIdfactura(int idfactura) {
		this.idfactura = idfactura;
	}

	public String getNumFactura() {
		return numFactura;
	}

	public void setNumFactura(String numFactura) {
		this.numFactura = numFactura;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public double getTotalNeto() {
		return totalNeto;
	}

	public void setTotalNeto(double totalNeto) {
		this.totalNeto = totalNeto;
	}

	public double getIva() {
		return iva;
	}

	public void setIva(double iva) {
		this.iva = iva;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Cliente getCliente() {
		return cliente;
	}
			//Metodo inyector
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Factura [idfactura=" + idfactura + ", numFactura=" + numFactura + ", fecha=" + fecha + ", totalNeto="
				+ totalNeto + ", iva=" + iva + ", total=" + total + ", cliente=" + cliente  + "]";
	}


	
	
	
	
	
	
	
}
