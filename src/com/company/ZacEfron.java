package com.company;

public final class ZacEfron extends SnoopDogg {
    private String name;
    private String profession;
    private Country country;

    public ZacEfron(String levelOfDependence, int age, String cocoino, String name, String profession, String City, Country country) {
        super(levelOfDependence, age, cocoino, name, City);
        this.profession = profession;
        this.country = country;
    }

    @Override
    public String getName() {
        return name;
    }

    public String getProfession() {
        return profession;
    }

    public Country getCountry() {
        return country;
    }

    @Override
    public final String getInfo() {
        return super.getInfo() + name + " " + profession + " " + country;
    }
}

