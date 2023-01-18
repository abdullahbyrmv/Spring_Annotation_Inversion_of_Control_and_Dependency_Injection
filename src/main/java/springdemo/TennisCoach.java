package springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("myTennisCoachComponent")
@Scope("singleton")
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

    // Define my init method
    @PostConstruct
    public void doMyStartupStuff() {
        System.out.println("TennisCoach : Inside method doMyStartupStuff");
    }

    // Define my destroy method
    @PreDestroy
    public void doMyCleanupStuff() {
        System.out.println("TennisCoach : Inside method doMyCleanupStuff");
    }
}
