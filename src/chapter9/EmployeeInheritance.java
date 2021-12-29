package chapter9;

public class EmployeeInheritance extends PersonInheritance{

    private String id;
    private String title;

    public EmployeeInheritance() {
        super("testing");
        System.out.println("In Employee default constructor");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


}
