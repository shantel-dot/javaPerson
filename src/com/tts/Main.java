package com.tts;

import human.Athlete;
import human.Person;

public class Main {

    public static void main(String[] args) {

        Person firstPerson = new Person();
        firstPerson.setName("Shantel");
        firstPerson.setAge(17);

        Person secondPerson = new Person();
        secondPerson.setName("");
        secondPerson.setAge(21);

        Athlete runner= new Athlete();
        runner.run("Runner is walking really fast");

        System.out.println(firstPerson.getName());
        System.out.println(runner);
    }
}
