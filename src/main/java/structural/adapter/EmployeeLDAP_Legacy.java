package structural.adapter;

public class EmployeeLDAP_Legacy {
    private Integer cn;
    private String givenName;
    private String givenAddress;

    public EmployeeLDAP_Legacy(Integer cn, String givenName, String givenAddress) {
        this.cn = cn;
        this.givenName = givenName;
        this.givenAddress = givenAddress;
    }

    public Integer getCn() {
        return cn;
    }

    public void setCn(Integer cn) {
        this.cn = cn;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getGivenAddress() {
        return givenAddress;
    }

    public void setGivenAddress(String givenAddress) {
        this.givenAddress = givenAddress;
    }
}
