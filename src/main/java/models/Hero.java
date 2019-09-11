package models;

import java.util.Objects;

public class Hero {

    private int id;
    private String name;
    private int age;
    private String power;
    private String weakness;
    private int squadId;

    public Hero(String name, int age, String power, String weakness, int squadId) {
        this.name = name;
        this.age = age;
        this.power = power;
        this.weakness = weakness;
        this.squadId = squadId;
    }
    public int getId() {
        return id;
    }

    public String getPower() {
        return power;
    }


    public String getName() {
        return name;
    }

    public int getSquadId() {
        return squadId;
    }


    public int getAge() {
        return age;
    }
    public String getWeakness() {
        return weakness;
    }
}
