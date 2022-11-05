package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("JPII",23,true));
        stamps.add(new Stamp("Lajka",18,false));
        stamps.add(new Stamp("Wałęsa",5,false));
        stamps.add(new Stamp("Lech Kaczyński z żoną",21,true));
        stamps.add(new Stamp("JPII",24,true));
        stamps.add(new Stamp("Mikołaj Kopernik",5,false));
        stamps.add(new Stamp("JPII",23,true));
        stamps.add(new Stamp("Mieszko I",8,false));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);


    }

}
