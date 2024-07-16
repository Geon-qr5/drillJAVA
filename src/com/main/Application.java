package com.main;

import com.section01.ValuePrinter;

public class Application {
    public static void main(String[] args) {
        ValuePrinter vp = new ValuePrinter();
        com.section01.print2 ad = new com.section01.print2();
        vp.out(); 
        ad.out();
        ad.out();
    }
}
