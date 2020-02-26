package com.company;

public abstract class Addict {
    private String levelOfDependence;
    private int age;
    private String drugs;
    private String city;

    public Addict(String levelOfDependence, int age, String drugs, String city) {
        this.levelOfDependence = levelOfDependence;
        this.age = age;
        this.drugs = drugs;
        this.city = city;
    }


    public String getLevelOfDependence() {
        return levelOfDependence;
    }

    public int getAge() {
        return age;
    }

    public String getDrugs() {
        return drugs;
    }

}
