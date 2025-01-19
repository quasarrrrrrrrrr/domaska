package service;

import entity.Person;

import java.beans.PersistenceDelegate;
import java.util.Scanner;

public class Service {
    Scanner scanner = new Scanner(System.in);
    public void c(Person person) {
        if (person.getAlive()) {
            System.out.println("живой");
        } else {
            System.out.println("не живой");
        }
    }

    public void c1(boolean alive) {
        if (alive) {
            System.out.println("да");
        } else {
            System.out.println("нет");
        }
    }
    public void createPersonFromScanner(Person person){
        System.out.println("Введите имя");
        person.setName(scanner.nextLine());
        System.out.println("Возраст");
        person.setAge(scanner.nextInt());
        System.out.println("Введите пол");
        person.setGender(scanner.nextLine().charAt(0));
        System.out.println("Живой ли человек");
        person.setAlive(scanner.nextBoolean());
    }
    public void updatePersonName(Person person){
        System.out.println("Введите имя");
        person.setName(scanner.nextLine());
    }
    public void updatePersonAge(Person person){
        System.out.println("Возраст");
        person.setAge(scanner.nextInt());
    }
    public void updatePersonGender(Person person){
        System.out.println("Введите пол");
        person.setGender(scanner.nextLine().charAt(0));
    }
    public void updatePersonAlive(Person person){
        System.out.println("Живой ли человек");
        person.setAlive(scanner.nextBoolean());
    }
}
