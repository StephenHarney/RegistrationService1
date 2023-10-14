package ie.atu.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class RegistrationService1Application {

    public static void main(String[] args) {
        SpringApplication.run(RegistrationService1Application.class, args);
    }

}
