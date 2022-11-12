package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
            Teacher teacher1 = new Teacher("Adam Kowalski");
            Teacher teacher2 = new Teacher("Bożena Nowak");
            Teacher teacher3 = new Teacher("Jan Borysiewicz");

            List<Student> students = new ArrayList<>();
            students.add(new Student ("Żytomir Kowalski", teacher1));
            students.add(new Student ("Anna Spaśna", null));
            students.add(new Student ("Weronika Kulczyk", teacher2));
            students.add(new Student ("Michał Workowy", teacher3));
            students.add(new Student ("Lucjan Nowak", null));

            Optional<Teacher> optionalTeacher = Optional.ofNullable(teacher1);
            String teachername = optionalTeacher.orElse(new Teacher("undefinied")).getName();

            for(Student student : students) {
                System.out.println("uczeń: " + student.getName() + ", nauczyciel:" + student.getTeacher());
            }

            }
                                                                                            // coś tu poszło nie tak.
                                                                                                // potrzebuję metody, która będzie zwracać

        }

