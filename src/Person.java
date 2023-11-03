import java.time.LocalDate;

public class Person {
    String firstName;
    String lastName;
    LocalDate dateOfBrith;

    public Person(String firstName, String lastName, LocalDate dateOfBrith){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBrith = dateOfBrith;
    }
}
