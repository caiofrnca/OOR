package model;

public class Person {

    int age;
    String gender;
    String name;

    // Default Constructor
    public Person(){
        this.age = 18;
        this.gender = "Female";
        this.name = "Lara";
    }
   
    public Person(int age, String gender, String name) {
        this.age = age;
        this.gender = gender;
        this.name = name;
    }
    
    public String run(){
        return this.name + " is running";
    }
    
    public String walk(){
        return this.name + " is walking";
    }

    public int getAge(){
        return this.age;
    }
    
    public void setAge(int age){
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    public String toString(){
        return " Name: " + this.name + "\n" +
               " Gender: " + this.gender + "\n" +
               " Age: " + this.age + "\n" + "-------------------";
    }
    
    
}
