package entities;

public class OutsourceEmployee extends Employee {

	private Double  additionalCharge;

	public OutsourceEmployee() {
		
	}
	public OutsourceEmployee(String name, Integer hours, Double valuePerHours, Double additionalCharge) {
		super(name, hours, valuePerHours);
		this.additionalCharge = additionalCharge;
	}
	public double getAdditionalCharge() {
		return additionalCharge;
	}
	public void setAdditionalCharge(double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}

	@Override
	public double payment() {
		return super.payment() + additionalCharge * 1.1 ;
	}
}
