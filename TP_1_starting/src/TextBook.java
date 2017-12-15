/**
 * @author maya5348
 *
 */
public class TextBook {
    String Id;
    String Title;

    public TextBook(String id, String title) {
        Id = id;
        Title = title;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }
}
