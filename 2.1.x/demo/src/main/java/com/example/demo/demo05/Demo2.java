package com.example.demo.demo05;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        double side1,side2;
        double hypotenuse;
        Scanner scan = new Scanner(System.in);
        System.out.println("Pleace enter the lenght of the tow sides of a right triangle ");
        side1 = scan.nextDouble();
        side2 = scan.nextDouble();
        hypotenuse = Math.sqrt(Math.pow(side1,2)+Math.pow(side2,2));
        System.out.println("Lenght of the hypotenuse:"+hypotenuse);
    }
}
