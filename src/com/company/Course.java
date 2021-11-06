package com.company;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    double note;

    // Constructor oluşturalım. Constructor parametrelerini nesne parametrelerinin içinde tanımlayabilirz.

    Course(String name, String code, String prefix){
       this.name=name;
       this.code=code;
       this.prefix=prefix;
       this.teacher=teacher;
       double note=0; // Constructor içinde note'yi tanımlamadığımız için 0 olarak tanımladık.

    }
    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.name)){
            this.teacher=teacher;
        } else{
            System.out.println("Öğretmen ve Ders kısaltmaları uyuşmuyor");
        }

        this.teacher=teacher;
        printTeacherInfo();
    }

    void printTeacherInfo(){
        this.teacher.print();
    }

}
