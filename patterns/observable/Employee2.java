package observable;

public class Employee2 extends Observer {

	public Employee2(Salary salary) {

		this.salary = salary;
		this.salary.addObserver(this);

	}

	@Override
	public void update() {
		System.out.println("Employee 2 got hike of " + salary.getHike()*4);

	}

}
