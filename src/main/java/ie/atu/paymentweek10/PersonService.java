package ie.atu.paymentweek10;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    public PersonService(PaymentClient paymentClient) {
        this.paymentClient = paymentClient;
    }

    private PaymentClient paymentClient;


    // Placeholder method to save a person (add to Db in the next two weeks)
    public void savePerson(Person person) {
        System.out.println("Person saved: " + person);
        String response = paymentClient.makePayment(person);
        System.out.println(response);
    }

    // Placeholder method to retrieve a person by employeeId
    public Person getPersonByEmployeeId(String employeeId) {
        // fetch data from a database in future lab
        // For simplicity, we return a dummy person here
        return new Person();
    }
}

