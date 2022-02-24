package com.company;

import com.company.catalog.*;

import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Student student = new Student();
        Teacher teacher = new Teacher();

        ArrayList<Teacher> teacherList = new ArrayList<Teacher>();

//        Scanner cin = new Scanner(System.in);

        System.out.print("n = 2");

//        int n = cin.nextInt();

//        for(int i = 0; i < n; i++){
////            int x = cin.nextInt();
////            System.out.println(x);
////
////        }

        teacherList = (ArrayList<Teacher>) teacher.read_n_teachers(2);

        teacher.print_n_teachers(teacherList);

	// write your code here
    }
}
