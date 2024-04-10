package com.raquel.liga.clases;

import java.util.List;

public class Encuentro {

	private int identificador;
	private Equipo equipoLocal;
	private Equipo equipoVisitante;
	private int resultadoLocal;
	private int resultadoVisitante;

	public Encuentro(int identificador, Equipo equipoLocal, Equipo equipoVisitante, int resultadoLocal,
			int resultadoVisitante) {
		this.identificador = identificador;
		this.equipoLocal = equipoLocal;
		this.equipoVisitante = equipoVisitante;
		this.resultadoLocal = resultadoLocal;
		this.resultadoVisitante = resultadoVisitante;
	}

	public void ordenarListadeEncuentros(List<Encuentro> encuentros) {

	}

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public Equipo getEquipoLocal() {
		return equipoLocal;
	}

	public void setEquipoLocal(Equipo equipoLocal) {
		this.equipoLocal = equipoLocal;
	}

	public Equipo getEquipoVisitante() {
		return equipoVisitante;
	}

	public void setEquipoVisitante(Equipo equipoVisitante) {
		this.equipoVisitante = equipoVisitante;
	}

	public int getResultadoLocal() {
		return resultadoLocal;
	}

	public void setResultadoLocal(int resultadoLocal) {
		this.resultadoLocal = resultadoLocal;
	}

	public int getResultadoVisitante() {
		return resultadoVisitante;
	}

	public void setResultadoVisitante(int resultadoVisitante) {
		this.resultadoVisitante = resultadoVisitante;
	}

	@Override
	public String toString() {
		return "Encuentro " + identificador + ": " + equipoLocal.getNombre() + " " + resultadoLocal + " | "
				+ equipoVisitante.getNombre() + " " + resultadoVisitante + "\n";
	}
}
