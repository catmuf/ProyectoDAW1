package com.Anzi.EDE;

import java.util.*;

public class Profesor extends Persona{

	String str;
	int edad;
	String numeroDeTelefono;
	List <Prestamo> prestamo;
	
	public Profesor(String numeroDetelefono) {
		
		super(numeroDetelefono);
	}
	
	public void printInformacionPersonal() {
		System.out.println("Nombre: "+ str);
		System.out.println("Nombre: "+ edad);
		System.out.println("Nombre: "+ numeroDeTelefono);
	}
	
	public void printTodaLaInformacion() {
		System.out.println("Nombre: "+ str);
		System.out.println("Nombre: "+ edad);
		System.out.println("Nombre: "+ this.numeroDeTelefono);
		
		for (Prestamo p: prestamo) {
			System.out.println(p);
		}
	}
	
}
