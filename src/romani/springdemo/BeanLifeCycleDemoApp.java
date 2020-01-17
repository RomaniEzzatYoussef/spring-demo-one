package romani.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

    public static void main(String[] args) {

        // load the spring configuration file
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("bean-lifeCycle-application-context.xml");

        // retrieve bean from spring container
        Coach trackCoach = applicationContext.getBean("trackCoach" , Coach.class);

        System.out.println(trackCoach.getDailyFortune());

        // close the context
        applicationContext.close();
    }
}
