

public class Ciudad{
	
	private String nombre_ciudad, ID;
	private int mw[], tarifa;
	
	public Ciudad(String ID, String nombre_ciudad) {
		this.ID= ID;
		this.nombre_ciudad= nombre_ciudad;
	}

	public String getNombre_ciudad() {
		return nombre_ciudad;
	}

	public void setNombre_ciudad(String nombre_ciudad) {
		this.nombre_ciudad = nombre_ciudad;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}
	
	public int[] getMw() {
		return mw;
	}

	public void setMw(int[] mw) {
		this.mw = mw;
	}

	public int getTarifa() {
		return tarifa;
	}

	public void setTarifa(int tarifa) {
		this.tarifa = tarifa;
	}

	public String toString() {
		return "Ciudad: " + getNombre_ciudad(); 
	}
	
}
