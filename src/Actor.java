import java.util.ArrayList;
import java.util.Objects;

public class Actor extends Person {
    private final int height;

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        if (!super.equals(actor)) return false;
        return height == actor.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), height);
    }

    @Override
    public String toString(){
        return name + " " + surname + " (" + height + " см)";
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
