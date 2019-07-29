package iocdemo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		//Address address = context.getBean("address", Address.class);

		// Get Bean of Type Employee AND ID emp
		Employee emp = context.getBean("emp", Employee.class);

		// Get Bean with ID emp, but DON'T assign Type
		Employee emp2 = (Employee) context.getBean("emp");
		System.out.println(emp.getAddress().getCity());
		System.out.println(emp.getFirstName()+ " " +emp.getLastName());
		//System.out.println(emp.getLastName());
		
//		System.out.println("\nEmp: " + emp.hashCode());
//		System.out.println("Emp2: " + emp2.hashCode());
//		System.out.println("First Phone: "+emp.getContact().get(0));
	}
}
