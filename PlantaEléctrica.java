

public class PlantaEléctrica{
	
	private String nombre_planta, ID;
	
	public PlantaEléctrica(String ID,String nombre_planta) {
		this.ID= ID;
		this.nombre_planta= nombre_planta;
	}

	public String getNombre_planta() {
		return nombre_planta;
	}

	public void setNombre_planta(String nombre_planta) {
		this.nombre_planta = nombre_planta;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}
	
	public String toString() {
		return "Compañía: " + getNombre_planta();
	}
	
}
