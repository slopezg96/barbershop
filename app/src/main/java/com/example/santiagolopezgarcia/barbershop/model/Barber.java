package com.example.santiagolopezgarcia.barbershop.model;

/**
 * Created by santiagolopezgarcia on 6/13/17.
 */

public class Barber {

    private String name;
    private String lastName;
    private String description;

    public Barber() {
        name = "";
        lastName = "";
        description = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
