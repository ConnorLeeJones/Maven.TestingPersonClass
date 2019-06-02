package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private String hairColor;
    private String ssn;
    private String address;
    private String occupation;
    private String phoneNumber;


    public Person() {
        this.name = "";
        this.age = Integer.MAX_VALUE;
        this.hairColor = "";
        this.ssn = "";
        this.address = "";
        this.occupation = "";
        this.phoneNumber = "";
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, String hairColor, String ssn, String address, String occupation, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.hairColor = hairColor;
        this.ssn = ssn;
        this.address = address;
        this.occupation = occupation;
        this.phoneNumber = phoneNumber;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }


    public void setSsn(String ssn) {
        this.ssn = ssn;
    }



    public void setAddress(String address) {
        this.address = address;
    }



    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }



    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }




    public String getHairColor() {
        return hairColor;
    }

    public String getSsn() {
        return ssn;
    }


    public String getAddress() {
        return address;
    }

    public String getOccupation() {
        return occupation;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }



    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
