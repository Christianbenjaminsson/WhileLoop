package com.example.whileloop;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("How many times do you want to test this while-loop: ");
        int input = scan.nextInt();

        boolean quit = false;

        while(!quit) {
            for(int i =1; i <= input; i++) {
                System.out.println("If you can read this everything works");
            }
            quit = true;
        }
    }
}
