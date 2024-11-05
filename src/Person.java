import java.time.LocalDate;

public class Person {
    public String name;
    public String surname;
    public int dateOfBirth;
    public char gender;

    public int getAge(){
        return 2024 - dateOfBirth;
    }

    public String getInfo() {
        return String.format("""
            Person:
            Name: %s
            Surname: %s
            DateOfBirth: %d
            Gender: %s
            """, name, surname, dateOfBirth, gender);
    }
}
