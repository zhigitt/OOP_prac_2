import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Aliaskar", "Temirbekov", LocalDate.of(2003, 03, 03));
        Person person2 = new Person("Zhigit", "Turumbekov", LocalDate.of(2003, 01, 02));

        Group group1 = new Group("java", LocalDate.of(2023, 01, 23), person1);
        Group group2 = new Group("js", LocalDate.of(2023, 02, 25), person2);

        Company company1 = new Company("Apple", "USA", LocalDate.of(1999, 03, 23), "Jobs", new Group[]{group1, group2});
        Company company2 = new Company("Facebook", "USA", LocalDate.of(1988, 03, 23), "Mark", new Group[]{group1, group2});

        Group[] massGroup = new Group[]{group1, group2};

        Company[] companies = {company1, company2};

        for (Company company : companies) {
            System.out.println(company.getInfo());

            for (Group group : company.groups) {
                System.out.println(group.getGroupInfo());
            }

        }




    }
}