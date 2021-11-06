package com.company;

public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String nu;
    String classes;
    double average;
    boolean isPass;

    Student (String name,String nu, String classes,Course c1, Course c2, Course c3) {
    this.name=name;
    this.nu=nu;
    this.classes=classes;
    this.c1=c1;
    this.c2=c2;
    this.c3=c3;
    this.average=(this.c1.note+this.c2.note+this.c3.note)/3.0;
    this.isPass=false;

    }

    public Student(String name, String nu, String classes, String tarih, String fizik, String biyoloji) {
    }

    void addBulkExamsNote(int note1,int note2,int note3){
        if(note1 >= 0 && note1<=100){
       this.c1.note=note1; }// c1.note kısmında ki note bizim course classından çektiğimiz bir değer
        if(note2 >= 0 && note2<=100){
       this.c2.note=note2;}
        if(note1 >= 0 && note1<=100){
        this.c3.note=note3;}
    }

    void isPass(){
        this.average =(this.c1.note+this.c2.note+this.c3.note)/3.0;
        if(this.average>55){
            System.out.println(this.name + " Sınıfı geçti");
            this.isPass=true;
        }else{
            System.out.println(this.name + " Sınıfta kaldı!\n");
            this.isPass=false;
        }
    }

void printNote(){
    System.out.println("******************************\n");
    System.out.println(this.name + "'nin " +this.c1.name+ " Notu: " +c1.note);
    System.out.println(this.name + "'nin " +this.c2.name+ " Notu: " +c2.note);
    System.out.println(this.name + "'nin " +this.c3.name+ " Notu: " +c3.note);
    System.out.println("Ortalaması: "+this.average);
}

}
