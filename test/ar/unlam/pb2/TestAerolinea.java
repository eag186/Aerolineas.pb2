package ar.unlam.pb2;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.time.LocalTime;

import org.junit.Test;

public class TestAerolinea {

	@Test
	public void queSePuedaCrearPilotoYAgregarAUnaLista() {

		String nombreYApellido = "";
		Integer id = 1;
		Integer pasaporte = 1111;
		String areaAsignada = "Piloto";
		Integer cantHoras = 0;
		String tipoAvion = "Boing 747";
		Persona piloto = new Personal(nombreYApellido, pasaporte, id, areaAsignada, cantHoras, tipoAvion);
		piloto.agregarPiloto((Personal) piloto);
		Integer valorEsperado = 1;
		Integer valorObtenido = piloto.obtenerCantidadDePilotos();
		assertEquals(valorEsperado, valorObtenido);
	}
    @Test
	public void queSePuedaCrearAzafataYAgregarAUnaLista() {
		String nombreYApellido = "";
		Integer id = 1;
		Integer pasaporte = 1111;
		String areaAsignada = "Azafata";
		Persona azafata = new Personal(nombreYApellido, pasaporte, id, areaAsignada);
		azafata.agregarAzafata(azafata);
		Integer valorEsperado = 1;
		Integer valorObtenido = azafata.obtenerCantidadDeAzafatas();
		
		assertEquals(valorEsperado,valorObtenido);
	}

	@Test
	public void quesePuedaCrearVuelo() {
		Integer nroVuelo = 01;
		LocalDate fechaSalida = LocalDate.of(2022, 07, 11);
		LocalTime horaSalida = LocalTime.of(20, 30);
		String ciudadEscala = "Madrid";
		String TipoAvion = "Boing 747";
		Persona azafata[] = new Personal[4];
		Persona pilotos[] = new Personal[2];		
		Vuelos primerVuelo = new Vuelos(nroVuelo,fechaSalida,horaSalida,ciudadEscala,TipoAvion,azafata,pilotos); 
		
		primerVuelo.agregarVuelo(primerVuelo);
		Integer valorEsperado = 1;
		Integer valorObtenido = primerVuelo.obtenerCantidadDeVuelos();		
		assertEquals(valorEsperado,valorObtenido);
	}
	
	@Test
	public void queSePuedaCrearAvion() {
		String tipoAvion = "Boing 747";
		Integer capacidad = 40;
		Integer asientos[] = new Integer[capacidad];
		Integer hangar = 1;		
		Avion avion1 = new Avion(tipoAvion,capacidad,asientos,hangar);
		avion1.agregarAvion(avion1);
		Integer valorEsperado = 1;
		Integer valorResultado = avion1.obtenerCantidadAviones();
		
		assertEquals(valorEsperado,valorResultado);
	}

}