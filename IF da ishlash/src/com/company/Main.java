package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

        System.out.println("a");
        int a = scanner.nextInt();
        System.out.println("B=");
        int b = scanner.nextInt();
        System.out.println("C =");
        int c = scanner.nextInt();


        if (a > b && a > c){
            if (b>c) {
                System.out.println(a+b);

            }else {
                System.out.println(a+c);

            }
        }else if (b > a&& b>c) {
            if (a > c){
                System.out.println(a+b);


            }else {
                System.out.println(b+c);

            }


        }else {
            if (a>b){
                System.out.println(c+b);

            }else {
                if (a>b){

                }else {
                    System.out.println(b+c);

                }
            }
        }

    }
}
