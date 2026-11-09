package THREADQA.AutoTest.Bug;

public class TestCase {

    private int id;
    private String title;
    private String status;

    public TestCase(int id, String title, String status) {
        this.id = id;
        this.title = title;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getStatus() {
        return status;
    }
}
