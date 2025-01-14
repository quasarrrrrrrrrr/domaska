package entity;


public class Person {
    private String name;
    private int age;
    private char gender;
    private boolean alive;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public boolean getAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public String getPerson() {
        return "name:" + name + ",age:" + age + ",gender:" + gender + ",alive:" + alive;
    }
}