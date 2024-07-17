package com.thisisjava;

public class Example {
    public void ex01() {
        int hour = 3;
        int minute = 5;
        System.out.println(hour + "시간" + minute + "분");
        int totalMinute = (hour * 60) + minute;
        System.out.println("총 " + totalMinute + "분");
    }

    public void ex02() {
        int x = 3;
        int y = 5;
        System.out.println("x : " + x + ", y : " + y);

        int temp = x;
        x = y;
        y = temp;
        System.out.println("x : " + x + ", y : " + y);
    }

    public void ex03() {
        int var1 = 0b1011;
        int var2 = 0206;
        int var3 = 365;
        int var4 = 0xB3;

        System.out.println("var1 : " + var1);
        System.out.println("var2 : " + var2);
        System.out.println("var3 : " + var3);
        System.out.println("var4 : " + var4);
    }

    public void ex04() {
        char c1 = 'A';
        char c2 = 65;
        char c3 = '가';
        char c4 = 44032;

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
    }

    public void ex05() {
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

    public void ex06() {
        boolean stop = true;
        if (stop) {
            System.out.println("중지합니다.");
        } else {
            System.out.println("시작합니다.");
        }

        int x = 10;
        boolean result1 = (x == 20);
        boolean result2 = (x != 20);
        System.out.println("result1 : " + result1);
        System.out.println("result2 : " + result2);
    }

    public void ex07() {
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

    public void ex08() {
        String str1 = "" + "{\n" + "\t\"id\":\"winter\",\n" + "\t\"name\":\"눈송이\",\n"
                + "}";
        String str2 = """
                {
                "id":"winter"
                "name":"눈송이"
                }
                """;

        System.out.println(str1);
        System.out.println("----------------------------");
        System.out.println(str2);
        System.out.println("----------------------------");

        String str = """
                나는 자바를 \
                학습합니다.
                나는 자바 고수가 될 겁니다.
                """;
        System.out.println(str);
    }

    public void ex09() {
        byte byteValue = 10;
        int intValue = byteValue;
        System.out.println("intValue : " + intValue);

        char charValue = '가';
        intValue = charValue;
        System.out.println("가의 유니코드 : " + intValue);

        intValue = 50;
        long longValue = intValue;
        System.out.println("longValue : " + longValue);

        longValue = 100;
        float floatValue = longValue;
        System.out.println("floatValue : " + floatValue);

        floatValue = 100.5f;
        double doubleValue = floatValue;
        System.out.println("doubleValue : " + doubleValue);
    }

    public void ex10() {
        int var1 = 10;
        byte var2 = (byte) var1;
        System.out.println(var2);

        long var3 = 300;
        int var4 = (int) var3;
        System.out.println(var4);

        int var5 = 65;
        char var6 = (char) var5;
        System.out.println(var6);

        double var7 = 3.14;
        int var8 = (int) var7;
        System.out.println(var8);
    }

    public void ex11() {
        byte result1 = 10 + 20;
        System.out.println("result1 : " + result1);
        
        byte v1 = 10;
        byte v2 = 20;
        int result2 = v1 + v2;
        System.out.println("result2 : " + result2);

        byte v3 = 10;
        int v4 = 100;
        long v5 = 1000l;
        long result3 = v3 + v4 + v5;
        System.out.println("result3 : " + result3);

        char v6 = 'A';
        char v7 = 1;
        int result4 = v6 + v7;
        System.out.println("result4 : " + result4);
        System.out.println("result4 : " + (char) result4);

        int v8 = 8;
        int result5 = v8 / 4;
        System.out.println("result5 : " + result5);

        int v9 = 10;
        double result6 = v9 / 4.0;
        System.out.println("result6 : " + result6);

        int v10 = 1;
        int v11 = 2;
        double result7 = (double) v10 / v11;
        System.out.println("result7 : " + result7);
    }

    public void ex12(){
        int result1 = 10 + 2 + 8;
        System.out.println("result1 : " + result1);

        String result2 = 10 + 2 + "8";
        System.out.println("result2 : " + result2);
        
        
        String result3 = 10 + "2" + 8;
        System.out.println("result3 : " + result3);
        
        String result4 = "10" + 2 + 8;
        System.out.println("result4 : " + result4);
        
        String result5 = "10" + ( 2 + 8 );
        System.out.println("result5 : " + result5);
    }

    public void ex13(){
        int value1  = Integer.parseInt("10");
        double value2 = Double.parseDouble("3.14");
        boolean value3 = Boolean.parseBoolean("true");

        System.out.println("value1 : " + value1);
        System.out.println("value2 : " + value2);
        System.out.println("value3 : " + value3);

        String str1 = String.valueOf(10);
        String str2 = String.valueOf(3.14);
        String str3 = String.valueOf(true);

        System.out.println("str1 : " + str1);
        System.out.println("str2 : " + str2);
        System.out.println("str3 : " + str3);

    }
}