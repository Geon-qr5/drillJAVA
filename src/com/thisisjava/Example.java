package com.thisisjava;

public class Example {
    public void ex01() {
        int hour = 3;
        int minute = 5;
        System.out.println(hour+"시간"+minute+"분");
        int totalMinute = ( hour * 60 ) + minute;
        System.out.println("총 "+totalMinute+"분");
    }

    public void ex02(){
        int x = 3;
        int y = 5;
        System.out.println("x : " + x + ", y : " + y);
        
        int temp = x;
        x = y;
        y = temp;
        System.out.println("x : " + x + ", y : " + y);
    }

    public void ex03(){
        int var1 = 0b1011;
        int var2 = 0206;
        int var3 = 365;
        int var4 = 0xB3;

        System.out.println("var1 : "+var1);
        System.out.println("var2 : "+var2);
        System.out.println("var3 : "+var3);
        System.out.println("var4 : "+var4);
    }

    public void ex04(){
        char c1 = 'A';
        char c2 = 65;
        char c3 = '가';
        char c4 = 44032;

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
    }

    public void ex05(){
        float var1 = 0.1234567890123456789f;
        double var2 = 0.1234567890123456789;
        System.out.println("var1 : " + var1);
        System.out.println("var2 : " + var2);
        
        double var3 = 3e6;
        float var4 = 3e6F;
        double var5 = 2e-3;
        System.out.println("var3 : " + var3);
        System.out.println("var4 : " + var4);
        System.out.println("var5 : " + var5);        
    }

    public void ex06(){
        boolean stop = true;
        if(stop) {
            System.out.println("중지합니다.");
        } else {
            System.out.println("시작합니다.");
        }

        int x = 10;
        boolean result1 = (x ==20);
        boolean result2 = (x !=20);
        System.out.println("result1 : " + result1);
        System.out.println("result2 : " + result2);
    }

    public void ex07(){
        String name = "홍길동";
        String job = "프로그래머";
        System.out.println(name);
        System.out.println(job);

        String str = "나는 \"자바\"를 배웁니다.";
        System.out.println(str);
        
        str = "번호\t이름\t직업";
        System.out.println(str);
        
        System.out.print("나는\n");
        System.out.print("자바를\n");
        System.out.print("배웁니다.\n");
    }
}
