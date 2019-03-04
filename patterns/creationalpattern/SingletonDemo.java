package creationalpattern;

public class SingletonDemo {
	
	public static void main(String[] args) {
		
		/*Singleton instance = Singleton.getInstance();
		
		System.out.println(instance);
		
		
		Singleton instanceD = Singleton.getInstance();
		System.out.println(instanceD);*/
		
		SingletonEnum singleton = SingletonEnum.INSTANCE;
		System.out.println(singleton.hashCode());
		SingletonEnum singleton1 = SingletonEnum.INSTANCE;
		System.out.println(singleton1.hashCode());
		
	}

}
