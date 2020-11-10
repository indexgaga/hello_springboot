package com.example.demo.demo05;

public class demo1 {
    public static void main(String[] args) {
        String college = new String("PoDunk College");

        int stringLenght;
        String change1, change2, change3;
        String town = "Anytown, USA";
        stringLenght = college.length();
        System.out.println(college + "contains" + stringLenght + "characters.");

        change1 = college.toUpperCase();
        change2 = college.replace("O", "*");
        change3 = college.concat(town);

        System.out.println("THE final string is"+change3);

    }

}
