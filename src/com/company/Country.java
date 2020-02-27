package com.company;

public class Country extends Addict{
private String country;

    public Country(String levelOfDependence, int age, Drugs drugs, String city) {
        super(levelOfDependence, age, drugs, city);
    }

    @Override
    public String getCountry() {
        return country;
    }
    public String getInfo(){
        return "info" + country;
    }
}


