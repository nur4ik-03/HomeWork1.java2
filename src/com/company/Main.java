package com.company;

public class Main {

    public static void main(String[] args) {
        SnoopDogg snoopDogg = new SnoopDogg("Очень  ",48 , Drugs.COCAINE,"Snoop Dogg ", "Калифорния ");
        System.out.println(snoopDogg.getInfo());
        snoopDogg.sniff("КАКАин ",5);


        ZacEfron zacEfron = new ZacEfron("Средний ",32 ,Drugs.LSD,"Зак ","Актер ","Калифорния");
        System.out.println(zacEfron.getInfo());
        zacEfron.sniff("LSD ",2);

        ZacEfron zacEfron2 = new ZacEfron("Средний ",32 ,Drugs.LSD,"Зак ","гавно ","Бишкек ");
        System.out.println(zacEfron2.getInfo());
        zacEfron2.sniff(1);



    }



}
