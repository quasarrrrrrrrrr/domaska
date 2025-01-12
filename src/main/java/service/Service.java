package service;

import entity.Person;

import java.util.Scanner;

public class Service {
    public void createPerson(){
        Scanner in = new Scanner(System.in);
        Person person = new Person();
        person.setName(in.nextLine());
        person.setAge(in.nextInt());
        person.setPhoneNumber(in.nextInt());
        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getPhoneNumber());
    }

}
