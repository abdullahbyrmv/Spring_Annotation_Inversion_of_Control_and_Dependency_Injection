package springdemo;

import org.springframework.stereotype.Component;

@Component("myTennisCoachComponent")
public class TennisCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }
}
