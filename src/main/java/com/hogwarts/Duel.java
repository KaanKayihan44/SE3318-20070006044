package com.hogwarts;
import java.util.Random;

public class Duel {
    public static void start(HogwartsStudent s1, HogwartsStudent s2,String spell){
        if(!s1.knowsSpell(spell)&&!s2.knowsSpell(spell)){
            System.out.println("Draw. Both of the duelist doesn't know the spell.");
        }else if(s1.knowsSpell(spell)&&!s2.knowsSpell(spell)){
            System.out.println(s1.getName()+" wins.");
        }else if(!s1.knowsSpell(spell)&&s2.knowsSpell(spell)){
            System.out.println(s2.getName()+" wins.");
        }else{
            Random rand = new Random();
            if(rand.nextBoolean()){
                System.out.println(s1.getName()+" wins.");
            }else{
                System.out.println(s2.getName()+" wins.");
            }
        }
    }
}
