package structural.adapter;

public class EmployeeLDAP_Adapter implements Employee {
    private EmployeeLDAP_Legacy employeeLDAP_legacy;
    public EmployeeLDAP_Adapter(EmployeeLDAP_Legacy employeeLDAP_legacy) {
        this.employeeLDAP_legacy = employeeLDAP_legacy;
    }

    @Override
    public String getName() {
        return this.employeeLDAP_legacy.getGivenName();
    }

    @Override
    public String getAddress() {
        return this.employeeLDAP_legacy.getGivenAddress();
    }

    @Override
    public Integer getId() {
        return this.employeeLDAP_legacy.getCn();
    }
}
