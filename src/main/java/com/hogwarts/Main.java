package com.hogwarts;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HogwartsStudent harry = new HogwartsStudent("Harry Potter","Gryffindor",5);
        HogwartsStudent draco = new HogwartsStudent("Draco Malfoy","Slytherin",5);
        HogwartsStudent hermione = new HogwartsStudent("Hermione Granger","Gryffindor",5);

        harry.learnSpell("Expelliarmus");
        draco.learnSpell("Crucio");
        hermione.learnSpell("Alohomora");

        WizardExam exam = new WizardExam(Arrays.asList("Expelliarmus","Alohomora"));
        exam.evaluate(harry);
        exam.evaluate(hermione);
        Duel.start(harry,draco,"Expelliarmus");
        Duel.start(harry,hermione,"Alohomora");
    }
}