package com.zipcodewilmington.person;

/**
 * If you did ObjectsOne lab, you might recognize this code?
 */
public class Person {
    private String name;
    private int age;
    private String gender;
    private int height;
    private String favColor;


    public Person(String name, int age, String gender, int height, String favColor) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.favColor = favColor;
    }

    public Person() {
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }
    public Person(String favColor){
        this.favColor = favColor;
    }

    public Person(String name, int age) {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }


    public String getGender() {
        return gender;
    }


    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setFavColor(String favColor) {
        this.favColor = favColor;
    }

    public int getHeight() {
        return height;
    }

    public String getFavColor() {
        return favColor;
    }

    public static void main(String[] args) {
        Person p=new Person();
    }
}




