package sidespell.tech.viewholderquiz.model;

/**
 * Created by JustineYrvin on 1/14/2016.
 */
public class ListViewModel {
    String title;
    String genre;
    int poster;

    public ListViewModel(String title, String genre, int poster) {
        this.title = title;
        this.genre = genre;
        this.poster = poster;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPoster() {
        return poster;
    }

    public void setPoster(int poster) {
        this.poster = poster;
    }
}
