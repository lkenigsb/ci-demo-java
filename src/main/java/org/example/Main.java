package org.example;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Person libby = new Person("Libby", 21);
        Person libby2 = new Person("Libby", 21);
        Person libby3 = new Person("Libby", 23);

        HashMap<Person, String> hashMap = new HashMap<>();

        hashMap.put(libby, "NewGrad");
        hashMap.put(libby2, "Developer");
        hashMap.put(libby3, "NewGrad");

        System.out.println(hashMap.get(libby));

        System.out.println(hashMap.get(libby2));

        System.out.println(libby == libby2);
        System.out.println(libby.equals(libby2));

        System.out.println(hashMap.get(libby3));
    }
}