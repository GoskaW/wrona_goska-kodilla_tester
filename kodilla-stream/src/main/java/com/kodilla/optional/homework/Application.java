package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Anna Kowalska", new Teacher("Robert Januszek")));
        students.add(new Student("Jan Wieczorek", new Teacher(null)));
        students.add(new Student("Roman Romański", new Teacher("Krzysztof Cezary")));
        students.add(new Student("Weronika Podsiadło", new Teacher(null)));


        for (Student student : students) {

            }


        }
   }
