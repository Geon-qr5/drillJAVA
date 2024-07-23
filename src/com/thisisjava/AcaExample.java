package com.thisisjava;

public class AcaExample {
    public void lotto() {
        /*
         * 1~47까지의 수중 무작위 수를 추출하여
         * 6개의 수를 추출한다
         * 단, 중복되는 수는 다시 추출한다
         */

        int[] lotto = new int[6];

        System.out.println("로또번호를 생성합니다.");

        for (int i = 0; i < lotto.length; i++) {
            lotto[i] = (int) (Math.random() * 47) + 1;
            for (int j = 0; j < i; j++) {
                if (lotto[i] == lotto[j]) {
                    System.out.printf("%d는 중복된 수입니다.\n", lotto[j]);
                    i--;
                }
            }
        }
        for (int i = 0; i < lotto.length; i++) {
            System.out.print(lotto[i]);
            if (i < (lotto.length - 1)) {
                System.out.print(" ");
            }
        }
        System.out.println();

    }

    public void numberSum() {
        /*
         * 1~100까지의 수를 20개 추출하여
         * 나열하고, 합계를 계산한다.
         */
        int[] num = new int[20];
        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * 100) + 1;
        }
        int sum = 0;
        for (int i : num) {
            sum += i;
            System.out.println(i);
        }
        System.out.println("합계 : " + sum);
    }

    public void dice() {
        /*
         * 주사위 2개를 이용하여 5번 굴리는 게임
         * (num1,num2),...
         */
        for (int i = 1; i <= 5; i++) {
            int num1, num2;
            num1 = (int) (Math.random() * 6) + 1;
            num2 = (int) (Math.random() * 6) + 1;
            System.out.println(i + "번째 게임");
            System.out.printf("(%d, %d)\n", num1, num2);

        }
        System.out.println("게임을 종료합니다.");

    }

    public void lotto2() {
        /*
         * 1~47까지의 수중 무작위 수를 추출하여
         * 6개의 수를 추출한다
         * 단, 중복되는 수는 다시 추출한다
         */
        int[] lotto = new int[6];

        for (int i = 0; i < lotto.length; i++) {
            lotto[i] = (int) (Math.random() * 47) + 1;
            System.out.printf("%d번째 뽑은 수는 %d입니다.\n", i + 1, lotto[i]);
            for (int j = 0; j < i; j++) {
                if (lotto[i] == lotto[j]) {
                    System.out.printf("%d는 중복된 번호입니다. 다시 추첨합니다.\n", lotto[i]);
                    lotto[i] = (int) (Math.random() * 47) + 1;
                }
            }
        }

        System.out.print("축하합니다. 이번 로또 당첨번호는 ");
        for (int i : lotto) {
            System.out.print(i + " ");
        }
        System.out.println("입니다.");
    }

    public void numberSum2() {
        /*
         * 1~100까지의 수를 20개 추출하여
         * 나열하고, 합계를 계산한다.
         */

        int[] numSum = new int[20];
        for (int i = 0; i < numSum.length; i++) {
            numSum[i] = (int) (Math.random() * 100) + 1;
        }
        int sum = 0;
        for (int i : numSum) {
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println("\n합계 : " + sum);
    }

    public void dice2() {
        /*
         * 주사위 2개를 이용하여 5번 굴리는 게임
         * (num1,num2),...
         */
        int[] num1 = new int[5];
        int[] num2 = new int[5];

        for (int i = 0; i < 5; i++) {
            num1[i] = (int) (Math.random() * 6) + 1;
            num2[i] = (int) (Math.random() * 6) + 1;
            System.out.printf("(%d, %d)", num1[i], num2[i]);
        }
    }
}
