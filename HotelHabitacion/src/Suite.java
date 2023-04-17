
public class Suite extends Habitacion{

	public Suite(int num) {
		super(num);
		double tarifa = super.getTarifa();
        double extra = tarifa + 40;
	    setTarifa(extra);
	    }


	}
	
    
    




