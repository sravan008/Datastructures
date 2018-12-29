package decorator;

public class Iphone extends SmartPhone {

	public Iphone(Phone phone) {
		super(phone);
	}
	public String build() {
		return super.build() + addOs();
	}
	private String addOs() {
		return "Iphone version 9.0";
	}

}
