package gdpr.filter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
@Component
public class Main implements CommandLineRunner {
    @Autowired
    private BusinessLogicService businessLogicService;

    public static void main(String... args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) {
        System.out.println("Starting Application...");
        UserEntity entity = businessLogicService.sharePersonalData();
        System.out.println("Returned email - "+entity.getEmail());
    }
}
