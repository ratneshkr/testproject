package com.nabil.customer;

public class CustomerReg {

    private static int customerId = 1001;
    private String name;
    private String address;
    private String gender;

    public static int getCustomerId() {
        return (++customerId);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}
