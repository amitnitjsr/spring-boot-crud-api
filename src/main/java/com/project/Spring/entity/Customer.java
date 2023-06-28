package com.project.Spring.entity;

import javax.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @Column(name = "customer_id", length = 50)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int customerid;

    @Column(name = "customer_name", length = 50)
    private String customername;
    @Column(name = "customer_add", length = 60)
    private String customeradd;
    @Column(name = "mobile", length = 12)
    private int mobile;


    public Customer() {
    }
    public Customer(String customername, String customeradd, int mobile) {
        this.customername = customername;
        this.customeradd = customeradd;
        this.mobile = mobile;
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
        return "Customer{" +
                "customerid=" + customerid +
                ", customername='" + customername + '\'' +
                ", customeradd='" + customeradd + '\'' +
                ", mobile=" + mobile +
                '}';
    }
}
