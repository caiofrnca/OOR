
package model;

public class Dog {
    
    private String breed;
    private int age;
    
public Dog(){
    this.breed = "Bull Terrier";
    this.age = 2;
}

public Dog(String breed, int age){
    this.breed = breed;
    this.age = age;
}

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString(){
        return "This is a " + this.breed + " dog, and it is " + this.age + " years old" + "\n" + "-------------------";
    }
    
}
