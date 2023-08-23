package org.osttra;

import org.osttra.config.AutowiringConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
class Tea {
	
	String name = "abc";
	
	public Tea() {
		System.out.println("inside Tea constr...");
	}
}

@Controller(value = "abc")
class Restaurant {
	
	@Autowired
	Tea tea;
	
	void prepareTea() {
		System.out.println("Your Tea is being prepared..."+tea.name);
	}
	
	public Restaurant() {
		System.out.println("inside Restaurant constructor...");
	}
	
}

public class Runner {

	public static void main(String[] args) {

//		ApplicationContext context = new ClassPathXmlApplicationContext("org/osttra/config.xml");

		ApplicationContext context = new AnnotationConfigApplicationContext(AutowiringConfig.class);
		
		context.getBean("abc", Restaurant.class).prepareTea();
		
	}
}

//class Restaurant {
//	
//	String name;
//	
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	void displayRestaurantName() {
//		System.out.println("The restaurant name is "+name);
//	}
//	public Restaurant() {
//		System.out.println("inside cons..");
//	}
//}
//
//public class Runner {
//
//	public static void main(String[] args) {
//
//		ApplicationContext context = new ClassPathXmlApplicationContext("org/osttra/config.xml");
//		
//		Restaurant restaurant = context.getBean("restaurantBean1", Restaurant.class);
//		
//		restaurant.displayRestaurantName();
//		
//		restaurant.name = "Trijal Restaurant";
//		
//		Restaurant restaurant2 = context.getBean("restaurantBean1", Restaurant.class);
//		
//		restaurant2.displayRestaurantName();
//	}
//}

//class Restaurant {
//	
//	String[] menuItems;
//
//	public void setMenuItems(String[] menuItems) {
//		this.menuItems = menuItems;
//	}
//
//	public void showMenu() {
//		
//		for( String item : menuItems) {
//			
//			System.out.println(item);
//		}
//	}
//	
//}
//
//public class Runner {
//
//	public static void main(String[] args) {
//
//		ApplicationContext context = new ClassPathXmlApplicationContext("org/osttra/config.xml");
//		
//		Restaurant restaurant = context.getBean("restaurantBean1", Restaurant.class);
//		
//		restaurant.showMenu();
//	}
//}

//class Tea {
//	
//	String name;
//	
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	void prepareTea() {
//		
//		System.out.println("Your "+name+" Tea is being prepared");
//	}
//	
//}
//
//class Restaurant {
//	
//	Tea tea;
//	
//	public Restaurant(Tea tea) {
//		super();
//		this.tea = tea;
//	}
//
//	public void placeOrder() {
//
//		tea.prepareTea();
//	}
//}
//
//public class Runner {
//
//	public static void main(String[] args) {
//
//		ApplicationContext context = new ClassPathXmlApplicationContext("org/osttra/config.xml");
//		
//		Restaurant restaurant = context.getBean("restaurantBean1", Restaurant.class);
//		
//		restaurant.placeOrder();
//	}
//}


//class Tea {
//	
//	void prepareTea() {
//		
//		System.out.println("Your Tea is being prepared");
//	}
//	
//	public Tea() {
//		System.out.println("inside Tea constr");
//	}
//}
//
//class Restaurant {
//	
//	Tea tea;
//	
//	public Restaurant(Tea tea) {
//		super();
//		System.out.println("inside Rest constr");
//		this.tea = tea;
//	}
//
//	public void placeOrder() {
//
//		tea.prepareTea();
//	}
//	
//	public Restaurant() {
//		System.out.println("inside constr...");
//	}
//
//}
//
//public class Runner {
//
//	public static void main(String[] args) {
//
//		ApplicationContext context = new ClassPathXmlApplicationContext("org/osttra/config.xml");
//		
//		Restaurant restaurant = context.getBean("restaurantBean1", Restaurant.class);
//		
//		restaurant.placeOrder();
//	}
//}

//class Restaurant {
//	
//	String rname;
//	
//	public Restaurant(String rname) {
//		super();
//		this.rname = rname;
//		System.out.println("parameterised");
//	}
//	
//	
//	public void setRname(String rname) {
//		this.rname = rname;
//	}
//
//	public void prepareTea() {
//
//		System.out.println("Your Tea is being prepared by "+rname);
//	}
//	
//	public Restaurant() {
//		System.out.println("inside constr...");
//	}
//
//}
//
//public class Runner {
//
//	public static void main(String[] args) {
//
//		ApplicationContext context = new ClassPathXmlApplicationContext("org/osttra/config.xml");
//		
//		Restaurant restaurant = context.getBean("restaurantBean2", Restaurant.class);
//		
//		restaurant.prepareTea();
//	}
//}

//class Restaurant {
//	
//	String rname;
//	
//	public void setRname(String rname) {
//		this.rname = rname;
//		System.out.println("inside setter");
//	}
//
//	public void prepareTea() {
//
//		System.out.println("Your Tea is being prepared by "+rname);
//	}
//	
//	public Restaurant() {
//		System.out.println("inside constr...");
//	}
//
//}
//
//public class Runner {
//
//	public static void main(String[] args) {
//
//		ApplicationContext context = new ClassPathXmlApplicationContext("org/osttra/config.xml");
//		
//		Restaurant restaurant = context.getBean("restaurantBean", Restaurant.class);
//		
//		restaurant.prepareTea();
//	}
//}

//class Restaurant {
//
//	public void prepareTea() {
//
//		System.out.println("Your Tea is being prepared...");
//	}
//	public Restaurant() {
//		System.out.println("inside constructor of Restaurant...");
//	}
//
//}
//
//public class Runner {
//
//	public static void main(String[] args) {
//
//		ApplicationContext context = new ClassPathXmlApplicationContext("org/osttra/config.xml");
//		
//		Restaurant restaurant = context.getBean("restaurantBean", Restaurant.class);
//		
//		restaurant.prepareTea();
//	}
//}

//class Restaurant {
//
//	public void prepareTea() {
//
//		System.out.println("Your Tea is being prepared...");
//	}
//
//	public Restaurant(String name) {
//
//	}
//}
//
//public class Runner {
//
//	public static void main(String[] args) {
//
//		Restaurant restaurant = new Restaurant();
//
//		restaurant.prepareTea();
//	}
//}