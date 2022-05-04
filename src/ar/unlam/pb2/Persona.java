package ar.unlam.pb2;

public abstract class Persona {
	
	private String nombreYApellido;
	private Integer pasaporte;
	private Integer id;

	public Persona(String nombreYApellido, Integer pasaporte, Integer id) {
		// TODO Auto-generated constructor stub
		this.nombreYApellido = nombreYApellido;
		this.pasaporte = pasaporte;
		this.id = id;
	}
	
	

	public String getNombreYApellido() {
		return nombreYApellido;
	}



	public void setNombreYApellido(String nombreYApellido) {
		this.nombreYApellido = nombreYApellido;
	}



	public Integer getPasaporte() {
		return pasaporte;
	}



	public void setPasaporte(Integer pasaporte) {
		this.pasaporte = pasaporte;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}

	public abstract void agregarPiloto(Personal piloto);
	
	public abstract Integer obtenerCantidadDePilotos();

	protected abstract void agregarAzafata(Persona azafata);

	protected abstract Integer obtenerCantidadDeAzafatas();
	
}
