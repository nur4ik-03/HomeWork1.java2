package com.company;

public  class SnoopDogg extends Addict {
    private String name;


    public SnoopDogg(String levelOfDependence, int age, String drugs, String name, String City) {
        super(levelOfDependence, age, drugs, City);
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
    public String getInfo(){
            return "Info " + name;
    }
}
