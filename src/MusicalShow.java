import java.util.ArrayList;

public class MusicalShow extends Show {

    protected String musicAuthor;
    protected String librettoText;

    public MusicalShow(String title, Director director, int duration, String musicAuthor, String librettoText) {
        super(title, director, duration);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public void printLibrettoText(){
        System.out.println("Либретто постановки '" + title + "' :");
        System.out.println(librettoText);
    }
}
