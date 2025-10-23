public class Theatre {

    public static void main(String[] args) {
        System.out.println("Поехали!");

        //создадим 3х актеров
        Actor funnyAlex     = new Actor("Алексей", "Потешный",Gender.MALE, 175);
        Actor beautifulSara = new Actor("Сара", "Полсон",Gender.FEMALE, 180);
        Actor strongDmitry  = new Actor("Дмитрий", "Бобров",Gender.MALE, 220);

        //создадим 2 режиссеров
        Director oldIgor    = new Director("Игорь", "Смирнов",Gender.MALE, 180);
        Director youngSveta = new Director("Светлана", "Усольцева",Gender.FEMALE, 7);

        //создадим обычное шоу
        Show simpleShow = new Show("Цирк гимнастов-акробатов",
                                    oldIgor,
                                    120);
        //добавим в него актеров
        simpleShow.addActorToShow(funnyAlex);
        simpleShow.addActorToShow(beautifulSara);

        //создадим оперу
        Opera operaLadyMacbeth = new Opera("Леди Макбет",
                                            youngSveta, 320,
                                    "Дмитрий Шостакович",
                                    "Леди Макбет Мценского уезда» / «Катерина Измайлова» — " +
                                                "опера Дмитрия Шостаковича в четырех действиях (девяти картинах); " +
                                                "либретто композитора и А. Прейса по повести Н. Лескова.",
                                    32);

        //добавим в неё актеров
        operaLadyMacbeth.addActorToShow(funnyAlex);
        operaLadyMacbeth.addActorToShow(beautifulSara);
        operaLadyMacbeth.addActorToShow(strongDmitry);

        //создадим балет
        Ballet balletZhizel = new Ballet("Жизель", oldIgor, 280,
                                               "Адольф Адан",
                                            "Сюжет балета прост: юный граф, будучи обручён с богатой " +
                                                    "невестой, влюбляется в крестьянку Жизель и, скрывая свой титул, " +
                                                    "под видом крестьянина ухаживает за ней. Влюблённый в Жизель " +
                                                    "лесничий раскрывает тайну графа, Жизель узнает о его неверности и, " +
                                                    "обезумев от горя, умирает.",
                                        "Жан Коралли и Жюль Перро");
        //добавим в него актеров
        balletZhizel.addActorToShow(beautifulSara);
        balletZhizel.addActorToShow(strongDmitry);


        //выводим списки актёров
        simpleShow.printListOfActors();
        operaLadyMacbeth.printListOfActors();
        balletZhizel.printListOfActors();

        //меняем в балете актёра (существующего)
        balletZhizel.replaceActorInShow("Бобров",funnyAlex);

        //ещё раз выводим актёров
        balletZhizel.printListOfActors();

        //заменяем не существующего актёра
        balletZhizel.replaceActorInShow("Хабенский",funnyAlex);

        //выводим либретто к балету
        balletZhizel.printLibrettoText();
        //выводим режиссёра балета
        balletZhizel.printDirector();

        //выводим либретто к опере
        operaLadyMacbeth.printLibrettoText();
        //выводим режиссёра оперы
        operaLadyMacbeth.printDirector();
    }
}
