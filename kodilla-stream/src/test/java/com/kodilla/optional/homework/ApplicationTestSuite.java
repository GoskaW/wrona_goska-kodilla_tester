package com.kodilla.optional.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApplicationTestSuite {

    @Test
    public void testGetTeacherName() {
        Teacher teacher = new Teacher("Michał Żytkowski");
        Student student2 = new Student("Janina Bąk", teacher);

        Application.getTeacherName(student2);
        assertEquals(teacher, Application.getTeacherName(student2));
    }

    @Test
    public void testNoTeacher () {
        Student student = new Student ("Janina bąk", null);
        Application.getTeacherName(student);
        assertEquals("<undefined>", Application.getTeacherName(student));
    }
}
