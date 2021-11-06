package com.company;

public class Main {

    public static void main(String[] args) {
   Teacher t1 = new Teacher( "Murat Hoca","9086567","Tarih");
   Teacher t2 = new Teacher( "Aysel Hoca","9086567","Fizik");
   Teacher t3 = new Teacher( "Neşe Hoca","9086567","Biyoloji");

        Course tarih= new Course("Tarih","101","TRH");
        tarih.addTeacher(t1);


        System.out.println(); // bir satır boşluk bırakmak için yazıldı
        Course fizik= new Course("Fizik","102","FZK");
        fizik.addTeacher(t2);

        System.out.println();
        Course biyoloji= new Course("Biyoloji","103","BİO");
        biyoloji.addTeacher(t3);

        System.out.println();
        // teacher classında yer alan bilgileri Course classı ile bağlantılı hale getirdik.

        Student s1= new Student("ALİ", "123","4",tarih, fizik, biyoloji);
        s1.addBulkExamsNote(100,200,38);
        s1.printNote();
        s1.isPass();

        Student s2= new Student("VELİ", "345","4",tarih, fizik, biyoloji);
        s2.addBulkExamsNote(100,50,70);
        s2.printNote();
        s2.isPass();
    }


}
