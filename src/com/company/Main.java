package com.company;

import static java.lang.Math.abs;

public class Main {

    public static void main(String[] args) {
        int ten = 10;

        double a = 8.5;
        double b = 11.45;


        double y = 9.5;
        double z = 11.11;

        System.out.println((abs(ten-a)>abs(ten-b)) ? "Число b  " + b + " ближе к 10-ти" : "число a " + a +" ближе");
        System.out.println((abs(ten-y)>abs(ten-z)) ? "Число z  " + z + " ближе к 10-ти" : "число y " + y +" ближе");


    }
}
