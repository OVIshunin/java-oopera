import java.util.ArrayList;

public class Ballet extends MusicalShow{
    private String choreographer;

    public Ballet(String title, Director director, int duration, String musicAuthor, String librettoText, String choreographer) {
        super(title, director, duration,  musicAuthor, librettoText);
        this.choreographer = choreographer;
    }

}
