package ie.atu.paymentweek10;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class PaymentWeek10Application {

    public static void main(String[] args) {
        SpringApplication.run(PaymentWeek10Application.class, args);
    }

}
