package behavioral.memento;

public class EmployeeDemo {
    private String name;
    private String id;
    private String hobby;

    @Override
    public String toString() {
        return "EmployeeDemo{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", hobby='" + hobby + '\'' +
                '}';
    }

    public EmployeeDemo(String name, String id, String hobby) {
        this.name = name;
        this.id = id;
        this.hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public EmployeeDemoMemento save(){
        return new EmployeeDemoMemento(this.name,this.id);
    }

    public void revertIt(EmployeeDemoMemento e){
        this.name = e.getName();
        this.id=e.getId();
        this.hobby = "";
    }
}
