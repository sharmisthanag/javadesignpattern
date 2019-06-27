package behavioral.memento;

public class test {
    public static void main(String[] args) {
        EmployeeDemo employeeDemo=new EmployeeDemo("shar","123456789","sleeping");
        CareTaker careTaker=new CareTaker();
        careTaker.push(employeeDemo);
        System.out.println(employeeDemo);
        employeeDemo = new EmployeeDemo("shar","9876543","dancing");
        careTaker.push(employeeDemo);
        System.out.println(employeeDemo);
        employeeDemo = new EmployeeDemo("sharmistha","123456789","sleeping");
        careTaker.pop(employeeDemo);
        System.out.println(employeeDemo);
        careTaker.pop(employeeDemo);
        System.out.println(employeeDemo);

    }
}
