
package classroommanager;

import java.util.Random;

public abstract class Person {
    
    //Attributes
    private String name;
    private int age;
    private char gender; //M or F
    private boolean availability;
    
    private static Random random = new Random();
    private final String[] MALE_NAMES = {"Pepe", "Fernando", "Alberto", "Nacho", "Eustaquio"};
    private final String[] FEMALE_NAMES = {"Alicia", "Laura", "Clotilde", "Pepa", "Elena"};
    
    //Builders
    public Person() {
    }
    
    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    
    //Getters & Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (gender == 'M') {
            name = MALE_NAMES[Person.generateRandomNumber(0, 4)];
        }
        else {
            name = FEMALE_NAMES[Person.generateRandomNumber(0, 4)];
        }
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

    public void setGender() {
        if (Person.generateRandomNumber(0, 1) == 0)  {
            this.gender = 'M';
        }
        else {
            this.gender = 'F';
        }
    }

    public boolean isAvailability() {
        return availability;
    }
    
    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    //Static method to add random numbers. It has nothing to do with the person class
    public static int generateRandomNumber(int minimum, int maximum) {
        int aleatoryNum = random.nextInt(maximum - minimum + 1) + minimum;
        return aleatoryNum;
    }
    
    
}
