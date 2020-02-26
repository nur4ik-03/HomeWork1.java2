package com.company;

public class Main {

    public static void main(String[] args) {
        SnoopDogg snoopDogg = new SnoopDogg("Очень",48,"КАКАин","Snoop Dogg", "Калифорния");
        System.out.println(snoopDogg.getInfo());
        snoopDogg.sniff("КАКАин",5);

        Country country = new Country("USA","LSD");
        ZacEfron zacEfron = new ZacEfron("Средний",32,"LSD","Зак","Актер","Калифорния", country);
        System.out.println(zacEfron.getInfo());
        zacEfron.sniff("LSD",2);

        ZacEfron zacEfron2 = new ZacEfron("Средний",32,"LSD","Зак","гавно","Бишкек", country);
        System.out.println(zacEfron2.getInfo());
        zacEfron2.sniff(1);



    }



}
