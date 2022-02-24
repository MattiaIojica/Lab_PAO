package com.company.catalog;

import java.util.*;
import java.io.*;

public class Teacher extends Person {

    private int id;
    private int number_of_curses;


    public Teacher(){}

    public Teacher(int id, String nume, String prenume, int varsta, Character s, int nr){
        this.id = id;
        this.setFirst_name(nume);
        this.setLast_name(prenume);
        this.setAge(varsta);
        this.setSex(s);
        this.number_of_curses = nr;
    }

    public Teacher(Person p, int id, int nr){
        this.setFirst_name(p.getFirst_name());
        this.setLast_name(p.getLast_name());
        this.setAge(p.getAge());
        this.setSex(p.getSex());
        this.id = id;
        this.number_of_curses = nr;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumber_of_curses(int number_of_curses) {
        this.number_of_curses = number_of_curses;
    }

    public int getId() {
        return id;
    }

    public int getNumber_of_curses() {
        return number_of_curses;
    }

    public static List<Teacher> read_n_teachers(int n) throws FileNotFoundException {

        ArrayList <Teacher> teacherList = new ArrayList<Teacher>();

        File myObj = new File("date.in");
        Scanner cin = new Scanner(myObj);

        for(int i = 0; i < n; i++){
//            System.out.println("Teacher " + (i + 1) + ":");
            int age, id, nr;
            String nume, prenume;
            Character s;

//            System.out.print("id : ");
            id = cin.nextInt();

//            System.out.print("nume : ");
            nume = cin.next();

//            System.out.print("prenume : ");
            prenume = cin.next();

//            System.out.print("varsta : ");
            age = cin.nextInt();

//            System.out.print("sex : ");
            s = cin.next().charAt(0);

//            System.out.print("Number of curses : ");
            nr = cin.nextInt();

            Person p = new Person(nume, prenume, age, s);
            Teacher t = new Teacher(p, id, nr);

            teacherList.add(t);

            System.out.println();
        }

        return teacherList;
    }

    public static void print_n_teachers(List<Teacher>t){

        int nr = 0;
        for(int i = 0; i < t.size(); i++) {
            System.out.println("Teacher " + (++nr) + ":");
            System.out.print(t.get(i).getId() + " ");
            System.out.print(t.get(i).getFirst_name() + " ");
            System.out.print(t.get(i).getLast_name() + " ");
            System.out.print(t.get(i).getAge() + " ");
            System.out.print(t.get(i).getSex() + " ");
            System.out.println(t.get(i).getNumber_of_curses());
            System.out.println();
        }
    }
}
