/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.boletin5;

/**
 *
 * @author PC-LORENZO
 */
public class consumo {
    private float km;
    private float litros;
    private int vMed;
    private float pGas;

public consumo (float km, float litros, int vMed, float pGas){
    this.km= km;
    this.litros= litros;
    this.vMed= vMed;
    this.pGas= pGas;
    
}    
public consumo (){
    
}
public void setKms (float kms){
  km=kms;  
}
public void setLitros (float l){
  litros=l;  
}
public void setvMed (int vel){
  vMed=vel;  
}
public void setpGas (float precio){
  pGas=precio;  
}

public float getTempo(){
    return (1/vMed*km);
}

public int getvMed(){
    return vMed;
}

public void consumoMedio(){
    float consumomedio= litros*(km/100);
    System.out.println(consumomedio);
}
public void consumoEuros(){
    float consumoEuros= litros*pGas;
    System.out.println(consumoEuros);
}
}
