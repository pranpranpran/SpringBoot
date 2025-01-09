package org.example.mrityunjay;

public class Alien {
    private int age;
    private Laptop obj;

    public Alien(){
        System.out.println("Alien Object is created");
    }

    public Alien(int age, Laptop obj){
        System.out.println("param constructor is called");
        this.age = age;
        this.obj = obj;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void run(){
        obj.game();
    }

    public Laptop getObj() {
        return obj;
    }

    public void setObj(Laptop obj) {
        this.obj = obj;
    }
}
