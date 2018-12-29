package decorator;

public class WindowsPhone extends SmartPhone {

	public WindowsPhone(Phone phone) {
		super(phone);
		// TODO Auto-generated constructor stub
	}

	public String build() {
		return super.build() + addOs();
	}

	private String addOs() {
		return "Windows v1.0";
	}

}
