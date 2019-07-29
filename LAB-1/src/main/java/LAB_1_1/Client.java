package LAB_1_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Client {

 public static void main(String[] args) {

 ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");

 Employee d = context.getBean(Employee.class);
 System.out.println("Employee Details ");
 System.out.println("---------------------------------------------- \n");
 System.out.println("Employee ID: "+ d.getEmployeeId());
 System.out.println("Employee Name: "+ d.getEmployeeName());
 System.out.println("Employee Salary: "+ d.getSalary());
 System.out.println("Employee BU: "+ d.getBusinessUnit());
 System.out.println("Employee Age: "+ d.getAge());

 }

}