package com.project.Spring.DTO;

public class CustomerUpdateDTO {

    private int customerid;
    private String customername;
    private String customeradd;
    private int mobile;

    public CustomerUpdateDTO(int customerid, String customername, String customeradd, int mobile) {
        this.customerid = customerid;
        this.customername = customername;
        this.customeradd = customeradd;
        this.mobile = mobile;
    }

    public CustomerUpdateDTO() {
    }

    public int getCustomerid() {
        return customerid;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public String getCustomeradd() {
        return customeradd;
    }

    public void setCustomeradd(String customeradd) {
        this.customeradd = customeradd;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "customerid=" + customerid +
                ", customername='" + customername + '\'' +
                ", customeradd='" + customeradd + '\'' +
                ", mobile=" + mobile +
                '}';
    }
}
