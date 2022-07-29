package com.company;

import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);

        System.out.println("Enter number here: " );
        int num = sc.nextInt();

        String result = num % 2 == 0 ? "even number" : "odd number";
        System.out.println(result);

        greeting("max");

        interest();
        calculations(5,7, "-");
        largestNum(300, 400);
        Currency();
        palindrome();
        */
        // evenDays(31);

        allCalc(6);


    }


    public static void greeting(String name) {
        System.out.println("Hello " + name);

    }

    public static void interest() {
        Scanner input = new Scanner(System.in);

        System.out.println("enter principal: ");
        int p = input.nextInt();
        System.out.println("enter time: ");
        int t = input.nextInt();
        System.out.println("enter rate: ");
        int r = input.nextInt();

        int interest = p * r * t;

        System.out.println("you interest is " + interest);


    }

    public static void calculations(int a, int b, String op) {
        int result = 0;
        switch (op) {
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
        }
        System.out.println(result);
    }

    public static void largestNum(int a, int b) {
        if (a > b) {
            System.out.println(a);
        } else if (a < b) {
            System.out.println(b);
        } else {
            System.out.println("both numbers are the same");
        }
    }

    public static void Currency() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rupees: ");
        int a = sc.nextInt();
        float usd = a * 0.013f;
        System.out.println(a + " rupees, is " + usd + " USD");
    }


    public static void fib(int range) {
        int firstNum = 0;
        int secondNUm = 1;
        int sum = 0;
        System.out.println(firstNum);
        System.out.println(secondNUm);

        for (int i = 2; i < range; i++) {

            sum = firstNum + secondNUm;
            System.out.println(sum);
            firstNum = secondNUm;
            secondNUm = sum;
        }
    }

    public static void palindrome() {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.next());

        if (sb.toString().equals(sb.reverse().toString())) {
            System.out.println("palindrome");
        } else {
            System.out.println("no palindrome");
        }

    }

    public static void armstrong() {
        int tempNumber, remainder, result;
        for (int originalNumber = 0; originalNumber < 1000; originalNumber++) {
            tempNumber = originalNumber;
            result = 0;
            while (tempNumber != 0) {
                remainder = tempNumber % 10;
                result += Math.pow(remainder, 3);
                tempNumber /= 10;
            }

            if (result == originalNumber) {
                System.out.println(originalNumber + " armstrong");
            }
        }
    }


    public static void evenDays(int days) {
        int count = 0;
        for (int i = 1; i <= days; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);

    }

    public static void allCalc(int n) {
        int[] a = new int[n];
        for (int i = 0; i <= n; i++)
        {

            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            a[i] = num;
            if (num == 0)
            {
                i = n + 1;
            }
        }
        int sum = Arrays.stream(a).sum();
        System.out.println(sum);
    }

}


