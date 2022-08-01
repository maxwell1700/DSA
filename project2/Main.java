package project2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Scanner base = new Scanner(System.in);
//        int b = base.nextInt();
//
//        Scanner height = new Scanner(System.in);
//        int h = height.nextInt();
//
//        int result = (b * h) / 2;
//        System.out.println(result);

//        Scanner sc = new Scanner(System.in);
//        int radius = sc.nextInt();
//
//        double result = Math.PI * Math.pow(radius, 2);
//        System.out.println(result);

//        Scanner sc = new Scanner(System.in);
//        int h = sc.nextInt();
//
//        Scanner sc2 = new Scanner(System.in);
//        int l = sc2.nextInt();
//
//        int result = l * h;
//
//        System.out.println(result);
//        Scanner sc = new Scanner(System.in);
//        int side = sc.nextInt();
//
//        double result = (Math.sqrt(3)/4)*Math.pow(side, 2);
//        System.out.println(result);


//        Scanner sc = new Scanner(System.in);
//        int radius = sc.nextInt();
//
//        double result = (4 * Math.PI * Math.pow(radius, 3)) / 3;
//        System.out.println(result);

        // fibonacci(10);

        //System.out.println(25/10);

        prodAndSumCalc(234);

        //factors(24);

        //largestNumber();

        //factorial(9);

        //average(10);

        //hcf(100, 28);

    }


    public static void fibonacci(int range) {
        int n1 = 0;
        int n2 = 1;

        int result = 0;

        System.out.println(n1);
        System.out.println(n2);

        for (int i = 0; i < range; i++) {

            result = n1 + n2;
            System.out.println(result);
            n1 = n2;
            n2 = result;
        }
    }

    public static void prodAndSumCalc(int number) {
        int prodRes = 1, sumRes = 0;

        while (number > 0) {
            prodRes *= number % 10;
            sumRes += number % 10;
            number /= 10;
        }
        int answer = prodRes - sumRes;
        System.out.println(answer);


//        int prodNum, sumNum, prodRes = 1, sumRes = 0;
//
//        prodNum = number;
//        sumNum = number;
//
//        while(prodNum != 0 && sumNum != 0){
//            int remainderProd = prodNum % 10;
//            prodRes *= remainderProd;
//            prodNum /= 10;
//
//            int remainderSum = sumNum % 10;
//            sumRes += remainderSum;
//            sumNum /= 10;
//        }
//        int answer = prodRes - sumRes;
//        System.out.println(answer);


    }

    public static void factors(int number) {
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }

    public static void random() {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        int x = sc.nextInt();

        while (x > 0) {

            sum += x;
            x = sc.nextInt();
        }
        System.out.println(sum);
    }

    public static void largestNumber() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        while (num > 0) {

            Scanner sc2 = new Scanner(System.in);
            int max = sc2.nextInt();

            if (max > num) {
                num = max;
            } else if (max == 0) {
                System.out.println(num);
                num = max;

            }
        }
    }


    public static void factorial(int number) {
        int ans = 1;

        for (int i = 1; i <= number; i++) {
            ans *= i;
        }
        System.out.println(ans);
    }

    public static void average(int range) {
        int count = 0, sum = 0, average;

        while (count < range) {
            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();
            count++;
            sum += number;
        }
        average = sum / count;
        System.out.println(average);

    }


    public static void hcf(int num1, int num2) {
        int ans = 0;
        int max = 0;
        int lcm;
        int range = Math.min(num1, num2);
        for (int i = 1; i <= range; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                max = i;

                if (ans < max) {
                    ans = i;
                }

            }


        }
        System.out.println(ans);
        lcm = (num1 * num2)/ans;
        System.out.println(lcm);



    }


}