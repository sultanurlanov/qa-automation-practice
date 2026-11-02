package THREADQA.AutoTest.Bug;

public class Bug {

    private int id;
    private String title;
    private String severity;

    public Bug(int id, String title, String severity) {
        this.id = id;
        this.title = title;
        this.severity = severity;
    }

    public Bug() {

    }


    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    @Override
    public String toString() {
        return "Bug{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", severity='" + severity + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getSeverity() {
        return severity;
    }


}
