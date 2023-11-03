import java.time.LocalDate;

public class Group {
    String groupName;
    LocalDate startDate;
    Person mentor;

    public Group(String groupName, LocalDate startDate, Person mentor) {
        this.groupName = groupName;
        this.startDate = startDate;
        this.mentor = mentor;
    }


    public String getGroupInfo() {
        return "group name: " + this.groupName + " start date " + startDate + " \nmentor name " + mentor.firstName + " last name " + mentor.lastName +
                " date of birth " + mentor.dateOfBrith;
    }

}
