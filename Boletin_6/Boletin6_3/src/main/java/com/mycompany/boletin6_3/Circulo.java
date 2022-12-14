/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.boletin6_3;

/**
 *
 * @author PC-LORENZO
 */
public class Circulo {
    private double radio;
    final private double pi= Math.PI;

public Circulo(){
    
}
public Circulo(double radio){
    this.radio=radio;
    
}
public void setRadio (double rad){
    radio=rad;
}
public double getRadio(){
    return radio;
}

public double calcularArea(){
    double area=pi*Math.pow(radio, 2);
        return area;
}
public double calcularLonxitude(){
    double lonxitude=pi*2*radio;
        return lonxitude;
}
}
