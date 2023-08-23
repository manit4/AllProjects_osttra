
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import com.manitt.Restaurant;



public class Main {
	
	public static void main(String[] args) {

		//ApplicationContext context = new ClassPathXmlApplicationContext("");
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Configu.class);

		context.getBean("restaurant", Restaurant.class).prepareTea();
		
	}

}


