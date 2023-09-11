package th.mfu;

import java.util.Date;

public class Concert {
    private int id;
    private String title;
    private String description;
    private String performar;
    private Date date;

    public Concert() {
    }

    public Concert(String title, String description) {
        // TODO: set attributes
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        // TODO: return title
        return title;
    }

    public String getDescription() {
        // TODO: return description
        return description;
    }

    // TODO: add getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPerformer() {
        return performar;
    }

    public void setPerformer(String performer) {
        this.performar = performer;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}