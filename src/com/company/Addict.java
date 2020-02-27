package com.company;

public abstract class Addict {
    private String levelOfDependence;
    private int age;
    private Drugs drugs;
    private String city;


    public Addict(String levelOfDependence, int age, Drugs drugs, String city) {
        this.levelOfDependence = levelOfDependence;
        this.age = age;
        this.drugs  = drugs;
        this.city = city;

    }




    public String getLevelOfDependence() {
        return levelOfDependence;
    }

    public int getAge() {
        return age;
    }

    public Drugs getDrugs() {
        return drugs;
    }

    public abstract String getCountry();

    public String getInfo(){
       return "Info " + levelOfDependence + age + drugs + city ;
}


}
