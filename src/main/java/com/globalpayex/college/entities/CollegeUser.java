package com.globalpayex.college.entities;

public class CollegeUser {
    protected String name;
    protected char gender;

    public CollegeUser(String name, char gender) {
        this.name = name;
        this.setGender(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(char gender) {
        if(gender== 'm' || gender == 'f')
            this.gender = gender;
    }

    public char getGender() {
        return this.gender;
    }
    public String getDetails() {


        //better way rather than above
        return String.format(
                "Name: %s\nGender: %s",
                this.name,
                this.gender
        );
    }
}
