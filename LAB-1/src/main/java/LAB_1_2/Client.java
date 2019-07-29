package LAB_1_2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {

		 ApplicationContext context=new ClassPathXmlApplicationContext("spring2.xml");
		 Employee d = context.getBean(Employee.class);
		 System.out.println(d);

	}
}
