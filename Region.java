
public class Region{
	
	private String nombre_region, ID;
	
	public Region(String ID, String nombre_region) {
		this.ID= ID;
		this.nombre_region=nombre_region;
	}

	public String getNombre_region() {
		return nombre_region;
	}

	public void setNombre_region(String nombre_region) {
		this.nombre_region = nombre_region;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}
	
	public String toString() {
		return "Región: " + getNombre_region();
	}
	
}

