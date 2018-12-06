package observable;

public class Employee1 extends Observer {

	Employee1(Salary salary) {
		this.salary = salary;
		this.salary.addObserver(this);
	}

	@Override
	public void update() {
		System.out.println("Employee 1 got hike of " + salary.getHike()*2);

	}

}
