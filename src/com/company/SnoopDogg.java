package com.company;

public  class SnoopDogg extends Addict {
    private String name;
    private String country;


    public SnoopDogg(String levelOfDependence, int age, Drugs drugs, String name, String City) {
        super(levelOfDependence, age, drugs, City );
        this.name = name;


    }

    public String getName() {
        return name;
    }
    public final void sniff(String drugs , int quantity){
        for (int i = 0; i < quantity ; i++) {

        }
    }
    public void sniff(int quantity){
        for (int i = 0; i < quantity ; i++) {

        }
    }
    public void sniff(String drugs){
        System.out.println(drugs);
    }

    @Override
    public String getCountry() {
        return "info" + country;
    }

    public String getInfo(){
           return super.getInfo();
    }


}
