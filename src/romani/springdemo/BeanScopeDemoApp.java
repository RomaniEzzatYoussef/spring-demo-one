package romani.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

    public static void main(String[] args) {

        // load the spring configuration file
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("bean-scopes-application-context.xml");

        // retrieve bean from spring container
        Coach trackCoach1 = applicationContext.getBean("trackCoach" , Coach.class);

        Coach trackCoach2 = applicationContext.getBean("trackCoach" , Coach.class);

        // check if they are the same
        boolean result = (trackCoach1 == trackCoach2);

        // print out the results
        System.out.println("\nPointing to the same object: " + result);
        System.out.println("\nMemory location for trackCoach1: " + trackCoach1);
        System.out.println("\nMemory location for trackCoach2: " + trackCoach2);

        // close the context
        applicationContext.close();
    }
}
