package Assignment4;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee employee = new Employee("John", "Smith", "101", 35);
		
		employee.computePay(40);
		employee.computePay(23);
		employee.computePay(1);
		employee.computePay(0);
		employee.computePay(-5);
		employee.computePay(45);
	}

}
