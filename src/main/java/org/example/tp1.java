package org.example;

import java.util.Scanner;

public class tp1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("دخل الاسم ديالك: ");
        String nom = sc.nextLine();

        System.out.print("دخل العمر ديالك: ");
        int age = sc.nextInt();

        int ageFuture = age + 10;

        System.out.println("مرحبا " + nom);
        System.out.println("العمر ديالك دابا: " + age);
        System.out.println("العمر ديالك من بعد 10 سنين: " + ageFuture);

        sc.close();
    }
}