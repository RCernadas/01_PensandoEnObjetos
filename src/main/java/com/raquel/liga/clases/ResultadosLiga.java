package com.raquel.liga.clases;

import java.util.Collections;
import java.util.List;

public class ResultadosLiga {

	/**
	 * Este método imprime por consola una lista de equipos ordenada por el número
	 * de partidos ganados
	 * 
	 * @param equipos
	 */
	public static void ListaDeEquiposOrdenadaPorPartidosGanados(List<Equipo> equipos) {
		Collections.sort(equipos);
		for (Equipo equipo : equipos) {
			System.out.println(equipo.toString());
		}
	}

	/**
	 * Este método impime por consola una lista de jugadores del equipo pasado por
	 * parámetro ordenados por el número de goles marcados
	 * 
	 * @param jugadores
	 * @param equipo
	 */
	public static void ListaJugadoresOrdenadaPorGoles(List<Jugador> jugadores, Equipo equipo) {
		Collections.sort(jugadores);
		for (Jugador jugador : jugadores) {
			if (jugador.getEquipo() == equipo) {

				System.out.println(jugador.toString());
			}
		}
	}
}
