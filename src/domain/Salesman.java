package domain;

public class Salesman extends Employee {

	private double percentPerSold;
	
	private double soldAmount;
	
	public Salesman(String code,
					String name,
					String address,
					int age,
					double salary,
					double percentPerSold,
					double soldAmount) {
		super(code, name, address, age, salary);
		this.percentPerSold = percentPerSold;
		this.soldAmount = soldAmount;
	}

	public Salesman() {
		super();
	}
	
	@Override
	public String getCode() {
		return "SL" + this.code;
	}

	public double getPercentPerSold() {
		return percentPerSold;
	}

	public void setPercentPerSold(double percentPerSold) {
		this.percentPerSold = percentPerSold;
	}
	
	public double getSoldAmount() {
		return soldAmount;
	}

	public void setSoldAmount(double soldAmount) {
		this.soldAmount = soldAmount;
	}

	public double getFullSalary() {
		return this.salary + ((soldAmount * percentPerSold) / 100);
	}
	
	public double getFullSalary(double extra) {
		return this.getFullSalary() + extra;
	}
}
