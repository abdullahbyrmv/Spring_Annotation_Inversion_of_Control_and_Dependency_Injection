package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
    public static void main(String[] args) {

        // Load spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve bean from container
        Coach theCoach = context.getBean("myTennisCoachComponent", Coach.class);

        Coach theCoach2 = context.getBean("myTennisCoachComponent", Coach.class);

        // Check if objects are same
        boolean res = (theCoach == theCoach2);

        System.out.println("Pointing to the same object: " + res);

        // Print object references
        System.out.println("Memory location for theCoach: " + theCoach);
        System.out.println("Memory location for theCoach2: " + theCoach2);

        // Close the context
        context.close();
    }
}
