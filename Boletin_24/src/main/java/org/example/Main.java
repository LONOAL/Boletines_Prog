package org.example;

import com.lorenzo.datos.getters;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Libro> listaXog= new ArrayList<>();
        Metodos obx=new Metodos();
        int op;
        do{
            op= getters.getInt("**** MENU **** \n 1--> ENGADIR LIBRO \n 2--> AMOSAR \n 3-->VENDER \n 4--> BORRAR XOGADOR \nteclea una opcion : ");
            switch(op){
                case 1:obx.engadir(listaXog);
                    break;
                case 2:obx.amosar(listaXog);
                    break;
                case 3:obx.vender(listaXog);
                    break;
                case 4:
                    System.out.println("XD");

                default: System.out.println(" OPCION INCORRECTA ");

            }
        }while(op<=4);
    }
}