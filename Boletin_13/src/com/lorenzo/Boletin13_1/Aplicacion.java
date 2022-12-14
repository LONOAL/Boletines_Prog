package com.lorenzo.Boletin13_1;

import com.lorenzo.Boletin13_2.Persoal;

public class Aplicacion {
    public static void main(String[] args) {
        Persoal alum= new Persoal("lorenzo@danielcastelao.org",666666666);
        Academica obx= new Academica("Lorenzo",10, alum);
        System.out.println(obx.toString());

    }
}
