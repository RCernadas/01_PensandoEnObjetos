package com.raquel.liga;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

import com.raquel.liga.clases.Encuentro;
import com.raquel.liga.clases.Equipo;
import com.raquel.liga.clases.Jugador;
import com.raquel.liga.clases.ResultadosLiga;

public class App {
	public static void main(String[] args) {
		// Métodos par el menú
		Scanner scan = new Scanner(System.in);
		boolean salir = false;
		int opcion;
		int opcion2;

		// Listas en las que almacenaremos todos los Equipos, Jugadores y Encuentros de
		// la liga
		List<Equipo> equipos = new ArrayList<>();
		List<Jugador> jugadores = new ArrayList<>();
		List<Encuentro> encuentros = new ArrayList<>();

		// Creación de instancias de equipo (nombre del equipo y partidos ganados)
		Equipo da = new Equipo("Deportivo Alavés", 4);
		Equipo alm = new Equipo("Almería", 7);
		Equipo bar = new Equipo("FC Barcelona", 9);
		Equipo ath = new Equipo("Athletic Club", 2);
		Equipo atl = new Equipo("Atlético de Madrid", 4);
		Equipo bet = new Equipo("Real Betis", 2);
		Equipo cad = new Equipo("Cádiz", 8);
		Equipo cel = new Equipo("Celta de Vigo", 4);
		Equipo get = new Equipo("Getafe", 5);
		Equipo gir = new Equipo("Girona", 5);
		Equipo gra = new Equipo("Granada", 7);
		Equipo lp = new Equipo("Las Palmas", 2);
		Equipo mall = new Equipo("Real Mallorca", 0);
		Equipo osa = new Equipo("Osasuna", 4);
		Equipo rayo = new Equipo("Rayo Vallecano", 6);
		Equipo rm = new Equipo("Real Madrid", 9);
		Equipo rs = new Equipo("Real Sociedad", 3);
		Equipo sev = new Equipo("Sevilla", 2);
		Equipo val = new Equipo("Valencia", 7);
		Equipo vil = new Equipo("Villareal", 2);

		equipos.add(da);
		equipos.add(alm);
		equipos.add(bar);
		equipos.add(ath);
		equipos.add(atl);
		equipos.add(bet);
		equipos.add(cad);
		equipos.add(cel);
		equipos.add(get);
		equipos.add(gir);
		equipos.add(gra);
		equipos.add(lp);
		equipos.add(mall);
		equipos.add(osa);
		equipos.add(rayo);
		equipos.add(rm);
		equipos.add(rs);
		equipos.add(sev);
		equipos.add(val);
		equipos.add(vil);

		// Declaración de instancias de jugadores
		jugadores.add(new Jugador(1, "Carlos Benito", da, 2));
		jugadores.add(new Jugador(2, "Marcos Rivera", val, 9));
		jugadores.add(new Jugador(3, "Eudisio Rodriguez", rm, 2));
		jugadores.add(new Jugador(4, "Juan Lopez", bar, 2));
		jugadores.add(new Jugador(5, "Mateo Lopez", osa, 1));
		jugadores.add(new Jugador(6, "Alex Maroc", mall, 2));
		jugadores.add(new Jugador(7, "Javier Lago", bet, 6));
		jugadores.add(new Jugador(8, "Guti Pen", ath, 2));
		jugadores.add(new Jugador(9, "Oto Roder", bar, 1));
		jugadores.add(new Jugador(10, "Pablo Gutierrez", osa, 3));
		jugadores.add(new Jugador(11, "Rodrigo Misa", osa, 6));
		jugadores.add(new Jugador(12, "Fausto Alonso", mall, 0));
		jugadores.add(new Jugador(13, "Miguel Maldonado", val, 7));
		jugadores.add(new Jugador(14, "Marco Aurelio", val, 2));
		jugadores.add(new Jugador(15, "David Kaixo", rm, 2));

		// Declaración de Instancias de Encuentro
		Encuentro e1 = new Encuentro(1, rm, bar, 2, 1);
		Encuentro e2 = new Encuentro(2, val, bar, 2, 2);
		Encuentro e3 = new Encuentro(3, vil, rs, 2, 3);
		Encuentro e4 = new Encuentro(4, cel, sev, 0, 0);
		Encuentro e5 = new Encuentro(5, cad, gir, 0, 1);

		encuentros.add(e1);
		encuentros.add(e2);
		encuentros.add(e3);
		encuentros.add(e4);
		encuentros.add(e5);

		// Menú
		while (!salir) {
			System.out.println("SELECCIONE EL INFORME QUE DESEA OBTENER DE LA LIGA DE FÚTBOL ESPAÑOLA: ");
			System.out.println("1. Ver resultados de los partidos jugados");
			System.out.println("2. Lista de equipos de la liga ordenados por partidos ganados");
			System.out.println("3. Jugadores de cada equipo ordenados por goles marcados");
			System.out.println("4. SALIR");

			opcion = scan.nextInt();
			switch (opcion) {
			case 1:
				for (Encuentro encuentro : encuentros) {
					System.out.println(encuentro.toString());
				}
				break;
			case 2:
				ResultadosLiga.ListaDeEquiposOrdenadaPorPartidosGanados(equipos);
				break;
			case 3:
				System.out.println("Escriba el número del equipo del que desea ver las estadísticas:\n");
				System.out.println(
						" 1. Deportivo Alavés\n 2. Almería\n 3. FC Barcelona\n 4. Athletic Club\n 5. Atlético de Madrid\n 6. Real Betis\n 7. Cádiz\n 8. Celta de Vigo\n 9. Getafe\n 10. Girona\n 11. Granada\n 12. Las Palmas\n 13. Real Mallorca\n 14. Osasuna\n 15. Rayo Vallecano\n 16. Real Madrid\n 17. Real Sociedad\n 18. Sevilla\n 19. Valencia\n 20. Villareal");
				opcion2 = scan.nextInt();
				switch (opcion2) {
				case 1:
					ResultadosLiga.ListaJugadoresOrdenadaPorGoles(jugadores, da);
					break;
				case 2:
					ResultadosLiga.ListaJugadoresOrdenadaPorGoles(jugadores, alm);
					break;
				case 3:
					ResultadosLiga.ListaJugadoresOrdenadaPorGoles(jugadores, bar);
					break;
				case 4:
					ResultadosLiga.ListaJugadoresOrdenadaPorGoles(jugadores, ath);
					break;
				case 5:
					ResultadosLiga.ListaJugadoresOrdenadaPorGoles(jugadores, atl);
					break;
				case 6:
					ResultadosLiga.ListaJugadoresOrdenadaPorGoles(jugadores, bet);
					break;
				case 7:
					ResultadosLiga.ListaJugadoresOrdenadaPorGoles(jugadores, cad);
					break;
				case 8:
					ResultadosLiga.ListaJugadoresOrdenadaPorGoles(jugadores, cel);
					break;
				case 9:
					ResultadosLiga.ListaJugadoresOrdenadaPorGoles(jugadores, get);
					break;
				case 10:
					ResultadosLiga.ListaJugadoresOrdenadaPorGoles(jugadores, gir);
					break;
				case 11:
					ResultadosLiga.ListaJugadoresOrdenadaPorGoles(jugadores, gra);
					break;
				case 12:
					ResultadosLiga.ListaJugadoresOrdenadaPorGoles(jugadores, lp);
					break;
				case 13:
					ResultadosLiga.ListaJugadoresOrdenadaPorGoles(jugadores, mall);
					break;
				case 14:
					ResultadosLiga.ListaJugadoresOrdenadaPorGoles(jugadores, osa);
					break;
				case 15:
					ResultadosLiga.ListaJugadoresOrdenadaPorGoles(jugadores, rayo);
					break;
				case 16:
					ResultadosLiga.ListaJugadoresOrdenadaPorGoles(jugadores, rm);
					break;
				case 17:
					ResultadosLiga.ListaJugadoresOrdenadaPorGoles(jugadores, rs);
					break;
				case 18:
					ResultadosLiga.ListaJugadoresOrdenadaPorGoles(jugadores, sev);
					break;
				case 19:
					ResultadosLiga.ListaJugadoresOrdenadaPorGoles(jugadores, val);
					break;
				case 20:
					ResultadosLiga.ListaJugadoresOrdenadaPorGoles(jugadores, vil);
					break;
				}
				break;
			case 4:
				salir = true;
			}
		}

	}

}
