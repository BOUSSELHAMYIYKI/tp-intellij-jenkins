package org.example;

import java.util.Scanner;

public class tp1 {

    public static int calculerAgeFuture(int age) {
        return age + 10;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //jgdhjfehjzgdhj

        System.out.print("دخل الاسم ديالك: ");
        String nom = sc.nextLine();

        System.out.print("دخل العمر ديالك: ");
        int age = sc.nextInt();

        int ageFuture = calculerAgeFuture(age);

        System.out.println("مرحبا " + nom);
        System.out.println("العمر ديالك دابا: " + age);
        System.out.println("العمر ديالك من بعد 10 سنين: " + ageFuture);

        sc.close();
    }
}
