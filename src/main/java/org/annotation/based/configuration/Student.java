package org.annotation.based.configuration;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

    @Value("100")
    int id;
    @Value("1000")
    int roll;
    @Value("Neeraj")
    String name;

    public Student(int id, int roll, String name) {
        this.id = id;
        this.roll = roll;
        this.name = name;
    }

    public Student() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", roll=" + roll +
                ", name='" + name + '\'' +
                '}';
    }
}