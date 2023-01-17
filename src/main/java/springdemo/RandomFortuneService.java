package springdemo;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    // Create array of strings
    private String[] data = {
            "Beware of the wolf in sheep's clothing",
            "Diligence is the mother of good luck",
            "The journey is the reward"
    };

    // Create a random number generator
    private Random random = new Random();

    @Override
    public String getFortune() {

        // pick a random string from the array of strings
        int index = random.nextInt(data.length);
        String theFortune = data[index];

        return theFortune;
    }
}
