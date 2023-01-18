package springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {
    public static void main(String[] args) {

        // Read spring config Java class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        // Retrieve bean from container
        Coach theCoach = context.getBean("myTennisCoachComponent", Coach.class);

        // Call a method
        System.out.println(theCoach.getDailyWorkout());

        System.out.println(theCoach.getDailyFortune());

        // Close the context
        context.close();
    }
}
