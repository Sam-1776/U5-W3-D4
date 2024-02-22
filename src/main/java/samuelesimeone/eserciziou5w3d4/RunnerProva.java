package samuelesimeone.eserciziou5w3d4;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class RunnerProva implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        User user = new User("Andrea", "Sportillo");
        System.out.println(user.firmaUser());
    }
}
