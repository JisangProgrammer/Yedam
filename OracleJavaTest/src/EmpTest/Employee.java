package EmpTest;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String firstName;
	private String lastName;
	private String salary;
	
	public Employee(String fn, String ln, String sa) {
		firstName = fn;
		lastName = ln;
		salary = sa;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return firstName + " " + lastName + "의 급여는 " + salary + "원입니다.";
	}

	public static void main(String[] args) {
		Employee emp1 = new Employee("Alexander","Lee","300000");
		Employee emp2 = new Employee("Godin","Wang","2600000");
		Employee emp3 = new Employee("Jenie","Gwon","2800000");		
		
		List<Employee> empList = new ArrayList<>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		
		for(Employee e : empList)
			System.out.println(e);
		System.out.println();
		
		empList.stream().filter(e -> !e.getFirstName().equals("Alexander")).forEach(f -> System.out.println(f));
	}
}