package dto;

import java.util.ArrayList;

public class SuperHero {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;

    public SuperHero(int id, String superName, String realName, ArrayList<String> powers, int age, double height, double weight, char sex, SuperTeam team) {
        this.id = id;
        SuperName = superName;
        RealName = realName;
        this.powers = powers;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.sex = sex;
        this.team = team;
    }

    private String SuperName;
    private String RealName;
    private ArrayList<String> powers;
    private int age;
    private double height;
    private double weight;
    private char sex;
    private SuperTeam team;
    public SuperHero() {
        super();
    }

    public SuperHero(String superName, String realName, ArrayList<String> powers, int age, double height, double weight, char sex, SuperTeam team) {
        SuperName = superName;
        RealName = realName;
        this.powers = powers;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.sex = sex;
        this.team =team;
    }

    public String getSuperName() {
        return SuperName;
    }

    public void setSuperName(String superName) {
        SuperName = superName;
    }

    public String getRealName() {
        return RealName;
    }

    public void setRealName(String realName) {
        RealName = realName;
    }

    public ArrayList<String> getPowers() {
        return powers;
    }

    public void setPowers(ArrayList<String> powers) {
        this.powers = powers;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public SuperTeam getTeam() {
        return team;
    }

    public void setTeam(SuperTeam team) {
        this.team = team;
    }
    public String toString (){
        return SuperName+": "+team.getTeamName();
    }

}

