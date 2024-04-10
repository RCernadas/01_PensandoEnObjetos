package com.raquel.liga.clases;

public class Jugador implements Comparable<Jugador> {

	private int identificador;
	private String nombre;
	private Equipo equipo;
	private int numGoles;

	public Jugador(int identificador, String nombre, Equipo equipo, int numGoles) {
		this.identificador = identificador;
		this.nombre = nombre;
		this.equipo = equipo;
		this.numGoles = numGoles;
	}

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Equipo getEquipo() {
		return equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

	public int getNumGoles() {
		return numGoles;
	}

	public void setNumGoles(int numGoles) {
		this.numGoles = numGoles;
	}

	@Override
	public int compareTo(Jugador j) {
		// TODO Auto-generated method stub
		return this.getNumGoles() - j.getNumGoles();
	}

	@Override
	public String toString() {
		return "Jugador: " + nombre + " | Número de goles: " + numGoles;
	}

}
