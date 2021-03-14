package oor;

import model.Person;
import model.Dog;
import model.Car;

public class OOR {

    public static void main(String[] args) {

        Person p1 = new Person();
        Person p2 = new Person(33, "Male", "Caio");

        Car c1 = new Car();
        Car c2 = new Car("Wolkswagem", "red");

        Dog d1 = new Dog();
        Dog d2 = new Dog("Poodle", 7);

        System.out.println(p1);
        System.out.println(p2);

        System.out.println(c1);
        System.out.println(c2);

        System.out.println(d1);
        System.out.println(d2);
        d2.setBreed("Mixed");

    }

}
