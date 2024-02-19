package OOP;

import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Patient {
    private String name;
    private String surname;
    private String group;
    private String blood;
    private ArrayList<String> card = new ArrayList<>();
    public Patient(String name, String surname, String group, String blood){
        this.name = name;
        this.surname = surname;
        this.blood = blood;
        this.group = group;
    }

    public Patient(String name, String surname, String group, String blood, ArrayList<String> card){
        this.name = name;
        this.surname = surname;
        this.blood = blood;
        this.group = group;
        this.card = card;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getGroup() {
        return group;
    }

    public String getBlood() {
        return blood;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public void setCard(ArrayList<String> card) {
        this.card = card;
    }
    public void addCard(String notes){
        card.add(notes);
    }

    public ArrayList<String> getCard() {
        return card;
    }

    public boolean visitDoctor(String notes) {
        Random random = new Random();
        int visit = random.nextInt(2);
        if (visit == 1) {
            card.add(notes);
            return true;
        } else
            return false;
    }

    public boolean checkup(String needCheckup) {
        if (needCheckup.equalsIgnoreCase("yes")) {
            return true;
        } else
            return false;
    }
    //todo other methods
}