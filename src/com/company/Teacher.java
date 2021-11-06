package com.company;
public class Teacher {
    String name;
    String mpno; //mobil phone no kısaltması
    String branch;

    // Şimdi constructor tanımlayacağız. Constructorlar Class ile aynı isme sahip olan herhangi bir döndürme tipi olmayan yapılardı.

    Teacher(String name, String mpno, String branch){
        this.name=name;
        this.mpno=mpno;
        this.branch=branch;
    }

    void print(){ // void print bir methoddur.
        System.out.println("Name:" +this.name);
        System.out.println("Phone number:" +this.mpno);
        System.out.println("Branch:" +this.branch);
    }

}

