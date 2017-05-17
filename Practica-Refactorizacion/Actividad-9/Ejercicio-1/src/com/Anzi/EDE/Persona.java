package com.Anzi.EDE;

public class Persona {

	protected String numeroDeTelefono;
	
	public Persona(String numeroDetelefono){
		super();
		this.numeroDeTelefono = numeroDeTelefono;
	}
	
	public String getNumeroDeTelefono(){
		return numeroDeTelefono;
	}
	
	public void setNumeroDeTelefono(String numeroDeTelefono){
		this.numeroDeTelefono= numeroDeTelefono;
		
	}
}
