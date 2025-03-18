package com.middleearth;

public class Main{
    public static void main(String[] args){
        Mentor gandalf = new Mentor("Gandalf", "The Grey");
        Mentor elrond = new Mentor("Elrond", "Lord of Rivendell");
        Adventurer frodo = new Adventurer("Frodo Baggins", "Ring Bearer", "Hobbit");
        Adventurer aragorn = new Adventurer("Aragorn", "King of Gondor", "Man");
        Adventurer legolas = new Adventurer(
                "Legolas",
                "Prince of Mirkwood",
                "Elf"
        );
        Adventurer gimli = new Adventurer("Gimli", "Son of Glóin", "Dwarf");
        Quest destroyRing = new Quest("Destroy the One Ring", 10);
        Quest defendHelmsDeep = new Quest("Defend Helm’s Deep", 8);
        gandalf.overseeQuest(destroyRing);
        elrond.overseeQuest(defendHelmsDeep);
        frodo.joinQuest(destroyRing);
        aragorn.joinQuest(defendHelmsDeep);
        legolas.joinQuest(defendHelmsDeep);
        gimli.joinQuest(defendHelmsDeep);
        System.out.println("Quests and their members:\n");
        System.out.println(destroyRing.getName() + " - Led by: "
                + destroyRing.getMentor().getName());
        for (Adventurer a : destroyRing.getAdventurers()){
            System.out.println("   -> " + a.getName() + " [" + a.getRace() + "]");
        }
        System.out.println("\n" + defendHelmsDeep.getName() + " - Led by: "
                + defendHelmsDeep.getMentor().getName());
        for (Adventurer a : defendHelmsDeep.getAdventurers()){
            System.out.println("   -> " + a.getName() + " [" + a.getRace() + "]");
        }
    }
}