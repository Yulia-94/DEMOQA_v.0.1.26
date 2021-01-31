package com.telran.models;

public class StudentRegForm {
    private String fName;
    private String lName;
    private String email;
    private String gender;
    private String phone;
    private String bDay;
    private String subject;
    private String hoddies;
    private String picture;
    private String adress;
    private String state;
    private String city;

    public StudentRegForm withPicture(String picture) {
        this.picture = picture;
        return this;
    }

    public StudentRegForm withfName(String fName) {
        this.fName = fName;
        return this;
    }

    public StudentRegForm withlName(String lName) {
        this.lName = lName;
        return this;
    }

    public StudentRegForm withEmail(String email) {
        this.email = email;
        return this;
    }

    public StudentRegForm withGender(String gender) {
        this.gender = gender;
        return this;
    }

    public StudentRegForm withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public StudentRegForm withbDay(String bDay) {
        this.bDay = bDay;
        return this;
    }

    public StudentRegForm withSubject(String subject) {
        this.subject = subject;
        return this;
    }

    public StudentRegForm withHoddies(String hoddies) {
        this.hoddies = hoddies;
        return this;
    }

    public StudentRegForm withAdress(String adress) {
        this.adress = adress;
        return this;
    }

    public StudentRegForm withState(String state) {
        this.state = state;
        return this;
    }

    public StudentRegForm withCity(String city) {
        this.city = city;
        return this;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public String getPhone() {
        return phone;
    }

    public String getbDay() {
        return bDay;
    }

    public String getSubject() {
        return subject;
    }

    public String getHoddies() {
        return hoddies;
    }

    public String getPicture() {
        return picture;
    }

    public String getAdress() {
        return adress;
    }

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }
}
