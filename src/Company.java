import java.time.LocalDate;

import static java.lang.StringTemplate.STR;

public class Company {
    String companyName;
    String country;
    LocalDate yearOfFoundation;
    String founder;
    Group[] groups;


    public Company(String companyName, String country, LocalDate yearOfFoundation, String founder, Group[] groups) {
        this.companyName = companyName;
        this.country = country;
        this.yearOfFoundation = yearOfFoundation;
        this.founder = founder;
        this.groups = groups;
    }

    public String getInfo() {
        return STR. """
                INFO
               Company name: \{ companyName }
               Country: \{ country }
               Year of foundation: \{ yearOfFoundation }
               Founder: \{ founder }
                """ ;
    }


}
