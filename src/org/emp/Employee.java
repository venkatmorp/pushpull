package org.emp;

public class Employee {
	public void empName() {
		System.out.println("Name: Mathi");
	}

	public void empId() {
		System.out.println("ID: 165489 ");
	}

	public void empPhone() {
		System.out.println("Phone: 7904523647");
	}

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.empName();
		emp.empId();
		emp.empPhone();
		
		System.out.println(emp);
		
	}

}
