package com.example.demo.demo05;

import java.util.Scanner;

public class demo4 {
    public static void main(String[] args) {

        String phrase = new String("this is a String test");
        String middle3 = phrase.substring((phrase.length()/2-2),(phrase.length()/2)+1);
        System.out.println(middle3);
        int phraseLenght;
        int middleIndex;
        String firstHalf;
        String secondHalf;
        String switchedPhrase;
        "asd".equals

        phraseLenght = phrase.length();
        middleIndex = phraseLenght / 2;
        firstHalf = phrase.substring(0,middleIndex);
        secondHalf = phrase.substring(middleIndex,phraseLenght);

        switchedPhrase = secondHalf.concat(firstHalf);

        String switchPhrase = switchedPhrase.replace(" ","*");
        System.out.println(switchPhrase);

        System.out.println();
        System.out.println("Original phrase:" + phrase);
        System.out.println("Lenght of the phrase:"+phraseLenght+"characters");
        System.out.println("Index of the middle :" + middleIndex);
        System.out.println("Character at the middle index:"+phrase.charAt(middleIndex));
        System.out.println("switched phrase:" + switchedPhrase);
        System.out.println();

        String city,state;
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入城市");
        city = scan.nextLine();

        System.out.println("请输入国家");
        state = scan.nextLine();

        System.out.println(state.toUpperCase()+city.toLowerCase()+state.toUpperCase());
    }
}
