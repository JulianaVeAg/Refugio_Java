package com.mycompany.dipoo.velasquezjuliana;


public enum VacunaPerro implements Vacuna {
	
	MOQUILLO("Moquillo canino", true, 36),
	PARVOVIRUS("Parvovirus canino", true, 36),
	RABIA("Rabia", true, 12),
	ADENOVIRUS("Adenovirus", true, 36),
	CORONAVIRUS("Coronavirus", false, 0);
	
	private String nombre;
	private boolean esEsencial;
	private int revacunacion;
	
	private VacunaPerro(String nombre, boolean esEsencial, int revacunacion) {
		this.nombre = nombre;
		this.esEsencial = esEsencial;
		this.revacunacion = revacunacion;
	}

	@Override
	public String nombre() {
		return this.nombre;
	}

	@Override
	public boolean esEsencial() {
		return this.esEsencial;
	}
}
