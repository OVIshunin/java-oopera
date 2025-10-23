import java.util.ArrayList;

public class Opera  extends  MusicalShow{
    private int choirSize;

    public Opera(String title, Director director, int duration, String musicAuthor, String librettoText, int choirSize) {
        super(title, director, duration, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }
}
