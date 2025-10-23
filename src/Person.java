import java.util.Objects;

public class Person {

    protected String name;

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return (name + ' ' + surname);
    }

    protected String surname;
    protected Gender gender;

    public Person(String name, String surname, Gender gender){
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(surname, person.surname) && gender == person.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, gender);
    }
}
