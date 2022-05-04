package ar.unlam.pb2;

import java.util.ArrayList;

public class Personal extends Persona {
	private String areaAsignada;
	private Integer cantHoras;
	private String tipoAvion;
	private ArrayList<Personal> listPilotos;
	private ArrayList<Personal> listAzafatas;
	// private ArrayList listTipodeAvion = new ArrayList();

	// constr pilotos
	public Personal(String nombreYApellido, Integer pasaporte, Integer id, String areaAsignada, Integer cantHoras,
			String tipoAvion) {
		// TODO Auto-generated constructor stub
		super(nombreYApellido, pasaporte, id);
		this.areaAsignada = areaAsignada;
		this.cantHoras = cantHoras;
		this.tipoAvion = tipoAvion;
		this.listPilotos = new ArrayList<>();
	}

//	const azafata
	public Personal(String nombreYApellido, Integer pasaporte, Integer id, String areaAsignada) {
		// TODO Auto-generated constructor stub
		super(nombreYApellido, pasaporte, id);
		this.areaAsignada = areaAsignada;
		this.listAzafatas = new ArrayList<>();
	}

	public ArrayList<Personal> getListPilotos() {
		return listPilotos;
	}

	public void setListPilotos(ArrayList<Personal> listPilotos) {
		this.listPilotos = listPilotos;
	}

	public String getAreaAsignada() {
		return areaAsignada;
	}

	public void setAreaAsignada(String areaAsignada) {
		this.areaAsignada = areaAsignada;
	}

	public Integer getCantHoras() {
		return cantHoras;
	}

	public void setCantHoras(Integer cantHoras) {
		this.cantHoras = cantHoras;
	}

	public String getTipoAvion() {
		return tipoAvion;
	}

	public void setTipoAvion(String tipoAvion) {
		this.tipoAvion = tipoAvion;
	}

	@Override
	public void agregarPiloto(Personal piloto) {
		// TODO Auto-generated method stub
		this.listPilotos.add(piloto);
	}

	@Override
	public Integer obtenerCantidadDePilotos() {
		// TODO Auto-generated method stub
		return this.listPilotos.size();
	}

	@Override
	protected void agregarAzafata(Persona azafata) {
		// TODO Auto-generated method stub
		listAzafatas.add((Personal) azafata);
	}

	@Override
	protected Integer obtenerCantidadDeAzafatas() {
		// TODO Auto-generated method stub
		return this.listAzafatas.size();
	}
	
	

}
