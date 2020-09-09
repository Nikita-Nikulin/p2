import java.util.Scanner;
public class Dog {

    String name;
    int age;

    public String toString() {
        String s ="Dog name - " + name + '\n' + "Age - " + age + '\n' + "Ecual human age = " + ageCalc();
        return s;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int ageCalc() {
        return age * 7;
    }

}
