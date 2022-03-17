
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
	
}
