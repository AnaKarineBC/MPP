
public interface VolksFactory extends CarFactory{

	public SedanCar buildSedanCar() {
		return Voyage();
	}
	public HatchCar buildHatchCar();

}
