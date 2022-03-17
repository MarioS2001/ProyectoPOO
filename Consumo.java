
public class Consumo extends Ciudad{

	public Consumo(String ID, String nombre_ciudad) {
		super(ID, nombre_ciudad);
	}
	
	public void consumoCiudadCoca(String nombre) {
		switch(nombre) {
		case "Guayaquil":
			int wattsgc[]= {120, 55, 32, 120, 75, 32, 150, 55, 32, 120, 97, 32};
			setMw(wattsgc);
			setTarifa(84);
			break;
		case "Quito":
			int wattsqc[]= {400, 432, 400, 432, 420, 432, 460, 432, 400, 432, 300 , 213};
			setMw(wattsqc);
			setTarifa(65);
			break;
		}
	}
	
	public void consumoCiudadSopladora(String nombre) {
		switch(nombre) {
		case "Guayaquil":
			int wattsgs[]= {310, 220, 321, 310, 220, 321, 310, 220, 321, 310, 220, 321};
			setMw(wattsgs);
			setTarifa(55);
			break;
		case "Quito":
			int wattsqs[]= {400, 432, 587, 400, 432, 587, 400, 432, 587, 400, 432, 587};
			setMw(wattsqs);
			setTarifa(79);
			break;
		case "Loja":
			int wattsls[]= {50, 32, 32, 50, 32, 32, 50, 32, 32, 50, 32, 32};
			setMw(wattsls);
			setTarifa(32);
			break;
		}
	}
}
