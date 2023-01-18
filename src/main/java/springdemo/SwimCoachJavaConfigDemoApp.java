package springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimCoachJavaConfigDemoApp {
    public static void main(String[] args) {

        // Read spring config Java class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        // Retrieve bean from container
        SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);

        // Call a method
        System.out.println(theCoach.getDailyWorkout());

        System.out.println(theCoach.getDailyFortune());

        System.out.println("email: " + theCoach.getEmail());

        System.out.println("team: " + theCoach.getTeam());

        // Close the context
        context.close();
    }
}
