package com.astontech.hr.domain;

import javax.persistence.*;

/**
 * Created by Jerry.Kelsay on 3/14/2017.
 */
@Entity
public class Test {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "TestId")
    private Integer id;

    @Version
    private Integer Version;

    private String firstName;
    private String lastName;
    private String address;
    private Integer zipCode;
    private long phoneNumber;

    public Test() {}

    public Test(String string) {
        this.setFirstName(string);
        this.setLastName(string);
        this.setAddress(string);
    }

    public Test(Integer i){
        this.setZipCode(i);
    }

    public Test(String firstName, String lastName) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }

    public Test(String firstname, String lastName, Integer zipCode, long phoneNumber) {
        this.setFirstName(firstname);
        this.setLastName(lastName);
        this.setZipCode(zipCode);
        this.setPhoneNumber(phoneNumber);
    }

    public Test(String firstname, String lastName, String address, Integer zipCode, long phoneNumber) {
        this.setFirstName(firstname);
        this.setLastName(lastName);
        this.setAddress(address);
        this.setZipCode(zipCode);
        this.setPhoneNumber(phoneNumber);
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVersion() {
        return Version;
    }

    public void setVersion(Integer version) {
        Version = version;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getZipCode() {
        return zipCode;
    }

    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
