package com.kodilla;

public class User {
    public String name;
    public static int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;

    }
    public int getAge() {
        return age;
    }



    public static void main(String[] args) {
        User Ania = new User("Ania", 32);
        User Krzysiek = new User("Krzysiek", 23);
        User Wojtek = new User("Wojtek", 44);
        User Agnieszka = new User("Agnieszka", 34);

        User[] users = {Ania, Krzysiek, Wojtek, Agnieszka};

        int result = 0;
        for (int i = 0; i < users.length; i++) {
            result = result + users[i].age;
        }
        System.out.println(result);

 }



    }


