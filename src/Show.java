import java.util.ArrayList;

public class Show {

    protected final String title;
    private final Director director;
    private final int duration;
    private ArrayList<Actor> listOfActors;

    /*Сначала хотелось реализовать конструктор сразу со списком актеров,
    но он не может быть final, поскольку есть опции добавления и замены актеров.
    Поэтому исключил из конструктора заполнение списка, оставив лишь инициализацию.
    Добавление происходит через отдельный метод
     */
    public Show(String title, Director director, int duration) {
        this.title = title;
        this.director = director;
        this.duration = duration;
        System.out.println("Создана постановка " + title);
        listOfActors = new ArrayList<>();
    }

    //вывести список актеров постановки
    public void printListOfActors(){
        System.out.println("Список актёров постановки '" + title + "' (режиссер -  " + director.toString() + ") :");
        for (Actor actor : listOfActors){
            System.out.println(actor);
        }
    }

    //добавить актёра в постановку, если его ещё нет
    public void addActorToShow(Actor actor){
        if (!(listOfActors.contains(actor))) {
            listOfActors.add(actor);
            System.out.println("Добавлен актёр:" + actor);
        }  else  {
            System.out.println("Актёр " + actor + "уже участвует в этом шоу");
        }
    }

    //заменить актёра, если такой есть, на другого

    /*поскольку методы hashCode и equals уже переопределены для сравнения актеров при добавлении,
    для поиска по фамилии - реализовал статический метод в классе Actor, который ищет индекс актера
    с нужной фамилией в списке актёров
     */

    public  void  replaceActorInShow(String lastActor, Actor newActor){
        if (Actor.findIndexBySurname(listOfActors,lastActor) == -1 ) {
            System.out.println("Указанного актёра с фамилией " + lastActor + " нет в шоу, заменить его невозможно.");
        }  else  {
            listOfActors.set(Actor.findIndexBySurname(listOfActors,lastActor),newActor);
            System.out.println("Актёр " + lastActor + " был успешно заменён на актёра - " + newActor);
        }
    }

    public void printDirector(){
        System.out.println("Режиссер: " + director);
    }



}
