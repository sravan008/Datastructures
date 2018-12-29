package decorator;

public class AndriodPhone extends SmartPhone {

	public AndriodPhone(Phone phone) {
		super(phone);
		// TODO Auto-generated constructor stub
	}

	public String build() {
		return super.build() + addOs();
	}

	private String addOs() {
		return "Andriod version 9.0";
	}
	
	
}
