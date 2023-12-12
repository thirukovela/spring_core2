package org.example;

public class School {
    private String schoolname;
    private String city;
    private String state;
    private int pincode;

    public School() {
    }

    public School(String schoolname, String city, String state, int pincode) {
        this.schoolname = schoolname;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }

    public String getSchoolname() {
        return schoolname;
    }

    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "School{" +
                "schoolname='" + schoolname + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", pincode=" + pincode +
                '}';
    }
}
