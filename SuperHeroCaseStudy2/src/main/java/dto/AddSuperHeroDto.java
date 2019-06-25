package dto;

import java.util.ArrayList;

public class AddSuperHeroDto {
    private String SuperName;
    private String RealName;
    private ArrayList<String> powers;
    private int age;
    private char sex;
    private double weight;
    private double height;
    private String teamname;

    public AddSuperHeroDto() {
        super();
    }

    public AddSuperHeroDto(String SuperName, String RealName, ArrayList<String>powers, int age, double height, double weight, char sex, String teamname) {
        super();

        this.SuperName = SuperName;
        this.RealName = RealName;
        this.powers = powers;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.sex = sex;
        this.teamname = teamname;
    }

    public String getSupername() {
        return SuperName;
    }

   // public String getSuperTeam(){ return SuperTeam;}

    public void setSupername(String supername) {
        SuperName = supername;
    }

    public String getRealName() {
        return RealName;
    }

    public void setRealName(String realName) {
        RealName = realName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public ArrayList<String> getPowers() {
        return powers;
    }

    public void setPowers(ArrayList<String> powers) {
        this.powers = powers;
    }

    public String getTeamname() {
        return teamname;
    }

    public void setTeamname(String teamname) {
        this.teamname = teamname;
    }
}

