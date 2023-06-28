package com.project.Spring.DTO;

public class CustomerSaveDTO {

    private String customername;
    private String customeradd;
    private int mobile;

    public CustomerSaveDTO(String customername, String customeradd, int mobile) {
        this.customername = customername;
        this.customeradd = customeradd;
        this.mobile = mobile;
    }

    public CustomerSaveDTO() {
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

                ", customername='" + customername + '\'' +
                ", customeradd='" + customeradd + '\'' +
                ", mobile=" + mobile +
                '}';
    }

}
