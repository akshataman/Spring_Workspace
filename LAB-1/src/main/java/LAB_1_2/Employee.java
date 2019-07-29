package LAB_1_2;

public class Employee {
	 private int id;
	 private String name;
	 private double salary;
	 private SBU bu;

	 @Override
	 public String toString() {
	 return "Employee [id=" + id + ", name=" + name + ", salary=" + salary
	  + ", bu=" + bu + "]";
	 }

	 public int getId() {
	 return id;
	 }

	 public void setId(int id) {
	 this.id = id;
	 }

	 public String getName() {
	 return name;
	 }

	 public void setName(String name) {
	 this.name = name;
	 }

	 public double getSalary() {
	 return salary;
	 }

	 public void setSalary(double salary) {
	 this.salary = salary;
	 }

	 public SBU getBu() {
	 return bu;
	 }

	 public void setBu(SBU bu) {
	 this.bu = bu;

	 }
}
