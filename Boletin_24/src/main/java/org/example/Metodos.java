package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import com.lorenzo.datos.getters;

public class Metodos {

    public ArrayList<Libro> engadir(ArrayList<Libro>lista){
        Libro lib = new Libro(getters.getString("titulo: "),getters.getString("autor: "),getters.getString("ISBN: "),getters.getFloat("prezo: "),getters.getInt("unidades: "));
        lista.add(lib);
        return lista;
    }
    public void amosar(ArrayList<Libro>lista){
        Collections.sort(lista);
        Iterator it= lista.iterator();
        while(it.hasNext()){
        System.out.println(it.next());
        }
    }
    public void vender(ArrayList<Libro>lista){
        String tituloBorrar= getters.getString(" Introduce o titulo do libro a vender: ");
        Iterator it= lista.iterator();
        Libro lib;
        while(it.hasNext()){
            lib=(Libro)it.next();
            if(lib.getTitulo().equalsIgnoreCase(tituloBorrar))
                it.remove();
        }
        }





}
