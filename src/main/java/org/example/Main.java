package org.example;

import entity.Person;
import service.Service;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Igor");
        person.setAge(27);
        person.setGender('m');
        person.setAlive(false);
        System.out.println(person.getPerson());


        int i = 0;
        while (i != 11) {
            System.out.println(i);
            i++;
        }
        for (int o = 0; o < 10; o++){
            System.out.println(o);
        }
    }
}