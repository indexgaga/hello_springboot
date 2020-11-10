package com.example.demo.demo05;

import java.util.Random;

public class Demo3 {
    public static void main(String[] args) {
        Random random = new Random();
        int lucky1,lucky2,lucky3;
        lucky1 = Math.abs(random.nextInt())%30 + 50;
        lucky2 = random.nextInt(10)+91;
        lucky3 = (int)(random.nextFloat()*19) + 11;

        System.out.println(lucky1);
        System.out.println(lucky2);
        System.out.println(lucky3);
    }
}
