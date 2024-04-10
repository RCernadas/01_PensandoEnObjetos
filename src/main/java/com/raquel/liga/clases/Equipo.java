package com.raquel.liga.clases;

public class Equipo implements Comparable<Equipo> {

	private String nombre;
	private int partidosGanados;

	public Equipo(String nombre, int partidosGanados) {
		this.nombre = nombre;
		this.partidosGanados = partidosGanados;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPartidosGanados() {
		return partidosGanados;
	}

	public void setPartidosGanados(int partidosGanados) {
		this.partidosGanados = partidosGanados;
	}

	@Override
	public int compareTo(Equipo e) {
		// TODO Auto-generated method stub
		return this.getPartidosGanados() - e.getPartidosGanados();
	}

	@Override
	public String toString() {
		return "Equipo: " + nombre + "| Número de partidos ganados: " + partidosGanados;
	}
}
