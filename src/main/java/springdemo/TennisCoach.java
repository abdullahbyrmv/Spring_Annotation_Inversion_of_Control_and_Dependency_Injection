package springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("myTennisCoachComponent")
public class TennisCoach implements Coach {

    @Autowired // Field injection
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    // Define a default constructor
    public TennisCoach() {
        System.out.println("Inside of default constructor");
    }

//    @Autowired // Injection by random method
//    public void doInjectionStuff(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }

//    @Autowired // Injection by setter method
//    public void setFortuneService(FortuneService fortuneService) {
//        System.out.println("Inside of set method");
//        this.fortuneService = fortuneService;
//    }

//    @Autowired // Injection by constructor
//    public TennisCoach(@Qualifier("randomFortuneService") FortuneService fortuneService) {// using qualifier in constructor
//        this.fortuneService = fortuneService;
//    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
