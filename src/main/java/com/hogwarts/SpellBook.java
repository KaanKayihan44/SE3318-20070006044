package com.hogwarts;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class SpellBook {
    private List<String> spells;
    public SpellBook(){
        this.spells = new ArrayList<>();
    }
    public void addSpell(String spell){
        if (spell !=null && !spells.contains(spell)){
            spells.add(spell);
        }
    }
    public String getSpell(int index){
        if(index>=0&&index<spells.size()){
            return spells.get(index);
        }
        return null;
    }
    public List<String> getSpellsByPrefix(String prefix){
        return spells.stream().filter(spell->spell.startsWith(prefix)).collect(Collectors.toList());
    }
}
