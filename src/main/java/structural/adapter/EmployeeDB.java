package structural.adapter;

public class EmployeeDB implements Employee {
    private String empName;
    private String empAdd;
    private Integer empId;

    public EmployeeDB(String empName, String empAdd, Integer empId) {
        this.empName = empName;
        this.empAdd = empAdd;
        this.empId = empId;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpAdd(String empAdd) {
        this.empAdd = empAdd;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpAdd() {
        return empAdd;
    }

    public Integer getEmpId() {
        return empId;
    }

    @Override
    public String getName() {
        return getEmpName();
    }

    @Override
    public String getAddress() {
        return getEmpAdd();
    }

    @Override
    public Integer getId() {
        return getEmpId();
    }
}
