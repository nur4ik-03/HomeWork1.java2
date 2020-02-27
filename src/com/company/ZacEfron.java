package com.company;

public final class ZacEfron extends SnoopDogg {
    private String name;
    private String profession;
    private Drugs drugs;

    public ZacEfron(String levelOfDependence, int age, Drugs drugs, String name, String profession, String City ) {
        super(levelOfDependence, age, drugs, name, City);
        this.profession = profession;

    }

    @Override
    public String getName() {
        return name;
    }

    public String getProfession() {
        return profession;
    }



    @Override
    public final String getInfo() {
        return super.getInfo() + name + " " + profession + drugs;
    }

}

