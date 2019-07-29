package iocdemo1;

import java.util.List;

public class Employee {
	private String firstName;
	private String lastName;
	private double salary;
	private Address address;
	private String designation;
	private List<String> Contact;
	
	public List<String> getContact() {
		return Contact;
	}
	public void setContact(List<String> contact) {
		Contact = contact;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(String firstName, String lastName, double salary, iocdemo1.Address address, String designation, List <String> Contact) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.address = address;
		this.designation = designation;
		this.Contact = Contact;
	}
	
}
