
public class Habitacion {
	
	//atributos
	private int num_habitacion;
	private double tarifa;
	
	//constructor
	public Habitacion(int num_habitacion) {
		this.num_habitacion = num_habitacion;
		
		if(this.num_habitacion >= 269) {
			tarifa = 69.95;
		}
		else {
			tarifa = 89.95;
		}
	}

	//metodos get y set
	public int getNum_habitacion() {
		return num_habitacion;
	}

	public void setNum_habitacion(int num_habitacion) {
		this.num_habitacion = num_habitacion;
	}

	public double getTarifa() {
		return tarifa;
	}

	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}

}
