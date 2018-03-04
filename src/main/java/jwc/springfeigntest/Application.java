package jwc.springfeigntest;

import jwc.springfeigntest.client.GreetingClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(defaultConfiguration = FeignConfiguration.class)
public class Application implements CommandLineRunner {

    @Autowired
    private GreetingClient greetingClient;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... strings) {
        System.out.println(greetingClient.greeting(null).toString());
        System.out.println(greetingClient.greeting("").toString());
        System.out.println(greetingClient.greeting("Bob").toString());
    }

}
