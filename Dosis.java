package com.mycompany.dipoo.velasquezjuliana;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Dosis {
	
	private String fecha;
	private Vacuna tipo;
	
	public Dosis(LocalDateTime fecha, Vacuna tipo) {
		super();
		DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy-hh:mm");
		this.fecha = fecha.format(formatoFecha);
		this.tipo = tipo;
	}
	
	public Dosis(Vacuna tipo) {
		super();
		LocalDateTime fecha = LocalDateTime.now();
		DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy-hh:mm");
		this.fecha = fecha.format(formatoFecha);
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "DosisPerro [fecha=" + fecha + ", tipo=" + tipo.nombre() + "]";
	}

	
}
