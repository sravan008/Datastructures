package observable;

public class ObservalePattenDemo {

	public static void main(String[] args) {
		Salary salary = new Salary();
		new Employee1(salary);
		new Employee2(salary);
		salary.setHike(20);


		
	}

}
