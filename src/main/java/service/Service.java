package service;

import entity.Person;

import java.util.Scanner;

public class Service {
    Scanner in = new Scanner(System.in);
    Person person = new Person();

    public void createPerson() {
        person.setName(in.nextLine());
        person.setAge(in.nextInt());
    }

    public void getPerson() {
        System.out.println(person.getPerson());
    }
}
