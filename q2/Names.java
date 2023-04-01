package com.company.A;

import java.util.Scanner;

public class Names {
    private static String first[];
    private static String last[];
    private static Scanner input;


    public static void main(String [] args){
        input = new Scanner(System.in);
        System.out.print("Please enter how many students : "); int size = input.nextInt();
        first = new String[size];
        last = new String[size];
        for (int i = 0; i < size ; i++){
            first[i] = input.next();
            last[i] = input.next();
        }

        System.out.println("The Students names are:");
        for (int i = 0; i < size ; i++){
            System.out.println("Student "+i+" : "+first[i]+" "+last[i]);
        }



        int nNameMohammed = 0;
        for (int i = 0; i < first.length ; i++){
            if ("Mohammed".equals(first[i])){
                nNameMohammed++;
            }
        }
        System.out.println("There are "+nNameMohammed+" Student with first name \"Mohammed\"");



        int nStudent = 0;
        String []Vfirst = new String[size];
        String []Vlast = new String[size];
        for (int i = 0; i < last.length ; i++){
            if (!last[i].toUpperCase().startsWith("AL")){
                Vfirst[nStudent] = first[i];
                Vlast[nStudent] = last[i];
                nStudent++;
            }
        }
        System.out.println("the student with last name not beginning with \"AL\" are:");
        for (int i = 0; i < nStudent ; i++){
            System.out.println("Student "+i+" : "+Vfirst[i]+" "+Vlast[i]);
        }
    }



}
