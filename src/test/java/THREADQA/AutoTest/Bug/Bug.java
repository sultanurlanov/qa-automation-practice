package THREADQA.AutoTest.Bug;

public class Bug {

    private String title;
    private String severity;
    private int priority;

    public Bug(String title, String severity, int priority) {
        this.title = title;
        this.severity = severity;
        this.priority = priority;
    }

    public String getTitle() {
        return title;
    }

    public String getSeverity() {
        return severity;
    }

    public int getPriority() {
        return priority;
    }
}
