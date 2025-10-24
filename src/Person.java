import java.util.Objects;

public class Person {

    private String name;
    private String surname;
    private Gender gender;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return (name + ' ' + surname);
    }



    public Person(String name, String surname, Gender gender){
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        //Убрал gender из метода
        return Objects.equals(name, person.name) && Objects.equals(surname, person.surname);
    }

    @Override
    public int hashCode() {
        //Убрал gender из метода
        return Objects.hash(name, surname);
    }
}
