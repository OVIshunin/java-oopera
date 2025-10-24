public class Director extends Person {
    private int numberOfShows;

    public Director(String name, String surname, Gender gender, int numberOfShows) {
        super(name, surname, gender);
        this.numberOfShows = numberOfShows;
    }

    //исправил прямой доступ к полям родительского класса на get-методы
    @Override
    public String toString(){
        return getName() + " " + getSurname();
    }
}
