package com.hogwarts;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.List;

public class MagicClasroom {
    private List<HogwartsStudent> students;
    public MagicClasroom(){
        this.students = new ArrayList<>();
    }
    public void addStudent(HogwartsStudent student){
        if(student !=null){
            students.add(student);
        }
    }
    public HogwartsStudent findStudent(String name){
        for(HogwartsStudent student : students){
            if(student.getName().equals(name)){
                return student;
            }
        }
        return null;
    }
    public HogwartsStudent findStudentBySpell(String spell){
        for(HogwartsStudent student : students){
            if(student.knowsSpell(spell)){
                return student;
            }
        }
        return null;
    }
}
