package structural.adapter;

public class AdapterDemo {
    public static void main(String[] args) {
        EmployeeClient employeeClient=new EmployeeClient();
        employeeClient.getEmployeeList().stream().forEach(employee -> System.out.println(employee.getEmployeeDetails()));
    }
}
