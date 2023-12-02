package com.distribuida.principal;

import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.entities.Cliente;
import com.distribuida.entities.DatosEmpresa;
import com.distribuida.entities.Factura;
import com.distribuida.entities.FacturaDetalle;
import com.distribuida.entities.Producto;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		
		
		Cliente cliente = context.getBean("cliente", Cliente.class);
		Producto producto = context.getBean("producto", Producto.class);
		Factura factura = context.getBean("factura", Factura.class);
		FacturaDetalle facturadetalle = context.getBean("facturaDetalle", FacturaDetalle.class);
		
		DatosEmpresa datosEmpresa = context.getBean("datosEmpresa", DatosEmpresa.class);
		
		
		cliente.setIdCliente(1);
		cliente.setCedula("1722905898");
		cliente.setNombre("Mateo");
		cliente.setApellido("Jaramillo");
		cliente.setEdad(20);
		cliente.setFechaNacimiento(new Date());
		cliente.setDireccion("Chillogallo");
		cliente.setTelefono("0987983845");
		cliente.setCorreo("MJ@hotmail.com");
		
		factura.setIdfactura(1);
		factura.setNumFactura("FAC-001");
		factura.setFecha(new Date());
		factura.setTotalNeto(30.20);
		factura.setIva(0.12);
		factura.setTotal(32.10);
		
		producto.setIdProducto(1);
		producto.setNombre("Shampoo");
		producto.setDescripcion("700 ml");
		producto.setPrecio(5.99);
		producto.setStock(80);
		
		facturadetalle.setIdFacturaDetalle(1);
		facturadetalle.setCantidad(5);
		facturadetalle.setFactura(factura);
		
		System.out.println(factura.toString());
		System.out.println(facturadetalle.toString());
		
		System.out.println(datosEmpresa.toString());
		
		
		context.close();

	}

}
