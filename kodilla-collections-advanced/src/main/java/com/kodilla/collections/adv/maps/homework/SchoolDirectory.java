package com.kodilla.collections.adv.maps.homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> list = new HashMap<>();
        Principal sniadecki = new Principal("John ", "Stevenson ", "Sniadeckiego ");
        Principal zeromski = new Principal("Kazimierz ", "Tetmajer ", "Żeromskiego ");
        Principal wybicki = new Principal("Anna ", "Kowalska ", "Wybickiego ");
        Principal sawicka = new Principal("Grażyna ", "Torbicka ", "Sawickiej ");
        Principal sciegienny = new Principal("Elonora ", "Stevenson ", "Ściegiennego ");
        Principal kochanowski = new Principal("Robert ", "Miskiewicz ", "Kochanowskiego ");

        School sniadeckiStudents = new School(Arrays.asList(30, 28, 28, 32, 29, 28, 30));
        School zeromskiStudents = new School(Arrays.asList(29, 28, 28, 19, 30));
        School wybickiStudents = new School(Arrays.asList(28, 32, 24, 29, 28, 28));
        School sawickaStudents = new School(Arrays.asList(30, 28, 28, 32, 29, 28, 30));
        School sciegiennyStudents = new School(Arrays.asList(29, 21, 28, 25, 29, 28, 29));
        School kochanowskiStudents = new School(Arrays.asList(25, 28, 22, 32, 29, 30));

        list.put(sniadecki, sniadeckiStudents);
        list.put(zeromski, zeromskiStudents);
        list.put(wybicki, wybickiStudents);
        list.put(sawicka, sawickaStudents);
        list.put(sciegienny, sciegiennyStudents);
        list.put(kochanowski, kochanowskiStudents);

        for (Map.Entry<Principal, School> principalEntry : list.entrySet()) {
            System.out.println(principalEntry.getKey().getFirstName() + principalEntry.getKey().getLastName() + "school " + principalEntry.getKey().getNameSchool() + ", students "

                    + principalEntry.getValue().getSum());


        }
    }
}
