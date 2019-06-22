package structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {
    private List<Employee> employeeList=new ArrayList<>();
    public List<Employee> getEmployeeList(){
        employeeList.add(getEmployeeDB());
        employeeList.add(getEmployeeLDAP());
        return employeeList;
    }

    private Employee getEmployeeLDAP() {
        return new EmployeeLDAP_Adapter(new EmployeeLDAP_Legacy(1,"rit","Bang"));
    }

    private Employee getEmployeeDB() {
        return new EmployeeDB("shar","Kol",1);
    }

}
