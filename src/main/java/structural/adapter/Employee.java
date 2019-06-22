package structural.adapter;

public interface Employee {
    String getName();

    String getAddress();

    Integer getId();

    public default String getEmployeeDetails() {
        return "Employee: {" +
                "name: " + getName() +
                ", address: " + getAddress() +
                ", id: " + getId() + "}";

    }

}
