import java.util.ArrayList;
import java.util.Objects;

public class Actor extends Person {
    private final int height;

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    //Исправил equals, чтобы он опирался на поля имя, фамилия, рост
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;

        return actor.getName().equals(getName()) &&
                actor.getSurname().equals(getSurname()) &&
                height == actor.height;
    }
    //hashCode теперь так же опирается на имя, фамилию и рост
    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), height);
    }

    //Заменил обращение к полям родительского класса на get-методы
    @Override
    public String toString(){
        return getName() + " " + getSurname() + " (" + height + " см)";
    }


    public static int findIndexBySurname(ArrayList<Actor> actors, String surname) {
        for (int i = 0; i < actors.size(); i++) {
            if (actors.get(i).getSurname().equals(surname)) {
                return i; // Возвращаем индекс при совпадении
            }
        }
        return -1; // Не найдено
    }
}
