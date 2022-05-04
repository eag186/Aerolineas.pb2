package ar.unlam.pb2;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Vuelos {

	private Integer nroVuelo;
	private LocalDate fechaSalida;
	private LocalTime horaSalida;
	private String ciudadEscala;
	private String TipoAvion;
	private Persona azafata[] = new Personal[4];
	private Persona pilotos[] = new Personal[2];
	private ArrayList <Vuelos> listaVuelos;

	public Vuelos(Integer nroVuelo, LocalDate fechaSalida, LocalTime horaSalida, String ciudadEscala, String tipoAvion,
			Persona[] azafata, Persona[] pilotos) {
		// TODO Auto-generated constructor stub
		this.nroVuelo = nroVuelo;
		this.fechaSalida = fechaSalida;
		this.horaSalida = horaSalida;
		this.ciudadEscala = ciudadEscala;
		this.TipoAvion = tipoAvion;
		this.azafata = azafata;
		this.pilotos = pilotos;
		this.listaVuelos  = new ArrayList<>();
	}

	public void agregarVuelo(Vuelos primerVuelo) {
		// TODO Auto-generated method stub
		listaVuelos.add(primerVuelo);
	}

	public Integer obtenerCantidadDeVuelos() {
		// TODO Auto-generated method stub
		return listaVuelos.size();
	}
}
