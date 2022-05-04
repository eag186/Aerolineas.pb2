package ar.unlam.pb2;

import java.util.ArrayList;

public class Avion {
	private String tipoAvion;
	private Integer capacidad;
	private Integer asientos[];
	private Integer hangar;
	private ArrayList<Avion> listaAviones;
	

	public Avion(String tipoAvion, Integer capacidad, Integer[] asientos, Integer hangar) {
		// TODO Auto-generated constructor stub
		this.tipoAvion = tipoAvion;
		this.capacidad = capacidad;
		this.asientos = new Integer[capacidad];
		this.hangar = hangar;
		this.listaAviones = new ArrayList<Avion>();
	}	

	public String getTipoAvion() {
		return tipoAvion;
	}

	public void setTipoAvion(String tipoAvion) {
		this.tipoAvion = tipoAvion;
	}

	public Integer getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(Integer capacidad) {
		this.capacidad = capacidad;
	}

	public Integer[] getAsientos() {
		return asientos;
	}
	
	public void setAsientos(Integer[] asientos) {
		this.asientos = asientos;
	}

	public Integer getHangar() {
		return hangar;
	}

	public void setHangar(Integer hangar) {
		this.hangar = hangar;
	}

	public ArrayList<Avion> getListaAviones() {
		return listaAviones;
	}

	public void setListaAviones(ArrayList<Avion> listaAviones) {
		this.listaAviones = listaAviones;
	}

	public void agregarAvion(Avion avion1) {
		// TODO Auto-generated method stub
		listaAviones.add(avion1);
	}

	public Integer obtenerCantidadAviones() {
		// TODO Auto-generated method stub
		return listaAviones.size();
	}
	
	


}
