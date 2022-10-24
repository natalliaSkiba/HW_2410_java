package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введите целое число");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

       int result =0;
        for (int i = 1; i <= a; i++) {
           result = i + result;
        }
        System.out.println("Результат сложения равен : " + result);

    }
}