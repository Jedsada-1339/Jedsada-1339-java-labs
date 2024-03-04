package sirikhojornsombut.jedsada.lab11;

import java.io.Serializable;
import java.util.ArrayList;

public class Player implements Serializable {
    String name;
    String nationality;
    String dob;
    String playerType; 
    String sex;
    ArrayList<String> hobbies;
    ArrayList<String> sports;
    int year;

    public Player(String name, String nationality) {
        this.name = name;
        this.nationality = nationality;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getSex(){
        return sex;
    }

    public String getNationality() {
        return nationality;
    }

    public String getDob() {
        return dob;
    }

    public String getPlayerType() {
        return playerType;
    }

    public ArrayList<String> getHobbies() {
        return hobbies;
    }

    public ArrayList<String> getSports() {
        return sports;
    }

    public int getYear() {
        return year;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setPlayerType(String playerType) {
        this.playerType = playerType;
    }

    public void setHobbies(ArrayList<String> hobbies) {
        this.hobbies = hobbies;
    }

    public void setSports(ArrayList<String> sports) {
        this.sports = sports;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setSex(String sex){
        this.sex = sex;
    }
}
