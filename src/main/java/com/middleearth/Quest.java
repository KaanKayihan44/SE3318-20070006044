package com.middleearth;

import java.util.ArrayList;
import java.util.List;

public class Quest{
    private String name;
    private int difficulty;
    private Mentor mentor;
    private List<Adventurer> adventurers;
    public Quest(String name, int difficulty){
        this.name=name;
        this.difficulty=difficulty;
        this.adventurers = new ArrayList<>();
    }
    public void setMentor(Mentor mentor){
        this.mentor = mentor;
    }
    public void addAdventurer(Adventurer adventurer){
        adventurers.add(adventurer);
    }
    public String getName(){
        return name;
    }
    public int getDifficulty(){
        return difficulty;
    }
    public Mentor getMentor(){
        return mentor;
    }
    public List<Adventurer> getAdventurers(){
        return adventurers;
    }
}
