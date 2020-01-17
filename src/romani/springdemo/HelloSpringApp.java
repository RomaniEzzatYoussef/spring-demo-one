package romani.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		// load spring configuration file
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		Coach basBallCoach = applicationContext.getBean("basBallCoach", Coach.class);
		Coach trackCoach = applicationContext.getBean("trackCoach", Coach.class);

		// call methods on the bean 
		System.out.println(basBallCoach.getDailyWorkout());
		
		// let's call our new method for fortunes
		System.out.println(basBallCoach.getDailyFortune());
		
		// close the context
		applicationContext.close();
	}

}
