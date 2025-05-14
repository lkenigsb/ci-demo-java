package org.example;

public class Person
{
    private String name;
    private int age;

    public Person(final String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (!(obj instanceof Person)) return false;
        Person person = (Person) obj;
        return person.name.equals(this.name) && person.age == this.age;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((age == 0) ? 0 : age);
        return result;
    }
}
