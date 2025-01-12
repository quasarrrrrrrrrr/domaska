package org.example;

import entity.Person;
import service.Service;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();
        service.createPerson();
    }
}