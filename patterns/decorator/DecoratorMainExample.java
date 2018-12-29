package decorator;

public class DecoratorMainExample {

	public static void main(String[] args) {

		Phone andriodPhone = new AndriodPhone(new BasicPhone());
		System.out.println(andriodPhone.build());

		Phone iphone = new Iphone(new BasicPhone());
		System.out.println(iphone.build());

		Phone nokiaPhone = new NokiaPhone(new AndriodPhone(new BasicPhone()));
		System.out.println(nokiaPhone.build());

	}

}
