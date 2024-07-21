package com.thisisjava;

import java.util.Scanner;

public class Example1 {
    Scanner scan = new Scanner(System.in);

    public void ex01() {
        int x = -100;
        x = -x;
        System.out.println("x : " + x);

        byte b = 100;
        int y = -b;
        System.out.println("y : " + y);
    }

    public void ex02() {
        int x = 5;
        double y = 0.0;
        double z = x / y;
        // double z = x % y;
        System.out.println(z + 2);

        if (Double.isInfinite(z) || Double.isNaN(z)) {
            System.out.println("값 산출 불가");
        } else {
            System.out.println(z + 2);
        }
    }

    public void ex03() {
        int pencils = 534;
        int students = 30;

        int pencilsPerStudent = pencils / students;
        System.out.println(pencilsPerStudent);

        int pencilsLeft = pencils % students;
        System.out.println(pencilsLeft);

        int value = 356;
        value = value / 100 * 100;
        System.out.println(value);
    }

    public void ex04() {
        for (int line = 1; line < 6; line++) {
            for (int i = 5; i > line; i--) {
                System.out.print(" ");
            }
            for (int j = 0; j < line; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void ex05() {
        int money = 0;

        while (true) {
            System.out.println("---------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("---------------------------------");
            System.out.print("선택> ");
            String num = scan.nextLine();

            switch (num) {
                case "1":
                    System.out.print("예금액> ");
                    money += Integer.parseInt(scan.nextLine());
                    break;
                case "2":
                    System.out.print("출금액> ");
                    money -= Integer.parseInt(scan.nextLine());
                    break;
                case "3":
                    System.out.printf("잔고> %d\n", money);
                    break;

                default:
                    System.out.println("프로그램 종료");
                    System.exit(-1);
                    break;
            }

        }
    }

}
