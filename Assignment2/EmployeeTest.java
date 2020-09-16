
package Assignment2_3;

public class EmployeeTest {
	
	public static void main(String[] args) {
	
		Employee e1 = new Employee("Joe", "Smith", 30, 123456789, "23501 W Clark St Plainfield, Illinois(IL), 60586", "Male",
				60.0, 2891, "Contractor", 60.0);
		Employee e2 = new Employee("Lisa", "Gray", 24, 987654321, "145 Maple St Manchester, Pennsylvania(PA), 17345", "Female", 
				52, 5820, "Full time", 110000);
		Employee e3 = new Employee("Timothy", "Briggs", 44, 826581304, "427 Jackson Rd Sewell, New Jersey(NJ), 08080", "Male",
				70, 3589, "Full time", 80000);
		Employee e4 = new Employee("George", "Wallace", 28, 962067735, "69 E 6th St Mount Pleasant, Arkansas(AR), 72561", "Male",
				78, 9361, "Part time", 20);
		Employee e5 = new Employee("Amy", "Student", 39, 276961589, "3076 N Mission Rd Tallahassee, Florida(FL), 32303", "Female",
				49, 3457, "Contractor", 45);
		e1.introduce();
		e1.calculatePayment(60);
		e2.introduce();
		e2.calculatePayment(2);
		e3.introduce();
		e3.calculatePayment(4);
		e4.introduce();
		e4.calculatePayment(25);
		e5.introduce();
		e5.calculatePayment(45);
		
		
		
		
		
		
	}
}