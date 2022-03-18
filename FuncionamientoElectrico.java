
import java.util.stream.IntStream;

public class FuncionamientoElectrico{
	
	private int totalwatts;
	private double precio;
	
	public FuncionamientoElectrico() {
	}
	
	public int wattsCiudad(Consumo consumo) {
		totalwatts= IntStream.of(consumo.getMw()).sum();
		return totalwatts;
	}

	public double[] valorMensual(int mes, Consumo consumo) { 
		double valorc, valors;
		consumo= new Consumo("1", "Guayaquil");
		consumo.consumoCiudadCoca("Guayaquil");
		valorc= consumo.getMw()[mes]*consumo.getTarifa();
		consumo= new Consumo("1", "Quito");
		consumo.consumoCiudadCoca("Quito");
		valorc= valorc + consumo.getMw()[mes]*consumo.getTarifa();
		consumo= new Consumo("1", "Guayaquil");
		consumo.consumoCiudadSopladora("Guayaquil");
		valors= consumo.getMw()[mes]*consumo.getTarifa();
		consumo= new Consumo("1", "Quito");
		consumo.consumoCiudadSopladora("Quito");
		valors= valors + consumo.getMw()[mes]*consumo.getTarifa();
		consumo= new Consumo("1", "Loja");
		consumo.consumoCiudadSopladora("Loja");
		valors= valors + consumo.getMw()[mes]*consumo.getTarifa();
		precio= valorc + valors;
		double inf_mensual[] = {valorc,valors,precio};
		return inf_mensual;
	}
	
	public double valorRegion(Consumo consumo, Region region) {
		String nombre_ciu= "";
		switch(region.getID()) {
		case "1":
			nombre_ciu= "Guayaquil";
			consumo= new Consumo("1", nombre_ciu);
			consumo.consumoCiudadCoca(nombre_ciu);
			precio= wattsCiudad(consumo)*consumo.getTarifa();
			consumo.consumoCiudadSopladora(nombre_ciu);
			precio= precio+wattsCiudad(consumo)*consumo.getTarifa();
			break;
		case "2":
			nombre_ciu= "Quito";
			consumo= new Consumo("1", nombre_ciu);
			consumo.consumoCiudadCoca(nombre_ciu);
			precio= wattsCiudad(consumo)*consumo.getTarifa();
			consumo.consumoCiudadSopladora(nombre_ciu);
			precio= precio+wattsCiudad(consumo)*consumo.getTarifa();
			nombre_ciu= "Loja";
			consumo= new Consumo("1", nombre_ciu);
			consumo.consumoCiudadSopladora(nombre_ciu);
			precio= precio+wattsCiudad(consumo)*consumo.getTarifa();
			break;
		case "3":
			precio=0;
		}
		return precio;
	}
	
		public int[] wattsGenerador(Consumo consumo, String nombre) {
		int cc = 0,cs = 0;
		switch(nombre) {
		case "Loja":
			consumo.consumoCiudadSopladora(nombre);
			cs = wattsCiudad(consumo);
			break;
		case "Guayaquil","Quito":
			consumo.consumoCiudadCoca(nombre);
			cc = wattsCiudad(consumo);
			consumo.consumoCiudadSopladora(nombre);
			cs = wattsCiudad(consumo);
			break;
		}
		int consumos[]= {cc,cs};
		return consumos;
	}
	
	public int getTotalwatts() {
		return totalwatts;
	}

	public void setTotalwatts(int totalwatts) {
		this.totalwatts = totalwatts;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
}
